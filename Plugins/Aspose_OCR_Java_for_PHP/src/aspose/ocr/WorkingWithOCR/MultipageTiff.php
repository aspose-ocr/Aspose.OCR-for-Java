<?php
namespace Aspose\OCR\WorkingWithOCR;

use com\aspose\ocr\OcrEngine as OcrEngine;
use com\aspose\ocr\ImageStream as ImageStream;
class MultipageTiff{
    public static function run($dataDir=null){

        # Initialize an instance of OcrEngine
        $ocr_engine = new OcrEngine();

        # Set the Image property by loading the image from file path location
        $imageStream=new ImageStream();
        $ocr_engine->setImage($imageStream->fromFile($dataDir . 'multipage.tiff'));

        # Set OcrEngine.ProcessAllPages to true in order to process all pages of TIFF in single run
        $ocr_engine->setProcessAllPages(true);

        # Process the image
        if ($ocr_engine->process()) {
            # Retrieve the list of Pages
        $pages = $ocr_engine->getPages();
            foreach($pages as $page) {
            print "Text: " . (string)$page->getPageText().PHP_EOL;
            }
        }
    }
}
?>