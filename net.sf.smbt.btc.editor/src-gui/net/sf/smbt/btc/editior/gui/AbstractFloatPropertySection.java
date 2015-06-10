package net.sf.smbt.btc.editior.gui;

import java.util.regex.Pattern;

import org.eclipse.emf.ecoretools.tabbedproperties.internal.Messages;
import org.eclipse.emf.ecoretools.tabbedproperties.internal.utils.ColorRegistry;
import org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractTextPropertySection;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Event;

public abstract class AbstractFloatPropertySection extends
		AbstractTextPropertySection {

	/** Predefined string pattern value for numerics and absolute with '-' : -25 */
	public static final String ABS_NUMERICS_PATTERN = "^[-\\d][\\d]*\\.?[\\d]*"; //$NON-NLS-1$   

	/** The Pattern used to check an Integer value */
	public static final Pattern FLOAT_PATTERN = Pattern.compile(ABS_NUMERICS_PATTERN);

	/**
	 * @see org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractTextPropertySection#verifyField(Event)
	 */
	protected void verifyField(Event e) {
		String value = getText().getText();
		if (value == null || value.equals("") || isTextValid()) { //$NON-NLS-1$
			setErrorMessage(null);
			getText().setBackground(null);
			e.doit = true;
		} else {
			setErrorMessage(Messages.AbstractIntegerPropertySection_UnvalidCharacter);
			getText().setBackground(ColorRegistry.COLOR_ERROR);
			e.doit = false;
		}
	}

	/**
	 * @see org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractTextPropertySection#getFeatureAsString()
	 */
	protected String getFeatureAsString() {
		return getFeatureFloat().toString();
	}

	/**
	 * @see org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractTextPropertySection#getOldFeatureValue()
	 */
	protected Object getOldFeatureValue() {
		return getFeatureFloat();
	}

	/**
	 * @see org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractTextPropertySection#getNewFeatureValue(java.lang.String)
	 */
	protected Object getNewFeatureValue(String newText) {
		return new Float(Float.parseFloat(newText));
	}

	/**
	 * @see org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractTextPropertySection#isTextValid()
	 */
	protected boolean isTextValid() {
		return FLOAT_PATTERN.matcher(getText().getText()).matches();
	}

	/**
	 * Get the text value of the feature for the text field for the section.
	 * 
	 * @return the text value of the feature.
	 */
	protected abstract Float getFeatureFloat();

	public Color getBG() {
		return GUIToolkit.BG;
	}

	public Color getFG() {
		return GUIToolkit.FG;
	}


}
