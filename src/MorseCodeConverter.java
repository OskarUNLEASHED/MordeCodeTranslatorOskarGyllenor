import java.util.HashMap;
import java.util.Map;

public class MorseCodeConverter {
    private static final Map<Character, String> charToMorse = new HashMap<>();
    private static final Map<String, Character> morseToChar = new HashMap<>();

    static {

        charToMorse.put('A', ".-");
        charToMorse.put('B', "-...");
        charToMorse.put('C', "-.-.");
        charToMorse.put('D', "-..");
        charToMorse.put('E', ".");
        charToMorse.put('F', "..-.");
        charToMorse.put('G', "--.");
        charToMorse.put('H', "....");
        charToMorse.put('I', "..");
        charToMorse.put('J', ".---");
        charToMorse.put('K', "-.-");
        charToMorse.put('L', ".-..");
        charToMorse.put('M', "--");
        charToMorse.put('N', "-.");
        charToMorse.put('O', "---");
        charToMorse.put('P', ".--.");
        charToMorse.put('Q', "--.-");
        charToMorse.put('R', ".-.");
        charToMorse.put('S', "...");
        charToMorse.put('T', "-");
        charToMorse.put('U', "..-");
        charToMorse.put('V', "...-");
        charToMorse.put('W', ".--");
        charToMorse.put('X', "-..-");
        charToMorse.put('Y', "-.--");
        charToMorse.put('Z', "--..");

        charToMorse.put('0', "-----");
        charToMorse.put('1', ".----");
        charToMorse.put('2', "..---");
        charToMorse.put('3', "...--");
        charToMorse.put('4', "....-");
        charToMorse.put('5', ".....");
        charToMorse.put('6', "-....");
        charToMorse.put('7', "--...");
        charToMorse.put('8', "---..");
        charToMorse.put('9', "----.");

        for (Map.Entry<Character, String> entry : charToMorse.entrySet()) {
            morseToChar.put(entry.getValue(), entry.getKey());
        }
    }

    public static String englishToMorse(String englishText) {
        StringBuilder morseCode = new StringBuilder();
        for (char character : englishText.toUpperCase().toCharArray()) {
            String morse = charToMorse.get(character);
            if (morse != null) {
                morseCode.append(morse).append(" ");
            } else {
                return "";
            }
        }
        return morseCode.toString().trim();
    }

    public static String morseToEnglish(String morseCode) {
        morseCode = morseCode.replace("*", ".");

        StringBuilder englishText = new StringBuilder();
        String[] morseChars = morseCode.split(" ");
        for (String morseChar : morseChars) {
            Character englishChar = morseToChar.get(morseChar);
            if (englishChar != null) {
                englishText.append(englishChar);
            }
        }
        return englishText.toString();
    }

}
