<?php
namespace Aspose\OCR\WorkingWithOCR;

use com\aspose\ocr\OcrEngine as OcrEngine;
use com\aspose\ocr\ImageStream as ImageStream;
class LoadImageFromUrl{
    public static function run($dataDir=null){

        # Initialize an instance of OcrEngine
        $ocr_engine = new OcrEngine();

        # Set the Image property by loading the image from remote location
        $imageStream=new ImageStream();
        $ocr_engine->setImage($imageStream->fromUrl("http://cdn.aspose.com/tmp/ocr-sample.bmp"));

        # Process the image
        if ($ocr_engine->process()) {
            # Display the recognized text
            print "Text: " . (string)$ocr_engine->getText().PHP_EOL;
        }
    }
}
?>