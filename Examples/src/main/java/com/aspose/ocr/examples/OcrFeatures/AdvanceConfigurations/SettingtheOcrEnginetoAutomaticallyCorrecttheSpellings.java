package com.aspose.ocr.examples.OcrFeatures.AdvanceConfigurations;

import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.examples.Utils;

public class SettingtheOcrEnginetoAutomaticallyCorrecttheSpellings {
	public static void main(String[] args) throws Exception {
		// ExStart:SettingtheOcrEnginetoAutomaticallyCorrecttheSpellings
		// Create an instance of OcrEngine class
		OcrEngine ocr = new OcrEngine();

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SettingtheOcrEnginetoAutomaticallyCorrecttheSpellings.class) + "OcrFeatures/";

		/// Set the paths
		String imagePath = dataDir + "Sample1.jpg";

		// Set Image property by loading an image from file path
		ocr.setImage(ImageStream.fromFile(imagePath));

		// Set the DoSpellingCorrection to true
		ocr.getConfig().setDoSpellingCorrection(true);

		// Perform OCR operation
		if (ocr.process()) {
			// Display results
			System.out.println(ocr.getText());
		}
		// ExEnd:SettingtheOcrEnginetoAutomaticallyCorrecttheSpellings
	}
}
