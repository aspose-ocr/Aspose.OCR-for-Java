package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.*;
import com.aspose.ocr.examples.Utils;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Preprocessing {

	public static void main(String[] args) throws IOException {
		//SetLicense.main(null);
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(Preprocessing.class);

		// The image path
		String imagePath = dataDir + "atlantis.jpg";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		// Set preprocessing filters to preprocess image before recognition.
		PreprocessingFilter filters = new PreprocessingFilter();
		filters.add(PreprocessingFilter.AutoDewarping());

		// Create OcrInput object and add images/documents for recognition.
		OcrInput input = new OcrInput(InputType.SingleImage, filters);
		input.add(imagePath);

		OcrInput output = ImageProcessing.Render(input);

		// Save on the disk.
		File outputSource = new File("preprocessed.png");
		ImageIO.write(output.get(0).Image, "png", outputSource);

		// Recognize preprocessed image.
		try {
			ArrayList<RecognitionResult> result = api.Recognize(output);
			System.out.println("Result: " + result.get(0).recognitionText);
		} catch (IOException e) {
			e.printStackTrace();
		}

		output.clear();

		//Preprocess and save on the disk.
		output = ImageProcessing.Save(input,"./");

		input.clear();
		output.clear();

		// ExEnd:1
	}
}
