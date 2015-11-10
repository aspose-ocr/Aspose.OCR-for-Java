<?php
namespace Aspose\OCR\WorkingWithOCR;

use com\aspose\ocr\OcrEngine as OcrEngine;
use com\aspose\ocr\ImageStream as ImageStream;

class GetTextPartHierarchyOfText{
    public static function run($dataDir=null){
        # Initialize an instance of OcrEngine
        $ocr_engine = new OcrEngine();

        # Set the Image property by loading the image from file path location
        $imageStream=new ImageStream();
        $ocr_engine->setImage($imageStream->fromFile($dataDir . 'ocr.png'));

        # Process the image
        if ($ocr_engine->process()) {
            # Retrieve the first block of the recognized text part
            $first_block = $ocr_engine->getText()->getPartsInfo()[0];

            # Get the children of the first block that will the the lines in the block
            $lines_of_first_block = $first_block->getChildren();

            # Retrieve the fist line from the collection of lines
            $first_line = $lines_of_first_block[0];

            # Display the level of line
            print $first_line->getLevel();

            # Retrieve the fist word from the collection of words
            $first_word = $first_line->getChildren()[0];

            # Display the level of word
            print $first_word->getLevel();

            # Retrieve the fist character from the collection of characters
            print $first_character = $first_word->getChildren()[0];

            # Display the level of character
            print $first_character->getLevel().PHP_EOL;
        }
    }
}
?>