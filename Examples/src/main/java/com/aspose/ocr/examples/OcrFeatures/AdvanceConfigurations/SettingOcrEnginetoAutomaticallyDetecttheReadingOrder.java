package com.aspose.ocr.examples.OcrFeatures.AdvanceConfigurations;

import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.examples.Utils;

public class SettingOcrEnginetoAutomaticallyDetecttheReadingOrder {
	public static void main(String[] args) throws Exception {
		// ExStart:SettingOcrEnginetoAutomaticallyDetecttheReadingOrder
		// Create an instance of OcrEngine class
		OcrEngine ocr = new OcrEngine();

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SettingOcrEnginetoAutomaticallyDetecttheReadingOrder.class) + "OcrFeatures/";

		/// Set the paths
		String imagePath = dataDir + "Sample1.jpg";

		// Set Image property by loading an image from file path
		ocr.setImage(ImageStream.fromFile(imagePath));

		// Set the DetectReadingOrder to true
		ocr.getConfig().setDetectReadingOrder(true);

		// Perform OCR operation
		if (ocr.process()) {
			// Display results
			System.out.println(ocr.getText());
		}
		// ExEnd:SettingOcrEnginetoAutomaticallyDetecttheReadingOrder
	}

}
