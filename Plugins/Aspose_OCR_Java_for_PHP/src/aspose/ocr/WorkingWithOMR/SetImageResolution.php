<?php
namespace Aspose\OCR\WorkingWithOMR;

use com\aspose\omr\OmrImage as OmrImage;
class SetImageResolution{

    public static function run($dataDir=null){

        # Initialize a string with template file location
        $image_file = $dataDir . "sample_omr.jpg";

        # Create an instance of OmrImage class and load the template using the factory method Load
        $omrImage=new OmrImage();
        $image = $omrImage->load($image_file);

        # Define new value of image resolution in double format
        $image->setResolution(210.0); # overwrites the old DPI value

        # Do processing

        print "Set image resolution.".PHP_EOL;

    }
}
?>