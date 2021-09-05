package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.AsposeOCR;
import com.aspose.ocr.RecognitionResult;
import com.aspose.ocr.RecognitionSettings;
import com.aspose.ocr.examples.Utils;

import java.io.IOException;

public class RecognizeLine {

	public static void main(String[] args) {
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(RecognizeLine.class);

		// The image path
		String imagePath = dataDir + "0001460985.Jpeg";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		try {
			RecognitionSettings settings = new RecognitionSettings();
			settings.setRecognizeSingleLine(true);
			RecognitionResult result = api.RecognizePage(imagePath, settings);
			System.out.println("File: " + imagePath);
			System.out.println("Result line: " + result.recognitionText);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ExEnd:1
	}
}
