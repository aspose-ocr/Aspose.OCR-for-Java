package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.AsposeOCR;
import com.aspose.ocr.examples.Utils;

import java.io.IOException;

public class SpecifyAllowedCharacters {

	public static void main(String[] args) {
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SpecifyAllowedCharacters.class);

		// The image path
		String imagePath = dataDir + "0001460985.Jpeg";

		//Create api instance
		AsposeOCR api = new AsposeOCR("123456789");

		try {
			String result = api.RecognizeLine(imagePath);
			System.out.println("File: " + imagePath);
			System.out.println("Result line: " + result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ExEnd:1
	}
}
