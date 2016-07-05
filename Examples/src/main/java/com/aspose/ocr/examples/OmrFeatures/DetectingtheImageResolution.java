package com.aspose.ocr.examples.OmrFeatures;

import java.util.Set;

import com.aspose.ocr.examples.Utils;
import com.aspose.omr.OmrEngine;
import com.aspose.omr.OmrImage;
import com.aspose.omr.OmrProcessingResult;
import com.aspose.omr.OmrTemplate;
import com.aspose.omr.StringDictionary;

public class DetectingtheImageResolution {
	public static void main(String[] args) throws Exception {
		// ExStart:DetectingtheImageResolution
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(DetectingtheImageResolution.class);

		// Load the image to be analyzed
		OmrImage image = OmrImage.load(dataDir + "sample1.jpg");

		// Set the auto image resolution detection property
		image.setAutoDetectResolution(true);

		// Load template file
		OmrTemplate template = OmrTemplate.load(dataDir + "sample_1.amr");

		// Instantiate the recognition engine for the template
		OmrEngine engine = new OmrEngine(template);

		// Extract data. This template has only one page.
		OmrProcessingResult result = engine.extractData(new OmrImage[] { image });

		// Get page data of extracted data
		StringDictionary[] pages = result.getPageData();

		int index = 0;
		// Iterate over the pages and display the data
		for (StringDictionary page : pages) {
			System.out.println("------Page: " + index++);
			Set<String> keys = page.keySet();
			for (Object key : keys) {
				String value = page.get(key);
				System.out.println("key: " + key);
				System.out.println("value: '" + value + "'");
			}
		}
		// ExEnd:DetectingtheImageResolution
	}

}
