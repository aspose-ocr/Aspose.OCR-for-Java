<?php
namespace Aspose\OCR\WorkingWithOCR;

use com\aspose\ocr\OcrEngine as OcrEngine;
use com\aspose\ocr\ImageStream as ImageStream;

use java\util\regex\Pattern as Pattern;
class RecognizeWhiteListedCharacters{
    public static function run($dataDir=null)
    {

        # Initialize an instance of OcrEngine
        $ocr_engine = new OcrEngine();

        # Retrieve the OcrConfig of the OcrEngine object
        $ocr_config = $ocr_engine->getConfig();

        # Set the Whitelist property to recognize numbers only
        #ocr_config.setWhitelist(['1', '2', '3', '4', '5', '6', '7', '8', '9', '0'])

        # Set the Image property by loading the image from file path location
        $imageStream = new ImageStream();
        $ocr_engine->setImage($imageStream->fromFile($dataDir . 'ocr.png'));

        # Set the RemoveNonText to true
        $ocr_engine->getConfig()->setRemoveNonText(true);

        # Process the image
        if ($ocr_engine->process()) {
            $text = $ocr_engine->getText();
            print "Text: " . (string)$text;

            $expression = "(\\d+)";
            # Create a Pattern object
            $pattern = new Pattern();
            $pattern = $pattern->compile($expression);

            # Now create matcher object
            $matcher = $pattern->matcher((string)$text);
            if ($matcher->find()){
                print "Found value: ". (string)$matcher.PHP_EOL;//->group(0);
            }
        }
    }
}
?>