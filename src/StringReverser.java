import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        // error handling just in case something goes horribly wrong
        try {
            // initializes variables to be used/displayed later
            String inputString = scannerInput();

            String reversedString = "";
            reversedString = reverseString(inputString);

            int numberOfChars = inputString.length();

            // prints all required lines to display variables
            System.out.println("Original string is --> " + inputString);
            System.out.println("The string in reverse is --> " + reversedString);
            System.out.println("The number of characters in that string is --> " + numberOfChars);

        } catch (Exception e) {
            System.out.println("Whoa! Something went wrong! It was: " + e.getMessage());
        }
    }

    // uses scanner util to capture user input
    private static String scannerInput() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string, then hit enter.");

        String inputString = sc.nextLine();

        return inputString;
    }

    // iterates through string and adds characters to new string one at a time starting at the end of the input string
    public static String reverseString(String input) {
        String reversedString = "";

        for (int i = input.length() - 1; i >= 0; --i) {
            reversedString += input.charAt(i);
        }

        return reversedString;
    }
}
