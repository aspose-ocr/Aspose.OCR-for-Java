<?php
namespace Aspose\OCR\WorkingWithOCR;

use com\aspose\ocr\OcrEngine as OcrEngine;
use com\aspose\ocr\RecognitionBlock as RecognitionBlock;
use com\aspose\ocr\ImageStream as ImageStream;
class ExtractTextFromPartOfImage{
    public static function run($dataDir=null)
    {
        # Initialize an instance of OcrEngine
        $ocr_engine = new OcrEngine();

        # Clear notifier list
        $ocr_engine->clearNotifies();

        # Clear recognition blocks
        $ocr_engine->getConfig()->clearRecognitionBlocks();

        # Add 2 rectangle blocks to user defined recognition blocks
        $recognitionBlock = new RecognitionBlock();
        $ocr_engine->getConfig()->addRecognitionBlock($recognitionBlock->createTextBlock(52, 48, 67, 74));
        $ocr_engine->getConfig()->addRecognitionBlock($recognitionBlock->createTextBlock(100, 46, 38, 46));

        # Ignore everything else on the image other than the user defined recognition blocks
        $ocr_engine->getConfig()->setDetectTextRegions(false);

        # Set Image property by loading an image from file path
        $imageStream = new ImageStream();
        $ocr_engine->setImage($imageStream->fromFile($dataDir . 'ocr.png'));

        # Run recognition process
        if ($ocr_engine->process()) {
            # Retrieve an array of recognized text by parts
            $text = $ocr_engine->getText()->getPartsInfo();
            # Iterate over the text parts
            $i=0;
            while ($i < sizeof($text)){
            $info = $text[$i];
                # Display part information
                print "Block: " . (string)$info->getBox() . " Text: " . (string)$info->getText().PHP_EOL;
                $i+= 1;
            }
        }
    }
}
?>