package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.*;
import com.aspose.ocr.examples.Utils;

import java.io.IOException;
import java.util.ArrayList;

public class SpecifyAllowedCharacters {

	public static void main(String[] args) {
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SpecifyAllowedCharacters.class);

		// The image path
		String imagePath = dataDir + "0001460985.Jpeg";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		// Create OcrInput object and add images/documents for recognition
		OcrInput input = new OcrInput(InputType.SingleImage);
		input.add(imagePath);

		try {
			RecognitionSettings settings = new RecognitionSettings();
			settings.setRecognizeSingleLine(true);
			settings.setAllowedCharacters("123456789");

			ArrayList<RecognitionResult> result = api.Recognize(input, settings);
			System.out.println("File: " + imagePath);
			System.out.println("Result line: " + result.get(0).recognitionText);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ExEnd:1
	}
}
