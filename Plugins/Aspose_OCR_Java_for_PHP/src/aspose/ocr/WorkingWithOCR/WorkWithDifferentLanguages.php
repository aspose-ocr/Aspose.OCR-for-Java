<?php
namespace Aspose\OCR\WorkingWithOCR;

use com\aspose\ocr\OcrEngine as OcrEngine;
use com\aspose\ocr\ImageStream as ImageStream;
use com\aspose\ocr\LanguageFactory as LanguageFactory;

class WorkWithDifferentLanguages{

    public static function run($dataDir=null)
    {


        # Initialize an instance of OcrEngine
        $ocr_engine = new OcrEngine();

        # Set the Image property by loading the image from file path location
        $imageStream = new ImageStream();
        $ocr_engine->setImage($imageStream->fromFile($dataDir . 'spanish.png'));

        # Clear the default language (English)
        $ocr_engine->getLanguageContainer()->clear();

        # Load the resources of the language from file path location or an instance of InputStream

        $languageFactory = new LanguageFactory();
        $ocr_engine->getLanguageContainer()->addLanguage($languageFactory->load($dataDir . "SpanishLanguageResources.zip"));

        # Process the image
        if ($ocr_engine->process()) {
            # Display the recognized text
            print "Text: " . (string)$ocr_engine->getText().PHP_EOL;
            }
        }
    }
?>