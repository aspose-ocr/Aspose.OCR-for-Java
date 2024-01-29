package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.*;
import com.aspose.ocr.examples.Utils;

import java.io.IOException;
import java.util.ArrayList;

public class PerformOCROnImagesBatch {

	public static void main(String[] args) {
		//SetLicense.main(null);
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(PerformOCROnImagesBatch.class);

		// The image path
		String imagePath1 = dataDir + "p.png";
		String imagePath2 = dataDir + "Receipt.jpg";
		String imagePath3 = dataDir + "0001460985.Jpeg";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		// Set preprocessing filters to rotate image before recognition.
		PreprocessingFilter filters = new PreprocessingFilter();
		filters.add(PreprocessingFilter.AutoSkew());

		// Create OcrInput object and add images/documents for recognition
		OcrInput input = new OcrInput(InputType.SingleImage, filters);
		input.add(imagePath1);
		input.add(imagePath2);
		input.add(imagePath3);

		// Recognize images
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
