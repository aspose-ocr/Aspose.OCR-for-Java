package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.examples.Utils;

public class PerformOCROnImage {

	public static void main(String[] args) throws Exception {
		// ExStart:PerformOCROnImage
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(PerformOCROnImage.class) + "OcrFeatures/";

		/// Set the paths
		String imagePath = dataDir + "Sample1.jpg";

		// Create an instance of OcrEngine
		OcrEngine ocr = new OcrEngine();

		// Set image file
		ocr.setImage(ImageStream.fromFile(imagePath));

		// Perform OCR and get extracted text
		try {
			if (ocr.process()) {
				System.out.println("\ranswer -> " + ocr.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ExEnd:PerformOCROnImage
	}
}
