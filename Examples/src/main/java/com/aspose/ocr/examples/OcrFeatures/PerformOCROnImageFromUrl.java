package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.AsposeOCR;
import com.aspose.ocr.License;
import com.aspose.ocr.RecognitionResult;
import com.aspose.ocr.RecognitionSettings;
import com.aspose.ocr.examples.License.SetLicense;
import com.aspose.ocr.examples.Utils;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class PerformOCROnImageFromUrl {

	public static void main(String[] args) {
		// ExStart:1
		//Create api instance
		AsposeOCR api = new AsposeOCR();

		String uri = "https://www.castlegateit.co.uk/wp-content/uploads/2016/09/justified_text.png";

		// set recognition options
		RecognitionSettings settings = new RecognitionSettings();
		settings.setAutoSkew(false);
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
		rectangles.add(new Rectangle(90,186,775,95));
		settings.setRecognitionAreas(rectangles);


		// get result object
		RecognitionResult result = null;
		try {
			result = api.RecognizePageFromUri(uri, settings);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// print result
		System.out.println("Result: \n" + result.recognitionText+"\n\n");
		System.out.println("RecognitionAreasText: \n");
		for(String text: result.recognitionAreasText) {
			System.out.println(text);
		}
		System.out.println("JSON: \n" + result.GetJson());
		System.out.println("Warnings: \n");
		for(String warning: result.warnings) {
			System.out.println(warning);
		}
		// ExEnd:1
	}
}
