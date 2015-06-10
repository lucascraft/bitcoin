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

package net.sf.smbt.ui.btc.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.ide.DialogUtil;
import org.eclipse.ui.internal.wizards.newresource.ResourceMessages;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;

public class CreateTradeBotsConfigWizard extends BasicNewFileResourceWizard {
	
	private String filePrefix;
	
	public String getFilePrefix() {
		return filePrefix;
	}
	
	public void setFilePrefix(String filePrefix) {
		this.filePrefix = filePrefix;
	}
	
	public void addPage(org.eclipse.jface.wizard.IWizardPage page) {
		if (page instanceof WizardNewFileCreationPage) {
			WizardNewFileCreationPage p = (WizardNewFileCreationPage) page;
			p.setFileExtension("bots");
			super.addPage(p);
		} else {
			super.addPage(page);
		}
	};

	@Override
	public boolean performFinish() {
		WizardNewFileCreationPage nfpage= (WizardNewFileCreationPage) getPage("newFilePage1");
		
        IFile file = nfpage.createNewFile();
        
        if (file == null) {
			return false;
		}

        selectAndReveal(file);

        // Open editor on new file.
        IWorkbenchWindow dw = getWorkbench().getActiveWorkbenchWindow();
        try {
            if (dw != null) {
                IWorkbenchPage page = dw.getActivePage();
                if (page != null) {
                    IDE.openEditor(page, file, true);
                }
            }
        } catch (PartInitException e) {
            DialogUtil.openError(dw.getShell(), ResourceMessages.FileResource_errorMessage, 
                    e.getMessage(), e);
        }

        return true;
	}

}
