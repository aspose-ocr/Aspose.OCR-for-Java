package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.*;
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

		String uri = "https://imgv3.fotor.com/images/blog-richtext-image/How-to-Make-Text-Stand-Out-And-More-Readable.jpg";

		// Set preprocessing filters to rotate image before recognition.
		PreprocessingFilter filters = new PreprocessingFilter();
		filters.add(PreprocessingFilter.AutoSkew());

		// Create OcrInput object and add images/documents for recognition
		OcrInput input = new OcrInput(InputType.URL, filters);
		input.add(uri);

		// get result object
		ArrayList<RecognitionResult> result = null;
		try {
			result = api.Recognize(input);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// print result
		System.out.println("Result: \n" + result.get(0).recognitionText+"\n\n");
		System.out.println("RecognitionAreasText: \n");
		for(String text: result.get(0).recognitionAreasText) {
			System.out.println(text);
		}
		System.out.println("JSON: \n" + result.get(0).GetJson());
		System.out.println("Warnings: \n");
		for(String warning: result.get(0).warnings) {
			System.out.println(warning);
		}
		// ExEnd:1
	}
}
