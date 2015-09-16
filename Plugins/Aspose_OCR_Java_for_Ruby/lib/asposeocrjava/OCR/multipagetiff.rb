module Asposeocrjava
  module MultipageTiff
    def initialize()    
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Initialize an instance of OcrEngine
        ocr_engine = Rjb::import('com.aspose.ocr.OcrEngine').new

        # Set the Image property by loading the image from file path location
        ocr_engine.setImage(Rjb::import('com.aspose.ocr.ImageStream').fromFile(data_dir + 'multipage.tiff'))

        # Set OcrEngine.ProcessAllPages to true in order to process all pages of TIFF in single run
        ocr_engine.setProcessAllPages(true)

        # Process the image
        if ocr_engine.process()
            # Retrieve the list of Pages
            pages = ocr_engine.getPages()
            pages.each do |page|
                puts "Text: " + page.getPageText().to_string
            end
        end
    end
  end
end
