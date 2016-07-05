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

		String dataDir = Utils.getDataDir(ReadingPartInformation.class);

		/// Set the paths
		String imagePath = dataDir + "Sample1.jpg";

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
				System.out.println("isUnderline : " + symbol.getUnderline());
				System.out.println("isBold : " + symbol.getBold());
				System.out.println("Text Color : " + symbol.getTextColor());
				System.out.println("Quality : " + symbol.getCharactersQuality());
			}
		}
		// ExEnd:ReadingPartInformation
	}

}
