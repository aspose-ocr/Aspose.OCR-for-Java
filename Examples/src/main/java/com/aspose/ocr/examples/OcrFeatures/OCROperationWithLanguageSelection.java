package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.AsposeOCR;
import com.aspose.ocr.Language;
import com.aspose.ocr.License;
import com.aspose.ocr.RecognitionResult;
import com.aspose.ocr.RecognitionSettings;
import com.aspose.ocr.examples.License.SetLicense;
import com.aspose.ocr.examples.Utils;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class OCROperationWithLanguageSelection {

	public static void main(String[] args) {
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(OCROperationWithLanguageSelection.class);

		// The image path
		String file = dataDir + "p3.png";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		// set recognition options
		RecognitionSettings settings = new RecognitionSettings();
		settings.setAutoSkew(false);
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
		rectangles.add(new Rectangle(90,186,775,95));
		settings.setRecognitionAreas(rectangles);
		settings.setSkew(0.5);
		settings.setLanguage(Language.Eng);

		// get result object
		RecognitionResult result = null;
		try {
			result = api.RecognizePage(file, settings);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// print result
		System.out.println("Result: \n" + result.recognitionText+"\n\n");
		for(String n: result.recognitionAreasText) {
			System.out.println ( n );
		}
		for(Rectangle n: result.recognitionAreasRectangles) {
			System.out.println(n.height+":"+n.width+":"+n.x+":"+n.y);
		}
		System.out.println("\nJSON:" + result.GetJson());
		System.out.println("angle:" + result.skew);
		for(String n: result.warnings) {
			System.out.println ( n );
		}
		// ExEnd:1

		System.out.println("OCROperationWithLanguageSelection: execution complete");
	}
}
