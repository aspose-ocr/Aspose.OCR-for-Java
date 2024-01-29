package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.*;
import com.aspose.ocr.examples.Utils;

import java.io.IOException;
import java.util.ArrayList;

public class PerformOCROnArchive {

	public static void main(String[] args) {
		//SetLicense.main(null);
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(PerformOCROnArchive.class);

		// The image path
		String archivePath = dataDir + "OCR.zip";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		// Set preprocessing filters to rotate image before recognition.
		PreprocessingFilter filters = new PreprocessingFilter();
		filters.add(PreprocessingFilter.AutoSkew());

		// Create OcrInput object and add images/documents for recognition
		OcrInput input = new OcrInput(InputType.Zip, filters);
		input.add(archivePath);

		// Recognize page by full path to archive
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
