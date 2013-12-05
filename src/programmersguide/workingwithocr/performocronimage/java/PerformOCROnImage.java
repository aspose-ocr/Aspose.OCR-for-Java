/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.OCR. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithocr.performocronimage.java;

import com.aspose.ocr.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class PerformOCROnImage
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithocr/performocronimage/data/";

        // Set the paths
        String imagePath = dataDir + "Sampleocr.bmp";
        String resourcesFilePath = dataDir + "../../../../../../lib/resources.zip";

        // Create an instance of OcrEngine class but providing required.
        // parameters
        OcrEngine ocr = new OcrEngine();

        // Set image file.
        ocr.setImage(ImageStream.fromFile(imagePath));

        // Set Resources for OcrEngine
        ocr.setResource(new ZipFileStream(resourcesFilePath));

        // Add language..
        ILanguage language = Language.load("english");
        ocr.getLanguages().addLanguage(language);

        // Set NeedRotationCorrection property to false
        ocr.getConfig().setNeedRotationCorrection(false);

        // Perform OCR and get extracted text.
        try {
            if (ocr.process()) {
                System.out.println("\ranswer -> " + ocr.getText());
                BufferedWriter out = new BufferedWriter(new FileWriter(dataDir + "Output.txt"));
                out.write(ocr.getText().toString());
                out.close();
                System.out.println("OCR performed on Input Image successfully.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }


    }
}

