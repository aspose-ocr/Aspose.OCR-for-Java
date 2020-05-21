package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.AsposeOCR;
import com.aspose.ocr.examples.Utils;

import java.io.IOException;

public class CalculateSkewAngle {

	public static void main(String[] args) {
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(CalculateSkewAngle.class);

		// The image path
		String imagePath = dataDir + "p3.png";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		// Get test skew
		try {
			double angle = api.CalcSkewImage(imagePath);
			System.out.println("Skew text is:" + angle + " degrees.");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// ExEnd:1
	}
}
