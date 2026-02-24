/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 *
 * This use case extends UC5 by implementing a modular approach
 * to generate each letter's pattern through dedicated methods.
 * This enhances code reusability and maintainability.
 *
 * @author Developer
 * @version 6.0
 */

public class OOPSBannerApp {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  OOO  ",
            " O   O ",
            " O   O ",
            " O   O ",
            "  OOO  "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            " PPPPP ",
            " P    P",
            " PPPPP ",
            " P     ",
            " P     "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            " SSSSS ",
            " S     ",
            " SSSSS ",
            "     S ",
            " SSSSS "
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {

        // Declare String Arrays to hold patterns for each letter
        String[] oPattern1 = getOPattern();
        String[] oPattern2 = getOPattern();
        String[] pPattern  = getPPattern();
        String[] sPattern  = getSPattern();

        // Use loop to assemble each line of the banner
        // to create the visual effect for the message "OOPS"
        for (int i = 0; i < oPattern1.length; i++) {
            System.out.println(
                oPattern1[i] + "   " +
                oPattern2[i] + "   " +
                pPattern[i]  + "   " +
                sPattern[i]
            );
        }
    }
}