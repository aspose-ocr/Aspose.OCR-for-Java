package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.*;
import com.aspose.ocr.examples.Utils;

import java.io.IOException;
import java.util.ArrayList;

public class PerformOCROnStreetPhoto {

	public static void main(String[] args) {
		//SetLicense.main(null);
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(PerformOCROnStreetPhoto.class);

		// The image path
		String imagePath = dataDir + "sign_text.jpg";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		// Set preprocessing filters to rotate image before recognition.
		PreprocessingFilter filters = new PreprocessingFilter();
		filters.add(PreprocessingFilter.AutoSkew());

		// Create OcrInput object and add images/documents for recognition
		OcrInput input = new OcrInput(InputType.SingleImage, filters);
		input.add(imagePath);

		// Recognize page by full path to file
		try {
			ArrayList<RecognitionResult> result = api.RecognizeStreetPhoto(input);
			System.out.println("Result: " + result.get(0).recognitionText);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ExEnd:1
	}
}
