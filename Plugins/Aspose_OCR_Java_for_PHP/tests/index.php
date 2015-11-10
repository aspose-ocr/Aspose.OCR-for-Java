<?php

require_once("../../java/Java.inc");

require_once __DIR__ . '/../vendor/autoload.php'; // Autoload files using Composer autoload

use Aspose\Ocr\WorkingWithOCR\PerformingOCROnAnImage;
use Aspose\Ocr\WorkingWithOCR\ApplyCorrectionFilters;
use Aspose\Ocr\WorkingWithOCR\CorrectSpellings;
use Aspose\Ocr\WorkingWithOCR\DetectReading;
use Aspose\Ocr\WorkingWithOCR\DetectTextBlocks;
use Aspose\Ocr\WorkingWithOCR\ExtractTextFromPartOfImage;
use Aspose\Ocr\WorkingWithOCR\GetTextPartHierarchyOfText;
use Aspose\Ocr\WorkingWithOCR\IgnoreNonTextualBlocks;
use Aspose\Ocr\WorkingWithOCR\LoadImageFromUrl;
use Aspose\Ocr\WorkingWithOCR\MultipageTiff;
use Aspose\Ocr\WorkingWithOCR\ReadPartInformationOfText;
use Aspose\Ocr\WorkingWithOCR\RecognizeWhiteListedCharacters;
use Aspose\Ocr\WorkingWithOCR\WorkWithDifferentLanguages;

use Aspose\Ocr\WorkingWithOMR\DetectImageResolution;
use Aspose\Ocr\WorkingWithOMR\ExtractOmrDataFromImage;
use Aspose\Ocr\WorkingWithOMR\SetImageResolution;
use Aspose\Ocr\WorkingWithOMR\SetMarkThreshold;

print "Running Aspose\\OCR\\WorkingWithOCR\\PerformingOCROnAnImage::run()" . PHP_EOL;
PerformingOCROnAnImage::run(__DIR__ . '/data/WorkingWithOCR/PerformingOCROnAnImage/');

print "Running Aspose\\OCR\\WorkingWithOCR\\ApplyCorrectionFilters::run()" . PHP_EOL;
ApplyCorrectionFilters::run(__DIR__ . '/data/WorkingWithOCR/ApplyCorrectionFilters/');

print "Running Aspose\\OCR\\WorkingWithOCR\\CorrectSpellings::run()" . PHP_EOL;
CorrectSpellings::run(__DIR__ . '/data/WorkingWithOCR/CorrectSpellings/');

print "Running Aspose\\OCR\\WorkingWithOCR\\DetectReading::run()" . PHP_EOL;
DetectReading::run(__DIR__ . '/data/WorkingWithOCR/DetectReading/');

print "Running Aspose\\OCR\\WorkingWithOCR\\DetectTextBlocks::run()" . PHP_EOL;
DetectTextBlocks::run(__DIR__ . '/data/WorkingWithOCR/DetectTextBlocks/');

print "Running Aspose\\OCR\\WorkingWithOCR\\ExtractTextFromPartOfImage::run()" . PHP_EOL;
ExtractTextFromPartOfImage::run(__DIR__ . '/data/WorkingWithOCR/ExtractTextFromPartOfImage/');

print "Running Aspose\\OCR\\WorkingWithOCR\\GetTextPartHierarchyOfText::run()" . PHP_EOL;
GetTextPartHierarchyOfText::run(__DIR__ . '/data/WorkingWithOCR/GetTextPartHierarchyOfText/');

print "Running Aspose\\OCR\\WorkingWithOCR\\IgnoreNonTextualBlocks::run()" . PHP_EOL;
IgnoreNonTextualBlocks::run(__DIR__ . '/data/WorkingWithOCR/IgnoreNonTextualBlocks/');

print "Running Aspose\\OCR\\WorkingWithOCR\\LoadImageFromUrl::run()" . PHP_EOL;
LoadImageFromUrl::run(__DIR__ . '/data/WorkingWithOCR/LoadImageFromUrl/');

print "Running Aspose\\OCR\\WorkingWithOCR\\MultipageTiff::run()" . PHP_EOL;
MultipageTiff::run(__DIR__ . '/data/WorkingWithOCR/MultipageTiff/');

print "Running Aspose\\OCR\\WorkingWithOCR\\ReadPartInformationOfText::run()" . PHP_EOL;
ReadPartInformationOfText::run(__DIR__ . '/data/WorkingWithOCR/ReadPartInformationOfText/');

print "Running Aspose\\OCR\\WorkingWithOCR\\RecognizeWhiteListedCharacters::run()" . PHP_EOL;
RecognizeWhiteListedCharacters::run(__DIR__ . '/data/WorkingWithOCR/RecognizeWhiteListedCharacters/');

print "Running Aspose\\OCR\\WorkingWithOCR\\WorkWithDifferentLanguages::run()" . PHP_EOL;
WorkWithDifferentLanguages::run(__DIR__ . '/data/WorkingWithOCR/WorkWithDifferentLanguages/');

print "Running Aspose\\OCR\\WorkingWithOCR\\DetectImageResolution::run()" . PHP_EOL;
DetectImageResolution::run(__DIR__ . '/data/WorkingWithOMR/DetectImageResolution/');

print "Running Aspose\\OCR\\WorkingWithOCR\\ExtractOmrDataFromImage::run()" . PHP_EOL;
ExtractOmrDataFromImage::run(__DIR__ . '/data/WorkingWithOMR/ExtractOmrDataFromImage/');

print "Running Aspose\\OCR\\WorkingWithOCR\\SetImageResolution::run()" . PHP_EOL;
SetImageResolution::run(__DIR__ . '/data/WorkingWithOMR/SetImageResolution/');

print "Running Aspose\\OCR\\WorkingWithOCR\\SetMarkThreshold::run()" . PHP_EOL;
SetMarkThreshold::run(__DIR__ . '/data/WorkingWithOMR/SetMarkThreshold/');
?>