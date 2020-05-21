package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.AsposeOCR;
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

		//Prepare rectangles with texts.
		ArrayList<Rectangle> rectArray = new ArrayList<Rectangle>();

		rectArray.add(new Rectangle(138, 352, 2033, 537));
		rectArray.add(new Rectangle(147, 890, 2033, 1157));
		rectArray.add(new Rectangle(923, 2045, 465, 102));
		rectArray.add(new Rectangle(104, 2147, 2076, 819));

		try {
			String result = api.RecognizePage(imagePath, rectArray);
			System.out.println("Result with rect: " + result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ExEnd:1
	}
}
