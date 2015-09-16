module Asposeocrjava
  module ReadPartInformationOfText
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Initialize an instance of OcrEngine
        ocr_engine = Rjb::import('com.aspose.ocr.OcrEngine').new

        # Set the Image property by loading the image from file path location
        ocr_engine.setImage(Rjb::import('com.aspose.ocr.ImageStream').fromFile(data_dir + 'ocr.png'))

        # Process the image
        if ocr_engine.process()
            # Display the recognized text
            puts "Text: " + ocr_engine.getText().to_string

            # Retrieve an array of recognized text by parts
            text = ocr_engine.getText().getPartsInfo()
            # Iterate over the text parts
            i = 0
            while i < text.length
                symbol = text[i]
                # Display part information
                puts "isItalic : " + symbol.getItalic().to_s
                puts "isUnderline : " + symbol.getUnderline().to_s
                puts "isBold : " + symbol.getBold().to_s
                puts "Text Color : " + symbol.getTextColor().to_string
                puts "Quality : " + symbol.getCharactersQuality().to_s
                i +=1
            end
        end
    end
  end
end
