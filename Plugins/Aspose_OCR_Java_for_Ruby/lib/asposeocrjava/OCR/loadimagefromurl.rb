module Asposeocrjava
  module LoadImageFromUrl
    def initialize()        
        # Initialize an instance of OcrEngine
        ocr_engine = Rjb::import('com.aspose.ocr.OcrEngine').new

        # Set the Image property by loading the image from remote location
        ocr_engine.setImage(Rjb::import('com.aspose.ocr.ImageStream').fromUrl("http://cdn.aspose.com/tmp/ocr-sample.bmp"))

        # Process the image
        if ocr_engine.process()
            # Display the recognized text
            puts "Text: " + ocr_engine.getText().to_string
        end
    end
  end
end
