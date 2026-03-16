public class PallindromeCheckerApp {
    /**
     * MAIN CLASS - UseCase3PalindromeCheckerApp
     *
     * Use Case 3: Reverse String Based Palindrome Check
     *
     * Description:
     * This class checks whether a string is a palindrome
     * by reversing the string and comparing it with
     * the original value.
     *
     * @author Developer
     * @version 3.0
     */


        /**
         * Application entry point for UC3.
         * @param args Command-Line arguments
         */
        public static void main(String[] args) {

            // Input string
            String input = "madam";

            // Variable to store reversed string
            String reversed = "";

            // Iterate from the last character to the first
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed = reversed + input.charAt(i);
            }

            // Compare original and reversed string
            if (input.equals(reversed)) {
                System.out.println(input + " is a Palindrome");
            } else {
                System.out.println(input + " is not a Palindrome");
            }
        }
    }