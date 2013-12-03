/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.OCR. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithocr.performocronimage.java;

import com.aspose.ocr.ILanguage;
import com.aspose.ocr.Language;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.ResourcesSource;

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
        String xmlEtalonFileName = "englishStandarts";
        String fontCollectionFileName = "arialAndTimesAndCourierRegular.xml.bin";
        String resourcesFilePath = "../lib/resources.zip";

        // Create an instance of OcrEngine class but providing required.
        // parameters
        OcrEngine ocr = new OcrEngine(ResourcesSource.BINARY_ZIP_FILE,
                resourcesFilePath, xmlEtalonFileName, fontCollectionFileName);
        ocr.getConfig().setNeedRotationCorrection(false);

        // Set image file.
        File image = new File(imagePath);
        ocr.setImage(image);

        // Add language..
        ILanguage language = Language.load("english");
        ocr.getLanguages().addLanguage(language);

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

