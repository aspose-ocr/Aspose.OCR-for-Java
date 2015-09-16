module Asposeocrjava
  module SetImageResolution
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Initialize a string with template file location
        image_file = data_dir + "sample_omr.jpg"

        # Create an instance of OmrImage class and load the template using the factory method Load
        image = Rjb::import('com.aspose.omr.OmrImage').load(image_file)
        
        # Define new value of image resolution in double format
        image.setResolution(210.0) # overwrites the old DPI value

        # Do processing

        puts "Set image resolution."
    end
  end
end
