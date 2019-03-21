package com.aspose.ocr.examples.OcrFeatures.AdvanceConfigurations;

import java.util.List;

import com.aspose.ocr.IRecognitionBlock;
import com.aspose.ocr.IRecognizedTextPartInfo;
import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.RecognitionBlock;
import com.aspose.ocr.examples.Utils;

public class AddingUserDefinedRecognitionBlocks {
	public static void main(String[] args) throws Exception {
		// ExStart:AddingUserDefinedRecognitionBlocks
		// Initialize an instance of OcrEngine
		OcrEngine ocrEngine = new OcrEngine();

		// Clear notifier list
		ocrEngine.clearNotifies();

		// Clear recognition blocks
		ocrEngine.getConfig().clearRecognitionBlocks();

		// Add 3 rectangle blocks to user defined recognition blocks
		// Reading text from multiple recognition blocks work with a valid license
		ocrEngine.getConfig().addRecognitionBlock(RecognitionBlock.createTextBlock(27, 35, 857, 75));
		ocrEngine.getConfig().addRecognitionBlock(RecognitionBlock.createTextBlock(899, 104, 552, 63));
		ocrEngine.getConfig().addRecognitionBlock(RecognitionBlock.createTextBlock(702, 163, 623, 68));

		// Ignore everything else on the image other than the user defined
		// recognition blocks
		ocrEngine.getConfig().setDetectTextRegions(false);

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(AddingUserDefinedRecognitionBlocks.class);

		// The image path
		String imagePath = dataDir + "Sampleocr.bmp";

		// Set Image property by loading an image from file path
		ocrEngine.setImage(ImageStream.fromFile(imagePath));

		// Run recognition process
		if(ocrEngine.process()) {
			// Retrieve user defined blocks that determines the page layout
			List<IRecognitionBlock> blocks = ocrEngine.getConfig().getRecognitionBlocks();
			// Loop over the list of blocks
			for (IRecognitionBlock block : blocks) {
				// Check if block has recognition data
				if (block.getRecognitionData() == null) {
					System.out.println("Null");
					continue;
				}
				// Display dimension & size of rectangle that defines the recognition block
				System.out.println("Block: " + block.getRectangle());
	
				// Display the recognition results
				IRecognizedTextPartInfo textPartInfo = (IRecognizedTextPartInfo) block.getRecognitionData();
				System.out.println("Text: " + textPartInfo.getText());
			}
		}
		// ExEnd:AddingUserDefinedRecognitionBlocks
	}
}
