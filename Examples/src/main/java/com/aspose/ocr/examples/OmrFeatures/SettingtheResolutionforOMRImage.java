package com.aspose.ocr.examples.OmrFeatures;

import com.aspose.ocr.examples.Utils;
import com.aspose.omr.OmrImage;

public class SettingtheResolutionforOMRImage {
	public static void main(String[] args) throws Exception {
		// ExStart:SettingtheResolutionforOMRImage
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SettingtheResolutionforOMRImage.class) + "OmrFeatures/";

		// Load the image to be analyzed
		OmrImage image = OmrImage.load(dataDir + "sample1.jpg");

		// Define new value of image resolution in double format
		image.setResolution(210.0); // overwrites the old DPI value
		// ExEnd:SettingtheResolutionforOMRImage
	}

}
