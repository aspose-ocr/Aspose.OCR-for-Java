<?php
namespace Aspose\OCR\WorkingWithOMR;

use com\aspose\omr\OmrTemplate as OmrTemplate;
use com\aspose\omr\OmrImage as OmrImage;
use com\aspose\omr\OmrEngine as OmrEngine;
use com\aspose\omr\OmrConfig as OmrConfig;

class SetMarkThreshold{
    public static function run($dataDir=null){

        # Setting Global Threshold
        SetMarkThreshold::set_global_threshold($dataDir);

        # Setting Page Level Threshold
        SetMarkThreshold::set_page_level_threshold($dataDir);
    }

    public static function set_global_threshold($dataDir=null){

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

        # Get the configurations of OmrEngine
        $config = $engine->getConfiguration();

        # Set fill threshold
        $config->setFillThreshold(0.12);

        # Extract the OMR data
        $ary=array($omrImage);
        $result = $engine->extractData($ary);

        print "Set global threshold.".PHP_EOL;
    }

    public static function set_page_level_threshold($dataDir=null){

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

        # Get the first page of the template
        $page = $omrTemplate->getPages()->getItem(0);

        # Create page configurations
        $page->setConfiguration(new OmrConfig());

        # Set fill threshold
        $page->getConfiguration()->setFillThreshold(0.21);

        # Create an instance of OmrEngine class
        $engine = new OmrEngine($omrTemplate);

        # Extract the OMR data
        $ary=array($omrImage);
        $result = $engine->extractData($ary);

        print "Set page level threshold.".PHP_EOL;
    }
}
?>