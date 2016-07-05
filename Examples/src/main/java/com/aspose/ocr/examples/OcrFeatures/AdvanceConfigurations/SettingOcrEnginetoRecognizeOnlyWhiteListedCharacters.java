package com.aspose.ocr.examples.OcrFeatures.AdvanceConfigurations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.aspose.ocr.IRecognizedText;
import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OCRConfig;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.examples.Utils;

public class SettingOcrEnginetoRecognizeOnlyWhiteListedCharacters {
	public static void main(String[] args) throws Exception {
		// ExStart:SettingOcrEnginetoRecognizeOnlyWhiteListedCharacters
		// Initialize an instance of OcrEngine
		OcrEngine ocrEngine = new OcrEngine();

		// Retrieve the OcrConfig of the OcrEngine object
		OCRConfig ocrConfig = ocrEngine.getConfig();

		// Set the Whitelist property to recognize numbers only
		ocrConfig.setWhitelist(new char[] { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' });

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingOcrEnginetoRecognizeOnlyWhiteListedCharacters.class);

		/// Set the paths
		String imagePath = dataDir + "Sample1.jpg";

		// Set Image property by loading an image from file path
		ocrEngine.setImage(ImageStream.fromFile(imagePath));

		// Call the Process method to retrieve the results
		ocrEngine.process();

		// Filtration can be done using different approaches such as by using
		// the
		// regular expressions as demonstrated below

		if (ocrEngine.process()) {
			IRecognizedText text = ocrEngine.getText();
			System.out.println(text);

			String expression = "(\\d+)";
			// Create a Pattern object
			Pattern pattern = Pattern.compile(expression);

			// Now create matcher object
			Matcher matcher = pattern.matcher(text.toString());
			if (matcher.find()) {
				System.out.println("Found value: " + matcher.group(0));
			}
		}
		// ExEnd:SettingOcrEnginetoRecognizeOnlyWhiteListedCharacters
	}
}
