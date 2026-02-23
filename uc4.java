/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array
 * to store banner lines and iterating through them with a
 * for-each loop, eliminating hardcoded print statements.
 *
 * @author Developer
 * @version 4
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

            String.join("  ",
                    " ***** ",
                    " ***** ",
                    " ******",
                    " ***** "
            ),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *"
            ),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*"
            ),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "****** ",
                    " ***** "
            ),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "      *"
            ),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "*     *"
            ),

            String.join("  ",
                    " ***** ",
                    " ***** ",
                    "*      ",
                    " ***** "
            )
        };

        // Print banner using for-each loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}