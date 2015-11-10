<?php
namespace Aspose\OCR\WorkingWithOCR;

use com\aspose\ocr\OcrEngine as OcrEngine;
use com\aspose\ocr\ImageStream as ImageStream;

class DetectReading{
    public static function run($dataDir=null){

        # Initialize an instance of OcrEngine
        $ocr_engine = new OcrEngine();

        # Set the Image property by loading the image from file path location
        $imageStream=new ImageStream();
        $ocr_engine->setImage($imageStream->fromFile($dataDir . 'ocr.png'));

        # Set the DetectReadingOrder to true
        $ocr_engine->getConfig()->setDetectReadingOrder(true);

        # Process the image
        if ($ocr_engine->process()) {
            # Display the result
            print "Text: " . (string)$ocr_engine->getText().PHP_EOL;
        }
    }
}
?>