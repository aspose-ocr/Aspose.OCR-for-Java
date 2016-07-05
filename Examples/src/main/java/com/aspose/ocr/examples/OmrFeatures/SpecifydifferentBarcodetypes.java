package com.aspose.ocr.examples.OmrFeatures;

import java.awt.geom.Point2D;

import com.aspose.ocr.examples.Utils;
import com.aspose.omr.OmrTemplate;
import com.aspose.omr.elements.BarcodeElement;

public class SpecifydifferentBarcodetypes {
	public static void main(String[] args) throws Exception {
		// ExStart:SpecifydifferentBarcodetypes
		String dataDir = Utils.getDataDir(SpecifydifferentBarcodetypes.class);

		String templateFile = dataDir + "sample_1.amr";
		String imageFile = dataDir + "sample1.jpg";

		// Set the license for Aspose.BarCode for Java in case BarCode elements
		// are used in the project
		com.aspose.barcode.License licenseBarCode = new com.aspose.barcode.License();
		licenseBarCode.setLicense(dataDir + "Aspose.Total.Java.lic");

		// Set the license for OMR package
		com.aspose.ocr.License licenseOmr = new com.aspose.ocr.License();
		licenseOmr.setLicense(dataDir + "Aspose.Total.Java.lic");

		// Load the template for mapping of elements
		OmrTemplate template = OmrTemplate.load(templateFile);

		// Add the BarCode element while specifying the location and size of
		// barcode
		java.awt.Dimension objDimension = new java.awt.Dimension(205, 205);
		BarcodeElement barcodeElement = new BarcodeElement("aztec", new Point2D.Float(0, 0), objDimension);

		// Set the symbologies type of the element.
		barcodeElement.setBarCodeType(com.aspose.barcoderecognition.BarCodeReadType.Aztec);

		// Do Processing
		// ExEnd:SpecifydifferentBarcodetypes
	}

}
