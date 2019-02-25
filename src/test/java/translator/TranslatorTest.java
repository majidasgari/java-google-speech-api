package translator;

import com.goxr3plus.speech.translator.GoogleTranslate;
import com.goxr3plus.speech.translator.data.SingleWordData;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TranslatorTest {
	
	@Test
	public void testString() throws IOException {
		
		String translatedText = GoogleTranslate.translate("Hola . Buenos días");
		String expectedText = "Hi . Good Morning";
		assertEquals(translatedText, expectedText);

		SingleWordData a = GoogleTranslate.singleWordData("fa", "ridge");
		System.out.println(a);
	}
}
