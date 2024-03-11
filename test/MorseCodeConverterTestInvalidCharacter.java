import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MorseCodeConverterTestInvalidCharacter {

    @Test
    public void testInvalidCharacterEnglishToMorse() {
        String englishText = "@";
        String expectedMorse = "Invalid Character Detected"; // Assuming your implementation simply skips unknown characters or handles them in a specific way
        assertEquals("Testing conversion of an invalid character from English to Morse", expectedMorse, MorseCodeConverter.englishToMorse(englishText));
    }
}
