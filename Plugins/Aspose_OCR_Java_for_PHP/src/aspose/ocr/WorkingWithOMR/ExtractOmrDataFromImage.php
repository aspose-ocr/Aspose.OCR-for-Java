<?php
namespace Aspose\OCR\WorkingWithOMR;

use com\aspose\omr\OmrTemplate as OmrTemplate;
use com\aspose\omr\OmrImage as OmrImage;
use com\aspose\omr\OmrEngine as OmrEngine;

class ExtractOmrDataFromImage{

    public static function run($dataDir=null){

        # Initialize a string with template file location
        $template_file = $dataDir . "template.amr";

        # Initialize a string with scanned image file location
        $image_file = $dataDir . "sample_omr.jpg";

        # Create an instance of OmrTemplate class and load the template using the factory method Load
        $omrTemplate=new OmrTemplate();
        $omrTemplate = $omrTemplate->load($template_file);

        # Create an instance of OmrImage class and load the template using the factory method Load
        $omrImage=new OmrImage();
        $omrImage = $omrImage->load($image_file);

        # Create an instance of OmrEngine class
        $omrEngine=new OmrEngine();
        $engine = new OmrEngine($omrTemplate);

        # Extract the OMR data
        $ary=array($omrImage);
        $result = $engine->extractData($ary);

        # Get page data of extracted data
        $pages = $result->getPageData();

        $index = 0;
        # Iterate over the pages and display the data
        foreach($pages as $page) {
            $index += 1;
            print "------Page: " . (string)$index;
            $keys = $page->keySet();
            $keys = (string)$keys;
//            $keys = $keys(1, sizeof($keys) - 2);

            $keys = split(",",$keys);
            foreach ($keys as $key) {
                $value = $page->get($key);
                print "key: " . (string)$key.PHP_EOL;
                print "value: " . (string)$value.PHP_EOL;
            }
        }
    }
}
?>