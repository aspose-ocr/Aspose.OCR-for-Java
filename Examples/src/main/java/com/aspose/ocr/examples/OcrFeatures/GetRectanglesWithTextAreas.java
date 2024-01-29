package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.*;
import com.aspose.ocr.examples.License.SetLicense;
import com.aspose.ocr.examples.Utils;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class GetRectanglesWithTextAreas {

	public static void main(String[] args) throws IOException {
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(GetRectanglesWithTextAreas.class);

		// The image path
		String imagePath = dataDir + "p3.png";

		//Create api instance
		AsposeOCR api = new AsposeOCR();


		// Create OcrInput object and add images/documents for recognition
		OcrInput input = new OcrInput(InputType.SingleImage);
		input.add(imagePath);

		// Recognize page by full path to file
		try {
			ArrayList<RecognitionResult> result = api.Recognize(input);
			System.out.println("Result: " + result.get(0).recognitionText);
		} catch (IOException e) {
			e.printStackTrace();
		}

		//Get rectangles with text areas in the image.
		ArrayList<RectangleOutput> rectResult = api.DetectRectangles(input, AreasType.PARAGRAPHS, true);
		for(Rectangle r : rectResult.get(0).Rectangles) {
			System.out.println("Text area:  x: " + r.x + " y: "+ r.y + " width: " + +r.width + " height: " + r.height);
		}
		// ExEnd:1
	}
}
