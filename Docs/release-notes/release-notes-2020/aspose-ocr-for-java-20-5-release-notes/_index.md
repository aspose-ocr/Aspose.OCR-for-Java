---
title: Aspose.OCR for Java 20.5 - Release Notes
type: docs
weight: 10
url: /java/aspose-ocr-for-java-20-5-release-notes/
---

{{% alert color="primary" %}}

This page contains release notes information for Aspose.OCR for Java 20.5

{{% /alert %}}

Aspose.OCR for Java is a library for optical character recognition and document scanning. It allows you to scan documents and recognize characters include diacritic.

## Input Formats

For loading images used Image.IO build-in package in the Java core 1.8.

The Image I/O has built-in support for GIF, PNG, JPEG, BMP, and WBMP. The Image I/O is also extensible so that developers or administrators can "plug-in" support for additional formats. For example, plug-ins for TIFF and JPEG 2000 are separately available.

## Supported Characters

|   |   |   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|---|---|
| space | ! | " | # | $ | % | & | ' | ( | ) |
| * | + | , | - | . | / | 0 | 1 | 2 | 3 |
| 4 | 5 | 6 | 7 | 8 | 9 | : | ; | < | = |
| > | ? | @ | [ | \ | ] | _ | ` | { | \| |
| } | ~ | A | B | C | D | E | F | G | H |
| I | J | K | L | M | N | O | P | Q | R |
| S | T | U | V | W | X | Y | Z | a | b |
| c | d | e | f | g | h | i | j | k | l |
| m | n | o | p | q | r | s | t | u | v |
| w | x | y | z | Â | À | Á | Ã | Ä | Æ |
| Ç | È | É | Ê | Ë | Ì | Í | Î | Ï | Ñ |
| Ò | Ó | Ô | Õ | Ö | Ù | Ú | Û | Ü | ẞ |
| ß | à | á | â | ã | ä | æ | ç | è | é |
| ê | ë | ì | í | î | ï | ñ | ò | ó | ô |
| õ | ö | ù | ú | û | ü | ÿ | Œ | œ | Ÿ |

## Public API and Backwards Incompatible Changes

### New API

|**Method**|**Description**|
| :- | :- |
|AsposeOCR()|Create an API instance.|
|AsposeOCR(String alphabet)|alphabet - String with allowed symbols in the alphabet. Create an API instance.|
|double CalcSkewImage(BufferedImage image)|image - BufferedImage instance. Return Skew angle in degrees.|
|double CalcSkewImage(String fullPath)|fullPath - path to the image. Return Skew angle in degrees.|
|ArrayList\<Rectangle> getTextAreas()|Get a List of rectangles with text areas on the page (in pixels).|
|void License.setLicense(String filename)|filename - path to the license XML file.|
|boolean License.isValid()|Check license is valid.|
|String RecognizeLine(String fullPath)|String RecognizeLine(String fullPath)|
|String RecognizeLine(BufferedImage image_)|image - BufferedImage instance.|
|String RecognizePage(String fullPath)|fullPath - path to the image. Recognizing image with automatic detection of text areas and detecting, correct the skew of the text.|
|String RecognizePage(String fullPath, boolean autoSkew)|fullPath - path to image. autoSkew - Auto-skew text. Recognizing image with automatic detection of text areas.|
|String RecognizePage(BufferedImage image)|image - BufferedImage instance. Recognizing image with automatic detection of text areas and detecting, correct the skew of the text.|
|String RecognizePage(BufferedImage image, boolean autoSkew)|image - BufferedImage instance. autoSkew - Auto-skew text. Recognizing image with automatic detection of text areas.|
|String RecognizePage(String fullPath, ArrayList\<Rectangle> boxes_)|fullPath - path to image. boxes_ - list of rectangles.|
|String RecognizePage(BufferedImage image_, ArrayList\<Rectangle> boxes_)|image_ - BufferedImage instance. boxes_ - list of rectangles.|
|String RecognizePage(String fullPath, Rectangle box)|fullPath - path to image. box - rectangle for recognize.|
|String RecognizePage(BufferedImage image_, Rectangle box)|image_ - BufferedImage instance. box - rectangle for recognize.|

### Removed APIs

All methods of the previous release are not supported.

## Usage Example

{{< highlight java >}}

import static java.lang.System.out;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import com.aspose.ocr.AsposeOCR;
import com.aspose.ocr.License;

public class Examples {

    public static void main(String[] args) {
         
        /** 
         * Page recognition with automatic text skew alignment 
         * */       
 
        //Current directory
        String samplesDir = System.getProperty("user.dir") + "/resources";
 
        //Set license
        String file = samplesDir + "/licenses/Aspose.Total.lic";
        License.setLicense(file); 
 
        //Check license
        boolean resLicense = License.isValid();
        out.println("License is :" + resLicense);
         
        // Get image from samples directory
        file = samplesDir + "/images/p3.png";
 
        //Create api instance
        AsposeOCR api = new AsposeOCR();
 
        // Get test skew
        try {
            double angle = api.CalcSkewImage(file);
            System.out.println("Skew text is:" + angle + " degrees.");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
  
        // Recognize page by full path to file
        try {
            String result = api.RecognizePage(file);
            out.println("Result: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
         
        // Recognize page from BufferedImage
        try {
            BufferedImage loaded = ImageIO.read(new File(file));
            String result = api.RecognizePage(loaded);
            out.println("Result BufferedImage: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        //Get rectangles with text areas in the image.
        ArrayList<Rectangle> rectResult = api.getTextAreas();
        for(Rectangle r : rectResult) {
            out.println("Text area:" + r);
        }
 
        // Get image from samples directory
        file = samplesDir + "/images/p.png";
         
        //Prepare rectangles with texts.
        ArrayList<Rectangle> rectArray = new ArrayList<Rectangle>();
         
        rectArray.add(new Rectangle(138, 352, 2033, 537));
        rectArray.add(new Rectangle(147, 890, 2033, 1157));        
        rectArray.add(new Rectangle(923, 2045, 465, 102));        
        rectArray.add(new Rectangle(104, 2147, 2076, 819));        
 
        try {
            String result = api.RecognizePage(file, rectArray);
            out.println("Result with rect: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
 
         
        /** 
         * Line recognition (numbers) 
         * */       
         
        file = samplesDir + "/images/0001460985.Jpeg";
         
        try {
            String result = api.RecognizeLine(file);
            out.println("File: " + file);
            out.println("Result line: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        file = samplesDir + "/images/0002240177.Jpeg";
         
        try {
            String result = api.RecognizeLine(file);
            out.println("File: " + file);
            out.println("Result line: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
         
        //Create api instance with alphabet
        api = new AsposeOCR("0123456789");
         
        file = samplesDir + "/images/0001460985.Jpeg";
         
        try {
            String result = api.RecognizeLine(file);
            out.println("File: " + file);
            out.println("Result line with alphabet: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        file = samplesDir + "/images/0002240177.Jpeg";
         
        try {
            String result = api.RecognizeLine(file);
            out.println("File: " + file);
            out.println("Result line with alphabet: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
         
        out.println("Finish!!!!!!!!!!!!!!!!!");
    }
}

{{< /highlight >}}
