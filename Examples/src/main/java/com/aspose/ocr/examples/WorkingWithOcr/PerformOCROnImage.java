/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.OCR. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.ocr.examples.WorkingWithOcr;

import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.examples.Utils;

public class PerformOCROnImage
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(PerformOCROnImage.class) + "WorkingWithOcr/";

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


