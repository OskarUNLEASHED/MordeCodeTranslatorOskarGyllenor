import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MorseCodeConverterTestMorseToEnglish {

    @Test
    public void testMorseToEnglish() {
        String morseCode = ".... . .-.. .-.. ---";
        String expectedEnglish = "HELLO";
        assertEquals("Testing Morse to English conversion", expectedEnglish, MorseCodeConverter.morseToEnglish(morseCode));
    }
}
