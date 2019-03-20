package com.aspose.ocr.examples.OcrFeatures.AdvanceConfigurations;

import java.io.File;
import javax.imageio.ImageIO;
import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.examples.Utils;

public class ExtractPreprocessedImages {
	public static void main(String[] args) throws Exception {
		// ExStart:ExtractPreprocessedImages
		// Initialize an instance of OcrEngine
		OcrEngine ocrEngine = new OcrEngine();

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ExtractPreprocessedImages.class);

		// The image path
		String imagePath = dataDir + "Sample.jpg";

		// Set Image property by loading an image from file path
		ocrEngine.setImage(ImageStream.fromFile(imagePath));

		// Set the SavePreprocessedImages property to true to save the images
		ocrEngine.getConfig().setSavePreprocessedImages(true);

		if (ocrEngine.process()) {
			//Save binarized image on disc
			ImageIO.write(ocrEngine.getPreprocessedImages().getBinarizedImage(), "png", new File(dataDir + "Output\\BinarizedImage.png"));

            //Save filtered image on disc
			ImageIO.write(ocrEngine.getPreprocessedImages().getFilteredImage(), "png", new File(dataDir + "Output\\FilteredImage.png"));

            //Save image after removing non-textual fragments
			ImageIO.write(ocrEngine.getPreprocessedImages().getNonTextRemovedImage(), "png", new File(dataDir + "Output\\NonTextRemovedImage.png"));

            //Save image after skew correction
			ImageIO.write(ocrEngine.getPreprocessedImages().getRotatedImage(), "png", new File(dataDir + "Output\\RotatedImage.png"));

            //Save image after textual block detection
			ImageIO.write(ocrEngine.getPreprocessedImages().getTextBlocksImage(), "png", new File(dataDir + "Output\\TextBlocksImage.png"));
			
			System.out.println(ocrEngine.getText());
		}
		// ExEnd:ExtractPreprocessedImages
	}
}