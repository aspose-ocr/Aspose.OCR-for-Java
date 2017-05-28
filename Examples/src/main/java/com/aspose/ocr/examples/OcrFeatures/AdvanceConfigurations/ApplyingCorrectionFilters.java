package com.aspose.ocr.examples.OcrFeatures.AdvanceConfigurations;

import com.aspose.ocr.CorrectionFilters;
import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.examples.Utils;
import com.aspose.ocr.filters.Filter;
import com.aspose.ocr.filters.GaussBlurFilter;
import com.aspose.ocr.filters.MedianFilter;
import com.aspose.ocr.filters.RemoveNoiseFilter;

public class ApplyingCorrectionFilters {
	public static void main(String[] args) throws Exception {
		// ExStart:ApplyingCorrectionFilters
		// Initialize OcrEngine
		OcrEngine ocr = new OcrEngine();

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ApplyingCorrectionFilters.class) + "OcrFeatures/";

		/// Set the paths
		String imagePath = dataDir + "Sample1.jpg";

		// Set the image for instance of OcrEngine
		ocr.setImage(ImageStream.fromFile(imagePath));

		//// Set filters
		// Create CorrectionFilters collection
		CorrectionFilters filters = new CorrectionFilters();
		Filter filter = null;

		// Initialize Median filter
		filter = new MedianFilter(5);
		filters.add(filter);

		// Create Gaussian Blur filter
		filter = new GaussBlurFilter();
		filters.add(filter);

		// Assign collection to OcrEngine
		ocr.getConfig().setCorrectionFilters(filters);

		// Perform OCR operation
		ocr.process();

		System.out.println("Whole result is " + ocr.getText());
		// ExEnd:ApplyingCorrectionFilters
	}

}
