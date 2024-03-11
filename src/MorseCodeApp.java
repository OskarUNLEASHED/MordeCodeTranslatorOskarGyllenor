import java.util.Scanner;

public class MorseCodeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the magical Morsecode translator! Use its power wisely");
        System.out.println("Enter E for English to Morse conversion or M for Morse to English:");

        String choice = scanner.nextLine();

        if ("E".equalsIgnoreCase(choice)) {
            System.out.println("Enter English text to convert:");
            String englishText = scanner.nextLine();
            System.out.println("Morse Code: " + MorseCodeConverter.englishToMorse(englishText));
        } else if ("M".equalsIgnoreCase(choice) || "N".equalsIgnoreCase(choice)) {
            System.out.println("Enter Morse Code to convert:");
            String morseCode = scanner.nextLine();
            System.out.println("English Text: " + MorseCodeConverter.morseToEnglish(morseCode));
        } else {
            System.out.println("Invalid choice. Please restart the program.");
        }
    }
}

