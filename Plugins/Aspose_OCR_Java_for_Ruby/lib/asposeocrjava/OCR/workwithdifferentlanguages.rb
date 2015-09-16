module Asposeocrjava
  module WorkWithDifferentLanguages
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Initialize an instance of OcrEngine
        ocr_engine = Rjb::import('com.aspose.ocr.OcrEngine').new

        # Set the Image property by loading the image from file path location
        ocr_engine.setImage(Rjb::import('com.aspose.ocr.ImageStream').fromFile(data_dir + 'spanish.png'))

        # Clear the default language (English)
        ocr_engine.getLanguageContainer().clear()

        # Load the resources of the language from file path location or an instance of InputStream
        ocr_engine.getLanguageContainer().addLanguage(Rjb::import('com.aspose.ocr.LanguageFactory').load(data_dir + "SpanishLanguageResources.zip"))

        # Process the image
        if ocr_engine.process()
            # Display the recognized text
            puts "Text: " + ocr_engine.getText().to_string
        end
    end
  end
end
