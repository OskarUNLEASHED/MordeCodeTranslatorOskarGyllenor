import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MorseCodeConverterTestEnglishToMorse {

    @Test
    public void testEnglishToMorse() {
        String englishText = "HELLO";
        String expectedMorse = ".... . .-.. .-.. ---";
        assertEquals("Testing English to Morse conversion", expectedMorse, MorseCodeConverter.englishToMorse(englishText));
    }
}
