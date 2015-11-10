<?php
namespace Aspose\OCR\WorkingWithOCR;

use com\aspose\ocr\OcrEngine as OcrEngine;
use com\aspose\ocr\ImageStream as ImageStream;
use com\aspose\ocr\CorrectionFilters as CorrectionFilters;
use com\aspose\ocr\filters\MedianFilter as MedianFilter;
use com\aspose\ocr\filters\GaussBlurFilter as GaussBlurFilter;
use com\aspose\ocr\filters\RemoveNoiseFilter as RemoveNoiseFilter;

class ApplyCorrectionFilters{

    public static function run($dataDir=null)
    {

        # Initialize an instance of OcrEngine
        $ocr_engine = new OcrEngine();

        # Set the Image property by loading the image from file path location
        $imageStream = new ImageStream();
        $ocr_engine->setImage($imageStream->fromFile($dataDir . 'ocr.png'));

        # Set filters
        # Create CorrectionFilters collection
        $filters = new CorrectionFilters();

        # Initialize Median filter
        $filter = new MedianFilter(5);
        $filters->add($filter);

        # Create Gaussian Blur filter
        $filter = new GaussBlurFilter();
        $filters->add($filter);

        # Create Noise Removal filter
        $filter = new RemoveNoiseFilter();
        $filters->add($filter);

        # Assign collection to OcrEngine
        $ocr_engine->getConfig()->setCorrectionFilters($filters);

        # Perform OCR operation
        $ocr_engine->process();

        print "Whole result is: " . (string)$ocr_engine->getText().PHP_EOL;
    }
}
?>