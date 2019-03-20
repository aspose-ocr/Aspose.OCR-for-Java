package com.aspose.ocr.examples.OcrFeatures.AdvanceConfigurations;

import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.examples.Utils;

public class RecognizeMultipleWhiteLists {
	public static void main(String[] args) throws Exception {
		// ExStart:RecognizeMultipleWhiteLists
		// Initialize an instance of OcrEngine
		OcrEngine ocrEngine = new OcrEngine();
		
		// Create text recognition block by supplying X,Y coordinates and Width,Height values
		com.aspose.ocr.IRecognitionBlock block1 = com.aspose.ocr.RecognitionBlock.createTextBlock(10, 9, 258, 46);

		// Set the Whitelist property to recognize numbers only
		block1.setWhitelist(new char[] { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' });
		
		// Create text recognition block by supplying X,Y coordinates and Width,Height values
		com.aspose.ocr.IRecognitionBlock block2 = com.aspose.ocr.RecognitionBlock.createTextBlock(23, 62, 220, 50);

		// Set the Whitelist property to recognize L,M,N,O,P letters only
		block2.setWhitelist(new char[] { 'L', 'M', 'N', 'O', 'P' });
		
		// Set different configurations and add the recognition block(s)
		ocrEngine.getConfig().clearRecognitionBlocks();
		ocrEngine.getConfig().addRecognitionBlock(block1);
		ocrEngine.getConfig().addRecognitionBlock(block2);
		ocrEngine.getConfig().setDetectTextRegions(false);

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(RecognizeMultipleWhiteLists.class);

		// The image path
		String imagePath = dataDir + "SampleNumbersAndLetters.bmp";

		// Set Image property by loading an image from file path
		ocrEngine.setImage(ImageStream.fromFile(imagePath));

		if (ocrEngine.process()) {
			System.out.println(ocrEngine.getText());
		}
		// ExEnd:RecognizeMultipleWhiteLists
	}
}
