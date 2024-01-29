package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.*;
import com.aspose.ocr.examples.Utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class PerformOCROnBufferedImage {

	public static void main(String[] args) {
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(PerformOCROnBufferedImage.class);

		// The image path
		String imagePath = dataDir + "p3.png";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		// Recognize page from BufferedImage
		try {
			BufferedImage loaded = ImageIO.read(new File(imagePath));

			PreprocessingFilter filters = new PreprocessingFilter();
			filters.add(PreprocessingFilter.AutoSkew());

			// Create OcrInput object and add images/documents for recognition
			OcrInput input = new OcrInput(InputType.SingleImage, filters);
			input.add(loaded);

			ArrayList<RecognitionResult> result = api.Recognize(input);
			System.out.println("Result BufferedImage: " + result.get(0).recognitionText);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ExEnd:1
	}
}
