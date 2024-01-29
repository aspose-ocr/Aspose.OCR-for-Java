package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.*;
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
		String imagePath = dataDir + "p3.png";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		// Set preprocessing filters to rotate image before recognition.
		PreprocessingFilter filters = new PreprocessingFilter();
		filters.add(PreprocessingFilter.Rotate(0.5f));

		// Create OcrInput object and add images/documents for recognition
		OcrInput input = new OcrInput(InputType.SingleImage, filters);
		input.add(imagePath);

		// set recognition options
		RecognitionSettings settings = new RecognitionSettings();
		settings.setLanguage(Language.Eng);

		// get result object
		ArrayList<RecognitionResult> result = null;
		try {
			result = api.Recognize(input, settings);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// print result
		System.out.println("Result: \n" + result.get(0).recognitionText+"\n\n");
		for(String n: result.get(0).recognitionAreasText) {
			System.out.println ( n );
		}
		for(Rectangle n: result.get(0).recognitionAreasRectangles) {
			System.out.println(n.height+":"+n.width+":"+n.x+":"+n.y);
		}
		System.out.println("\nJSON:" + result.get(0).GetJson());
		System.out.println("angle:" + result.get(0).skew);
		for(String n: result.get(0).warnings) {
			System.out.println ( n );
		}
		// ExEnd:1

		System.out.println("OCROperationWithLanguageSelection: execution complete");
	}
}
