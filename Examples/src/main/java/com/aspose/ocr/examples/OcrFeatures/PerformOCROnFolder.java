package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.*;
import com.aspose.ocr.examples.Utils;

import java.io.IOException;
import java.util.ArrayList;

public class PerformOCROnFolder {

	public static void main(String[] args) {
		//SetLicense.main(null);
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(PerformOCROnFolder.class);

		// The image path
		String imagePath = dataDir + "OCR";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		// Set preprocessing filters to rotate image before recognition.
		PreprocessingFilter filters = new PreprocessingFilter();
		filters.add(PreprocessingFilter.AutoSkew());

		// Create OcrInput object and add images/documents for recognition
		OcrInput input = new OcrInput(InputType.Directory, filters);
		input.add(imagePath);

		// Recognize page by full path to folder
		try {
			ArrayList<RecognitionResult> results = api.Recognize(input);
			for(RecognitionResult result : results) {
				System.out.println("---------------------------------");
				System.out.println("Result: " + result.recognitionText);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ExEnd:1
	}
}
