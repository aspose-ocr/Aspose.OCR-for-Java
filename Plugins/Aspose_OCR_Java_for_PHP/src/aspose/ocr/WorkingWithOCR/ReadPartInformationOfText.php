<?php
namespace Aspose\OCR\WorkingWithOCR;

use com\aspose\ocr\OcrEngine as OcrEngine;
use com\aspose\ocr\ImageStream as ImageStream;

class ReadPartInformationOfText{
    public static function run($dataDir=null){

        # Initialize an instance of OcrEngine
        $ocr_engine = new OcrEngine();

        # Set the Image property by loading the image from file path location
        $imageStream=new ImageStream();
        $ocr_engine->setImage($imageStream->fromFile($dataDir . 'ocr.png'));

        # Process the image
        if ($ocr_engine->process()) {
            # Display the recognized text
            print "Text: " . (string)$ocr_engine->getText();

            # Retrieve an array of recognized text by parts
            $text = $ocr_engine->getText()->getPartsInfo();
            # Iterate over the text parts
            $i = 0;
            while ($i < sizeof($text)) {
                $symbol = $text[$i];
                # Display part information
                print "isItalic : " . (string)$symbol->getItalic().PHP_EOL;
                print "isUnderline : " . (string)$symbol->getUnderline().PHP_EOL;
                print "isBold : " . (string)$symbol->getBold().PHP_EOL;
                print "Text Color : " . (string)$symbol->getTextColor().PHP_EOL;
                print "Quality : " . (string)$symbol->getCharactersQuality().PHP_EOL;
                $i += 1;
            }
        }
    }
}
?>