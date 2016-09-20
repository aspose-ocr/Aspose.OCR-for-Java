package com.aspose.ocr.examples.OmrFeatures;

import javax.imageio.ImageIO;

import com.aspose.ocr.examples.Utils;

public class SkewImageCorrectionAlgorithm {
	public static void main(String[] args) throws Exception {
		
		// Load image
		String dataDir = Utils.getSharedDataDir(SkewImageCorrectionAlgorithm.class) + "OmrFeatures/";
		com.aspose.omr.OmrImage image = com.aspose.omr.OmrImage.load(dataDir + "sample1.jpg");

		// Area of the image to be processed
		java.awt.Rectangle area = new java.awt.Rectangle(0, 0, image.getWidth(), image.getHeight());

		// Grayscale conversion
		com.aspose.omr.imageprocessing.GrayscaleAlgorithm gs = new com.aspose.omr.imageprocessing.GrayscaleAlgorithm();
		gs.process(image, area);

		// Binarization
		com.aspose.omr.imageprocessing.AverageThresholdAlgorithm threshold = new com.aspose.omr.imageprocessing.AverageThresholdAlgorithm();
		threshold.process(image, area);

		// Skew correction
		com.aspose.omr.imageprocessing.SkewCorrectionAlgorithm skewCorrection = new com.aspose.omr.imageprocessing.SkewCorrectionAlgorithm();
		skewCorrection.process(image, area);

		// save image
		java.io.File fileObj = new java.io.File(dataDir + "SkewImageCorrectionAlgorithm_out.jpg");
		ImageIO.write(image. asBitmap(), "jpg", fileObj);

	}

}
