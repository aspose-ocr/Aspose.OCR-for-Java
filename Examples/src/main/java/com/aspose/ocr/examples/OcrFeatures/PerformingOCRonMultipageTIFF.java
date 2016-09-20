package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.Page;
import com.aspose.ocr.examples.Utils;

public class PerformingOCRonMultipageTIFF {
	public static void main(String[] args) throws Exception {
		// ExStart:PerformingOCRonMultipageTIFF
		// Create an initialize an instance of OcrEngine
		OcrEngine engine = new OcrEngine();

		String dataDir = Utils.getSharedDataDir(PerformingOCRonMultipageTIFF.class) + "OcrFeatures/";

		/// Set the paths
		String imagePath = dataDir + "new.tiff";

		// Set the OcrEngine.Image property by loading a multipage TIFF from
		// disk, memory or URL
		engine.setImage(ImageStream.fromFile(imagePath));

		// Set OcrEngine.ProcessAllPages to true in order to process all pages
		// of TIFF in single run
		engine.setProcessAllPages(true);

		// Call OcrEngine.Process method to perform OCR operation
		if (engine.process()) {
			// Retrieve the list of Pages
			Page[] pages = engine.getPages();

			// Iterate over the list of Pages
			for (Page page : pages) {
				// Display the recognized text from each Page
				System.out.println(page.getPageText());
			}
		}
		// ExEnd:PerformingOCRonMultipageTIFF
	}

}
