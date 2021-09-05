package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.AsposeOCR;
import com.aspose.ocr.examples.License.SetLicense;
import com.aspose.ocr.examples.Utils;

import java.io.IOException;

public class PerformOCROnPage {

	public static void main(String[] args) {
		//SetLicense.main(null);
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(PerformOCROnPage.class);

		// The image path
		String imagePath = dataDir + "p3.png";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		// Recognize page by full path to file
		try {
			String result = api.RecognizePage(imagePath);
			System.out.println("Result: " + result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ExEnd:1
	}
}
