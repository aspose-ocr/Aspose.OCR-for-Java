package com.aspose.ocr.examples.OmrFeatures;

import com.aspose.omr.OmrEngine;
import com.aspose.omr.OmrImage;
import com.aspose.omr.OmrProcessingResult;
import com.aspose.omr.OmrTemplate;

public class LoadOMRtemplatefromURL {
	public static void main(String[] args) throws Exception {
		String templateUrl = "http://techslides.com/demos/samples/sample.amr";
		String imageUrl = "https://sampleurl.com/image.jpg";

		// Initialize an instance of OmrTemplate by loading the OMR template
		// from URL
		OmrTemplate template = OmrTemplate.loadFromUrl(templateUrl);

		// image loading from url
		OmrImage image = OmrImage.load(imageUrl);

		// continue working with template and image as usual
		OmrEngine engine = new OmrEngine(template);
		OmrProcessingResult result = engine.extractData(new OmrImage[] { image });

		// Do processing

	}

}
