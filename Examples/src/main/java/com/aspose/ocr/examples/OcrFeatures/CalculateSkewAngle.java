package com.aspose.ocr.examples.OcrFeatures;
import com.aspose.ocr.AsposeOCR;
import com.aspose.ocr.InputType;
import com.aspose.ocr.OcrInput;
import com.aspose.ocr.SkewOutput;
import com.aspose.ocr.examples.Utils;

import java.io.IOException;
import java.util.ArrayList;

public class CalculateSkewAngle {

	public static void main(String[] args) {
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(CalculateSkewAngle.class);

		// The image path
		String imagePath = dataDir + "p3.png";
		String uri = "https://felix.abecassis.me/wp-content/uploads/2011/09/p16-150x150.jpg";
		String pdfFile = dataDir + "multi_page_1.pdf";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		// Create OcrInput object and add image for skew detection
		OcrInput input = new OcrInput(InputType.SingleImage);
		input.add(imagePath);

		// Get test skew
		try {
			ArrayList<SkewOutput> angle = api.CalculateSkew(input);
			System.out.println("Image:" + angle.get(0).Source);
			System.out.println("Skew text is:" + angle.get(0).Angle + " degrees.");
		} catch (IOException e1) {
			e1.printStackTrace();
		}


		// Create OcrInput object and add URL for skew detection
		input = new OcrInput(InputType.URL);
		input.add(uri);

		// Get test skew
		try {
			ArrayList<SkewOutput> angle = api.CalculateSkew(input);
			System.out.println("Image:" + angle.get(0).Source);
			System.out.println("Skew text is:" + angle.get(0).Angle + " degrees.");
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// Create OcrInput object and add URL for skew detection
		input = new OcrInput(InputType.PDF);
		input.add(pdfFile,0,1);

		// Get test skew
		try {
			ArrayList<SkewOutput> angle = api.CalculateSkew(input);
			System.out.println("Image:" + angle.get(0).Source);
			System.out.println("Skew text is:" + angle.get(0).Angle + " degrees.");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// ExEnd:1
	}
}
