module Asposeocrjava
  module DetectReading
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Initialize an instance of OcrEngine
        ocr_engine = Rjb::import('com.aspose.ocr.OcrEngine').new

        # Set the Image property by loading the image from file path location
        ocr_engine.setImage(Rjb::import('com.aspose.ocr.ImageStream').fromFile(data_dir + 'ocr.png'))

        # Set the DetectReadingOrder to true
        ocr_engine.getConfig().setDetectReadingOrder(true)

        # Process the image
        if ocr_engine.process()
            # Display the result
            puts "Text: " + ocr_engine.getText().to_string
        end
    end
  end
end
