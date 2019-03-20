package com.aspose.ocr.examples.OcrFeatures.AdvanceConfigurations;

import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.examples.Utils;

public class DisableReadingOrderDetection {
	public static void main(String[] args) throws Exception {
		// ExStart:DisableReadingOrderDetection
		// Create an instance of OcrEngine class
		OcrEngine ocr = new OcrEngine();

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(DisableReadingOrderDetection.class);

		// The image path
		String imagePath = dataDir + "Sampleocr.bmp";

		// Set Image property by loading an image from file path
		ocr.setImage(ImageStream.fromFile(imagePath));

		// Set the DetectReadingOrder to false to improve performance
		// Default value of DetectReadingOrder is true
		ocr.getConfig().setDetectReadingOrder(false);

		// Perform OCR operation
		if (ocr.process()) {
			// Display results
			System.out.println(ocr.getText());
		}
		// ExEnd:DisableReadingOrderDetection
	}

}
