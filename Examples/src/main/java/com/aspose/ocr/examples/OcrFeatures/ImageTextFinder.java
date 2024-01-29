package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.*;
import com.aspose.ocr.examples.Utils;

import java.io.IOException;
import java.util.ArrayList;

public class ImageTextFinder {

	public static void main(String[] args) {
		//SetLicense.main(null);
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ImageTextFinder.class);

		// The image path
		String imagePath1 = dataDir + "p.png";
		String imagePath2 = dataDir + "p3.png";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		String textToFind = "More";

		// Detect if image has text
		boolean result = api.ImageHasText(imagePath1, textToFind);
		System.out.println("Image Has Text: "+ textToFind + " : " + result);

		// Compare two images by texts
		boolean isEqual = api.CompareImageTexts(imagePath1, imagePath2);
		System.out.println("Images are equal: " + isEqual);

		// Compare two images by texts
		float diff = api.ImageTextDiff(imagePath1, imagePath2);
		System.out.println("Difference: " + diff);
		// ExEnd:1
	}
}
