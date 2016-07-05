package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.IRecognizedPartInfo;
import com.aspose.ocr.IRecognizedTextPartInfo;
import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.RecognitionBlock;
import com.aspose.ocr.examples.Utils;

public class ExtractingTextfromPartofanImage {
	public static void main(String[] args) throws Exception {
		// ExStart:ExtractingTextfromPartofanImage
		// Initialize an instance of OcrEngine
		OcrEngine ocrEngine = new OcrEngine();

		// Clear notifier list
		ocrEngine.clearNotifies();

		// Clear recognition blocks
		ocrEngine.getConfig().clearRecognitionBlocks();

		// Add 2 rectangle blocks to user defined recognition blocks
		ocrEngine.getConfig().addRecognitionBlock(RecognitionBlock.createTextBlock(52, 128, 67, 74));
		ocrEngine.getConfig().addRecognitionBlock(RecognitionBlock.createTextBlock(990, 46, 38, 46));

		// Ignore everything else on the image other than the user defined
		// recognition blocks
		ocrEngine.getConfig().setDetectTextRegions(false);

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ExtractingTextfromPartofanImage.class);

		/// Set the paths
		String imagePath = dataDir + "Sample1.jpg";

		// Set Image property by loading an image from file path
		ocrEngine.setImage(ImageStream.fromFile(imagePath));

		// Run recognition process
		if (ocrEngine.process()) {
			for (IRecognizedPartInfo info : ocrEngine.getText().getPartsInfo()) {
				IRecognizedTextPartInfo textInfo = (IRecognizedTextPartInfo) info;
				System.out.println("Block: " + info.getBox() + " Text: " + textInfo.getText());
			}
		}
		// ExEnd:ExtractingTextfromPartofanImage
	}

}
