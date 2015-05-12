/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.OCR. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithocr.performocronimage.java;

import com.aspose.ocr.*;

public class PerformOCROnImage
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithocr/performocronimage/data/";

        /// Set the paths
        String imagePath = dataDir + "Sampleocr.bmp";

        // Create an instance of OcrEngine
        OcrEngine ocr = new OcrEngine();

        // Set image file
        ocr.setImage(ImageStream.fromFile(imagePath));

        // Perform OCR and get extracted text
        try {
            if (ocr.process()) {
                System.out.println("\ranswer -> " + ocr.getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


