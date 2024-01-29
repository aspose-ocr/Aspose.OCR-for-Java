package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.*;
import com.aspose.ocr.examples.Utils;

import java.io.IOException;
import java.util.ArrayList;

public class SaveResultToFile {

	public static void main(String[] args) {
		//SetLicense.main(null);
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SaveResultToFile.class);

		// The image path
		String imagePath1 = dataDir + "p3.png";
		String imagePath2 = dataDir + "Receipt.jpg";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		// Set preprocessing filters to rotate image before recognition.
		PreprocessingFilter filters = new PreprocessingFilter();
		filters.add(PreprocessingFilter.AutoSkew());

		// Create OcrInput object and add images/documents for recognition
		OcrInput input = new OcrInput(InputType.SingleImage, filters);
		input.add(imagePath1);
		input.add(imagePath2);

		// Recognize page by full path to file
		try {
			ArrayList<RecognitionResult> result = api.Recognize(input);

			AsposeOCR.SaveMultipageDocument("output.txt", Format.Text, result);
			AsposeOCR.SaveMultipageDocument("output.pdf", Format.Pdf, result);
			AsposeOCR.SaveMultipageDocument("output.xlsx", Format.Xlsx, result);
			AsposeOCR.SaveMultipageDocument("output.html", Format.Html, result);
			AsposeOCR.SaveMultipageDocument("output.docx", Format.Docx, result);
			AsposeOCR.SaveMultipageDocument("output.json", Format.Json, result);
		} catch (IOException e) {
			e.printStackTrace();
		}

		input.clear();
		// ExEnd:1
	}
}
