/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2013, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.smbt.ui.btc.views;

import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.logging.page.SmbtLogConsoleFactory;

import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.views.properties.PropertySheet;

public class BitcoinPerspective implements IPerspectiveFactory {
	public final static String BitcoinPerspectiveID = "net.sf.smbt.ui.btcPerspective";

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		layout.setFixed(false);
		
		IFolderLayout projectFolderLayout = layout.createFolder("projectFolder", IPageLayout.TOP, 0.33f, editorArea);
		//projectFolderLayout.addView("net.sf.smbt.ui.btc.chart");
		projectFolderLayout.addView("net.sf.smbt.ui.btc.transactions");
		projectFolderLayout.addView("net.sf.smbt.ui.navigator");
		
		IFolderLayout consoleFolderLayout = layout.createFolder("consoleFolder", IPageLayout.BOTTOM, 0.66f, "projectFolder");
		consoleFolderLayout.addView("org.eclipse.ui.console.ConsoleView");
		
		IFolderLayout topologyFolderLayout = layout.createFolder("topologyFolder", IPageLayout.RIGHT, 0.5f, "projectFolder");
		topologyFolderLayout.addView("net.sf.smbt.ui.views.EZQTopologyView");

		IFolderLayout rightFolder = layout.createFolder("tradeFolder", IPageLayout.BOTTOM, 0.5f, "topologyFolder");
		rightFolder.addView("net.sf.smbt.ui.btc.trade");
		//rightFolder.addView("org.eclipse.ui.defaultBrowser");
		//rightFolder.addView("org.eclipse.ui.browser");
		
		IFolderLayout walletFolder = layout.createFolder("walletFolder", IPageLayout.RIGHT, 0.5f, "consoleFolder");
		walletFolder.addView("net.sf.smbt.ui.btc.wallet");
		
		try {
		
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			if (window != null) {
				IWorkbenchPage page = window.getActivePage();
				if (page != null) {
					IViewPart viewPart = page.showView("net.sf.smbt.ui.navigator");
					if (viewPart instanceof CommonNavigator) {
						CommonNavigator view = (CommonNavigator) viewPart;
						view.getCommonViewer().getControl().setBackground(GUIToolkit.BG);
						view.getCommonViewer().getControl().setForeground(GUIToolkit.FG);
					}
					viewPart = page.showView(IPageLayout.ID_PROP_SHEET);
					if (viewPart instanceof PropertySheet) {
						PropertySheet view = (PropertySheet) viewPart;
						Control control = view.getCurrentPage().getControl();
						if (control != null) {
							control.setBackground(GUIToolkit.BG);
							control.setForeground(GUIToolkit.FG);
						}
						control = view.getDefaultPage().getControl();
						if (control != null) {
							control.setBackground(GUIToolkit.BG);
							control.setForeground(GUIToolkit.FG);
						}
					}
				}
			}
		} catch (PartInitException e) {
			e.printStackTrace();
		}

		new SmbtLogConsoleFactory().openConsole();
		//new SmbtConsoleFactory().openConsole();
		new SmbtLogConsoleFactory().openConsole();
	}
}





