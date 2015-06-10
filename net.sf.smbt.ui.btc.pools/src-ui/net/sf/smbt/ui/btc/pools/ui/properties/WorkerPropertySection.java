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

import net.sf.smbt.btc.pools.bitminter.UserData;
import net.sf.smbt.btc.pools.bitminter.Worker;
import net.sf.smbt.ui.hmi.GUIToolkit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class WorkerPropertySection extends AbstractPropertySection {
	private UserData dataType;
	private Composite container;
//	private Map<String,	PachubeDataWidget> widgetsMap;

	public WorkerPropertySection() {
//		widgetsMap = new HashMap<String, PachubeDataWidget>();
	}
	
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		aTabbedPropertySheetPage.getControl().setBackground(GUIToolkit.BG);
		
		parent.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).create());
		parent.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		parent.setBackground(GUIToolkit.BG);
		parent.getParent().setBackground(GUIToolkit.BG);
		parent.getParent().getParent().setBackground(GUIToolkit.BG);

		container = GUIToolkit.INSTANCE.createComposite(parent);
		
		container.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		container.setBackground(GUIToolkit.BG);
	}
	
    private void layoutComposite(Control control) {
    	if (control instanceof Composite) {
    		Composite composite = (Composite) control;
    		for (Control c : composite.getChildren()) {
				if (!c.isDisposed()) {
					if (c instanceof Composite) {
						Composite cmp = (Composite) c;
						cmp.layout(true);
						cmp.redraw();
						layoutComposite(cmp);
					}
					c.redraw();
				}
			}
    	}
    }

	private void updatePachubeDataWidget(UserData dataType) {
		EObject eObj = dataType.eContainer();
		if (eObj instanceof Worker) {
			//EnvironmentType et = (EnvironmentType) eObj;
			
			//String id = et.getFeed() + "_" + dataType.getId();
			
    		for (Control c : container.getChildren()) {
    			if (!c.isDisposed()) {
    				if (c instanceof BitMinterRateDataWidget) {
    					c.dispose();
    				}
    			}
    		}

    		BitMinterRateDataWidget pdw = new BitMinterRateDataWidget(container, dataType);
			pdw.setLayout(GridLayoutFactory.fillDefaults().create());
			pdw.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
    		
			layoutComposite(container.getParent());
		}
	}
	
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		Object o = unwrap(selection);
		if (o instanceof UserData) {
			dataType = (UserData) o;
			updatePachubeDataWidget(dataType);
		}
	}
	
	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return ((IStructuredSelection) element).getFirstElement();
		}
		return element;
	}
}
