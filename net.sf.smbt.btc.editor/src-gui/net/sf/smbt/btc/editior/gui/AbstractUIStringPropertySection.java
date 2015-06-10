package net.sf.smbt.btc.editior.gui;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractStringPropertySection;
import org.eclipse.swt.graphics.Color;

public abstract class AbstractUIStringPropertySection extends AbstractStringPropertySection {

	
	public Color getBG() {
		return GUIToolkit.BG;
	}

	public Color getFG() {
		return GUIToolkit.FG;
	}


}
