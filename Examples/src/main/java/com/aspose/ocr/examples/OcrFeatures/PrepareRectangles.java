package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.*;
import com.aspose.ocr.examples.License.SetLicense;
import com.aspose.ocr.examples.Utils;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class PrepareRectangles {

	public static void main(String[] args) {
		//SetLicense.main(null);
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(PrepareRectangles.class);

		// The image path
		String imagePath = dataDir + "p.png";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		// Create OcrInput object and add images/documents for recognition
		OcrInput input = new OcrInput(InputType.SingleImage);
		input.add(imagePath);

		//Prepare rectangles with texts.
		ArrayList<Rectangle> rectArray = new ArrayList<Rectangle>();

		rectArray.add(new Rectangle(138, 352, 2033, 537));
		rectArray.add(new Rectangle(147, 890, 2033, 1157));
		rectArray.add(new Rectangle(923, 2045, 465, 102));
		rectArray.add(new Rectangle(104, 2147, 2076, 819));

		RecognitionSettings settings = new RecognitionSettings();
		settings.setRecognitionAreas(rectArray);

		try {
			ArrayList<RecognitionResult> result = api.Recognize(input, settings);
			System.out.println("Result with rect: " + result.get(0).recognitionText);

			for(Rectangle r : result.get(0).recognitionAreasRectangles) {
				System.out.println("area: x: " + r.x + " y: " + r.y + " width: " + r.width + " height: " + r.height);
			}

			for(String str : result.get(0).recognitionAreasText) {
				System.out.println("text in area: " + str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ExEnd:1
	}
}
