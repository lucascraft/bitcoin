/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012 - 2013, Lucas Bigeardel
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

package net.sf.smbt.ui.btc.pools.ui.properties;

import net.sf.smbt.btc.pools.bitminter.BitMinterConfig;
import net.sf.smbt.ui.hmi.GUIToolkit;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class BitMinterInfoPropertySection extends AbstractPropertySection {
	private BitMinterConfig bitMinterConfig;

	private Text idText;
	private Text titleText;
	private Text feedText;
	private Text descText;
	private Text createdText;
	private Text creatorText;
	private Text tagsText;
	private Text emailText;
	
	public BitMinterInfoPropertySection() {}
	
	public BitMinterConfig getBitMinterConfig() {
		return bitMinterConfig;
	}
	
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		aTabbedPropertySheetPage.getControl().setBackground(GUIToolkit.BG);
		
		parent.setLayout(GridLayoutFactory.fillDefaults().create());
		parent.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		parent.setBackground(GUIToolkit.BG);
		parent.getParent().setBackground(GUIToolkit.BG);
		parent.getParent().getParent().setBackground(GUIToolkit.BG);

		SashForm container = new SashForm(parent, SWT.HORIZONTAL);
		container.setBackground(GUIToolkit.BG);
		
		createFixturesView(container);
		
		container.setWeights(new int[]{1, 2});
	}

	
//	private ListViewer streamListViewer;

	private void createFixturesView(Composite container) {
		
		Composite leftBag = new Composite(container, SWT.NONE);
		leftBag.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		leftBag.setLayoutData(GridDataFactory.fillDefaults().minSize(300, SWT.DEFAULT).grab(true, true).create());
		leftBag.setBackground(GUIToolkit.BG);
		
	    //
	    // ID
	    //
		Label IDLabel = new Label(leftBag, SWT.NONE);
		IDLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
		IDLabel.setText("ID : ");
		IDLabel.setForeground(GUIToolkit.FG);
	    
	    idText = new Text(leftBag, SWT.SINGLE);
	    idText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    idText.setBackground(GUIToolkit.BG);
	    idText.setForeground(GUIToolkit.FG);
	    idText.setText("");
	    
	    //
	    // Title
	    //
		Label titleLabel = new Label(leftBag, SWT.NONE);
		titleLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
		titleLabel.setText("Title : ");
		titleLabel.setForeground(GUIToolkit.FG);
	    
		titleText = new Text(leftBag, SWT.SINGLE);
		titleText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
		titleText.setBackground(GUIToolkit.BG);
		titleText.setForeground(GUIToolkit.FG);
	    titleText.setText("");
	    
	    //
	    // Feed
	    //
		Label feedLabel = new Label(leftBag, SWT.NONE);
		feedLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
		feedLabel.setText("Feed : ");
		feedLabel.setForeground(GUIToolkit.FG);
	    
	    feedText = new Text(leftBag, SWT.SINGLE);
	    feedText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    feedText.setBackground(GUIToolkit.BG);
	    feedText.setForeground(GUIToolkit.FG);
	    feedText.setText("");
	    
	    //
	    // Tags
	    //
	    Label descLabel = new Label(leftBag, SWT.NONE);
	    descLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
	    descLabel.setText("Description : ");
	    descLabel.setForeground(GUIToolkit.FG);
	    
	    descText = new Text(leftBag, SWT.SINGLE);
	    descText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    descText.setBackground(GUIToolkit.BG);
	    descText.setForeground(GUIToolkit.FG);
	    descText.setText("");
	    
	    //
	    // Min
	    //
	    Label createdLabel = new Label(leftBag, SWT.NONE);
	    createdLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
	    createdLabel.setText("Created : ");
	    createdLabel.setForeground(GUIToolkit.FG);

	    createdText = new Text(leftBag, SWT.SINGLE);
	    createdText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    createdText.setBackground(GUIToolkit.BG);
	    createdText.setForeground(GUIToolkit.FG);
	    createdText.setText("");
	    
	    //
	    // Max
	    //
	    Label creatorLabel = new Label(leftBag, SWT.NONE);
	    creatorLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
	    creatorLabel.setText("Creator : ");
	    creatorLabel.setForeground(GUIToolkit.FG);

	    creatorText = new Text(leftBag, SWT.SINGLE);
	    creatorText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    creatorText.setBackground(GUIToolkit.BG);
	    creatorText.setForeground(GUIToolkit.FG);
	    creatorText.setText("");
	    
	    //
	    // Tags
	    //
	    Label tagsLabel = new Label(leftBag, SWT.NONE);
	    tagsLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
	    tagsLabel.setText("Tags : ");
	    tagsLabel.setForeground(GUIToolkit.FG);
	    
	    tagsText = new Text(leftBag, SWT.SINGLE);
	    tagsText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    tagsText.setBackground(GUIToolkit.BG);
	    tagsText.setForeground(GUIToolkit.FG);
	    tagsText.setText("");

	    //
	    // Email
	    //
	    Label emailLabel = new Label(leftBag, SWT.NONE);
	    emailLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
	    emailLabel.setText("Email : ");
	    emailLabel.setForeground(GUIToolkit.FG);
	    
	    emailText = new Text(leftBag, SWT.SINGLE);
	    emailText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    emailText.setBackground(GUIToolkit.BG);
	    emailText.setForeground(GUIToolkit.FG);
	    emailText.setText("");

		//
		// Desc
		//
		
		Composite rightBag = new Composite(container, SWT.NONE);
		rightBag.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		rightBag.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		rightBag.setBackground(GUIToolkit.BG);
		
	    rightBag.layout(true);
	    rightBag.pack(true);
	}
	
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		Object o = unwrap(selection);
		if (o instanceof BitMinterConfig) {
			bitMinterConfig = (BitMinterConfig) o;
		}
	}
	
	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return ((IStructuredSelection) element).getFirstElement();
		}
		return element;
	}
}
