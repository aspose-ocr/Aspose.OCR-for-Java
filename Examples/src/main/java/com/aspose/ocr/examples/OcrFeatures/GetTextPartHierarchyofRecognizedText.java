package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.IRecognizedPartInfo;
import com.aspose.ocr.IRecognizedTextPartInfo;
import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.examples.Utils;

public class GetTextPartHierarchyofRecognizedText {
	public static void main(String[] args) throws Exception {

		// ExStart:GetTextPartHierarchyofRecognizedText
		// Initialize an instance of OcrEngine
		OcrEngine ocrEngine = new OcrEngine();

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(GetTextPartHierarchyofRecognizedText.class) + "OcrFeatures/";

		/// Set the paths
		String imageFileName = dataDir + "Sample1.jpg";

		// Set the Image property by loading the image from file path location
		// or an instance of MemoryStream
		ocrEngine.setImage(ImageStream.fromFile(imageFileName));

		// Process the image
		if (ocrEngine.process()) {
			// Retrieve the first block of the recognized text part
			IRecognizedTextPartInfo firstBlock = (IRecognizedTextPartInfo) ocrEngine.getText().getPartsInfo()[0];

			// Get the children of the first block that will the the lines in the block
			IRecognizedPartInfo[] linesOfFirstBlock = firstBlock.getChildren();

			// Retrieve the fist line from the collection of lines
			IRecognizedTextPartInfo firstLine = (IRecognizedTextPartInfo) linesOfFirstBlock[0];

			// Display the level of line
			System.out.println(firstLine.getLevel());

			// Retrieve the fist word from the collection of words
			IRecognizedTextPartInfo firstWord = (IRecognizedTextPartInfo) firstLine.getChildren()[0];

			// Display the level of word
			System.out.println(firstWord.getLevel());

			// Retrieve the fist character from the collection of characters
			IRecognizedTextPartInfo firstCharacter = (IRecognizedTextPartInfo) firstWord.getChildren()[0];

			// Display the level of character
			System.out.println(firstCharacter.getLevel());
		}
		// ExEnd:GetTextPartHierarchyofRecognizedText
	}

}
