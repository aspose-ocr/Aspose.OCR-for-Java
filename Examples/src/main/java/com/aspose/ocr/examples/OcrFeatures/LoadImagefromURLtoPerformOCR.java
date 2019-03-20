package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;

public class LoadImagefromURLtoPerformOCR {
	public static void main(String[] args) throws Exception {
		// ExStart:LoadImagefromURLtoPerformOCR
		// Initialize an instance of OcrEngine
		OcrEngine ocrEngine = new OcrEngine();

		// Set the Image property by loading the image from remote location
		ocrEngine.setImage(ImageStream.fromUrl("https://blog.aspose.com/wp-content/uploads/sites/2/2019/03/SampleTextOnline.jpg"));

		// Process the image
		if (ocrEngine.process()) {
			// Display the recognized text
			System.out.println(ocrEngine.getText());
		}
		// ExEnd:LoadImagefromURLtoPerformOCR
	}
}
