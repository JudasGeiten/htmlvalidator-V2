/**
 *
 * $Id$
 */
package model.validation;

import model.label;

/**
 * A sample validator interface for {@link model.input}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface inputValidator {
	boolean validate();

	boolean validateType(String value);
	boolean validateLabelledBy(label value);

	boolean validateId(String value);

	boolean validateId(int value);
}
