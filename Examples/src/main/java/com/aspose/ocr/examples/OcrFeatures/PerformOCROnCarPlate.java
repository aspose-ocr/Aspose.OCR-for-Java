package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.*;
import com.aspose.ocr.examples.Utils;

import java.io.IOException;
import java.util.ArrayList;

public class PerformOCROnCarPlate {

	public static void main(String[] args) {
		//SetLicense.main(null);
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(PerformOCROnCarPlate.class);

		// The image path
		String imagePath = dataDir + "car.jfif";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		// Create OcrInput object and add images/documents for recognition
		OcrInput input = new OcrInput(InputType.SingleImage);
		input.add(imagePath);

		// Recognize page by full path to file
		try {
			ArrayList<RecognitionResult> result = api.RecognizeCarPlate(input, new CarPlateRecognitionSettings());
			System.out.println("Result: " + result.get(0).recognitionText);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ExEnd:1
	}
}
