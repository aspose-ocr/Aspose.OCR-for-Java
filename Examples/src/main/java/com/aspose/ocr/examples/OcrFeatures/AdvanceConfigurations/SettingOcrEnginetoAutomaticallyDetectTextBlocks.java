package com.aspose.ocr.examples.OcrFeatures.AdvanceConfigurations;

import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.examples.Utils;

public class SettingOcrEnginetoAutomaticallyDetectTextBlocks {
	public static void main(String[] args) throws Exception {
		// ExStart:SettingOcrEnginetoAutomaticallyDetectTextBlocks
		// Create an instance of OcrEngine class
		OcrEngine ocr = new OcrEngine();

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SettingOcrEnginetoAutomaticallyDetectTextBlocks.class) + "OcrFeatures/";

		/// Set the paths
		String imagePath = dataDir + "Sample1.jpg";

		// Set Image property by loading an image from file path
		ocr.setImage(ImageStream.fromFile(imagePath));

		// Set the DetectTextRegions to true
		ocr.getConfig().setDetectTextRegions(true);

		// Perform OCR operation
		if (ocr.process()) {
			// Display results
			System.out.println(ocr.getText());
		}
		// ExEnd:SettingOcrEnginetoAutomaticallyDetectTextBlocks
	}

}
