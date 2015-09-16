# Aspose_OCR_Java_for_Ruby
Aspose.OCR Java for Ruby is a gem that demonstrates / provides the Aspose.OCR for Java API usage examples in Ruby by using Rjb - Ruby Java Bridge.

## Installation

Execute following command.

    $ gem install asposeocrjava

To download Aspose.OCR for Java API to be used with these examples through RJB, Please navigate to:

http://www.aspose.com/community/files/72/java-components/aspose.ocr-for-java/default.aspx

Note: Create jars folder at root of the gem folder and copy downloaded Aspose.OCR for java component into it.

For most complete documentation of the project, check Aspose.OCR Java for Ruby confluence wiki link:

http://www.aspose.com/docs/display/OCRJAVA/1.+Aspose.OCR+Java+For+Ruby

## Usage

You can get project version using following example code.

```ruby
require File.dirname(File.dirname(File.dirname(__FILE__))) + '/lib/asposeocrjava'
include Asposeocrjava
include Asposeocrjava::RecognizeText
initialize_aspose_ocr
```
Lets understand the above code
* The first line makes sure that the Aspose.OCR is loaded and available 
* Include the files that are required to access the Aspose.OCR
* Initialize the libraries. The aspose JAVA classes are loaded from the path provided in the aspose.yml file