package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.examples.Utils;
import com.aspose.pdf.Document;
import com.aspose.pdf.devices.JpegDevice;
import com.aspose.pdf.devices.Resolution;

public class PerformOCROnPDF {
	public static void main(String[] args) throws Exception {

		// ExStart:PerformOCROnPDF
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(PerformOCROnPDF.class);

		//Create an instance of Document to load the PDF file
		Document pdfDocument = new Document(dataDir + "Sample.pdf");

		// Create an instance of OcrEngine
		OcrEngine ocrEngine = new OcrEngine();
		
		//Iterate over the pages of PDF
		for(int pageCount = 1; pageCount <= pdfDocument.getPages().size(); pageCount++) {
			//Create Resolution object with DPI value
			Resolution resolution = new com.aspose.pdf.devices.Resolution(300);
			
			//Create JPEG device with specified attributes (Width, Height, Resolution, Quality)
            //where Quality [0-100], 100 is Maximum
			JpegDevice jpegDevice = new com.aspose.pdf.devices.JpegDevice(resolution, 100);
			
			// Create stream object to save the output image
			java.io.OutputStream imageStream = new java.io.FileOutputStream(dataDir + "Output\\Converted_PDF_Image" + pageCount + ".jpg");
			
			//Convert a particular page and save the image to stream
			jpegDevice.process(pdfDocument.getPages().get_Item(pageCount), imageStream);

            //Set Image property of OcrEngine to the image obtained from previous step
			ocrEngine.setImage(ImageStream.fromFile(dataDir + "Output\\Converted_PDF_Image" + pageCount + ".jpg"));
            
            //Perform OCR operation
            if (ocrEngine.process())
            {
                System.out.println(ocrEngine.getText());
            }
		}
		// ExEnd:PerformOCROnPDF
	}
}
