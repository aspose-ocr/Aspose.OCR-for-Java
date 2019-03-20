package com.aspose.ocr.examples.OcrFeatures.AdvanceConfigurations;

import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.examples.Utils;

public class SettingtheOcrEnginetoIgnoreNonTextualBlocks {
	public static void main(String[] args) throws Exception {
		// ExStart:SettingtheOcrEnginetoIgnoreNonTextualBlocks
		// Create an instance of OcrEngine class
		OcrEngine ocr = new OcrEngine();

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SettingtheOcrEnginetoIgnoreNonTextualBlocks.class);

		// The image path
		String imagePath = dataDir + "Sampleocr.bmp";

		// Set Image property by loading an image from file path
		ocr.setImage(ImageStream.fromFile(imagePath));

		// Set the RemoveNonText to true
		ocr.getConfig().setRemoveNonText(true);
		// Perform OCR operation
		
		if (ocr.process()) {
			// Display results
			System.out.println(ocr.getText());
		}
		// ExEnd:SettingtheOcrEnginetoIgnoreNonTextualBlocks
	}
}
