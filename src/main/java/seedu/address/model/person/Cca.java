package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Person's CCAs in CollegeZone.
 * Guarantees: immutable; is valid as declared in {@link #isValidCcaName(String)}
 */
public class CCA {

    public static final String MESSAGE_CCA_CONSTRAINTS = "CCAs should be alphanumeric";
    public static final String CCA_VALIDATION_REGEX = "\\p{Alnum}+";

    public final String ccaName;

    /**
     * Constructs a {@code CCA}.
     *
     * @param ccaName A valid CCA.
     */
    public CCA(String ccaName) {
        requireNonNull(ccaName);
        checkArgument(isValidCcaName(ccaName), MESSAGE_CCA_CONSTRAINTS);
        this.ccaName = ccaName;
    }

    /**
     * Returns true if a given string is a valid tag name.
     */
    public static boolean isValidCcaName(String test) {
        return test.matches(CCA_VALIDATION_REGEX);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof CCA // instanceof handles nulls
                && this.ccaName.equals(((Tag) other).cca)); // state check
    }

    @Override
    public int hashCode() {
        return cca.hashCode();
    }

    /**
     * Format state as text for viewing.
     */
    public String toString() {
        return '[' + cca + ']';
    }

}