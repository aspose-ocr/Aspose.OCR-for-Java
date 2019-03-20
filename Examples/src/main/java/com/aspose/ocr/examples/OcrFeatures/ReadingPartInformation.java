package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.IRecognizedPartInfo;
import com.aspose.ocr.IRecognizedTextPartInfo;
import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.examples.Utils;

public class ReadingPartInformation {
	public static void main(String[] args) throws Exception {
		// ExStart:ReadingPartInformation
		// Initialize an instance of OcrEngine
		OcrEngine ocrEngine = new OcrEngine();

		String dataDir = Utils.getSharedDataDir(ReadingPartInformation.class);

		// The image path
		String imagePath = dataDir + "Sampleocr.bmp";

		// Set Image property by loading an image from file path
		ocrEngine.setImage(ImageStream.fromFile(imagePath));

		// Run recognition process
		if (ocrEngine.process()) {
			System.out.println(ocrEngine.getText());
			// Retrieve an array of recognized text by parts
			IRecognizedPartInfo[] text = ocrEngine.getText().getPartsInfo();
			// Iterate over the text parts
			for (int i = 0; i < text.length; i++) {
				IRecognizedTextPartInfo symbol = (IRecognizedTextPartInfo) text[i];
				// Display part information
				System.out.println("isItalic : " + symbol.getItalic());
				System.out.println("Text Color : " + symbol.getTextColor());
				System.out.println("Text : " + symbol.getText());
				System.out.println("isTrimmed : " + symbol.isTrimmed());
				float[] quality = symbol.getCharactersQuality();
				System.out.println("Quality of first Character : " + quality[0]);
			}
		}
		// ExEnd:ReadingPartInformation
	}

}
