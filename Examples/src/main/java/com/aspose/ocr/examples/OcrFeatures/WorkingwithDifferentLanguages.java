package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.ImageStream;
import com.aspose.ocr.LanguageFactory;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.examples.Utils;

public class WorkingwithDifferentLanguages {
	public static void main(String[] args) throws Exception {
		// ExStart:WorkingwithDifferentLanguages
		// Initialize an instance of OcrEngine
		OcrEngine ocrEngine = new OcrEngine();

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ReadingPartInformation.class);

		// The image path
		String imageFileName = dataDir + "SpanishOCR.bmp";

		// Set the Image property by loading the image from file path location
		ocrEngine.setImage(ImageStream.fromFile(imageFileName));

		// Clear the default language (English)
		ocrEngine.getLanguageContainer().clear();

		// Load the resources of the language from file path location or an instance of InputStream
		ocrEngine.getLanguageContainer().addLanguage(LanguageFactory.load(dataDir + "Aspose.OCR.Spanish.Resources.zip"));

		// Process the image
		if (ocrEngine.process()) {
			// Display the recognized text
			System.out.println(ocrEngine.getText());
		}
		// ExEnd:WorkingwithDifferentLanguages
	}
}