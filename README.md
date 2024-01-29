![GitHub release (latest by date)](https://img.shields.io/github/v/release/aspose-ocr-cloud/aspose-ocr-cloud-java) ![GitHub all releases](https://img.shields.io/github/downloads/aspose-ocr/Aspose.ocr-for-Java/total) ![GitHub](https://img.shields.io/github/license/aspose-ocr/Aspose.ocr-for-java)
# Java OCR Library

[Aspose.OCR for Java](https://products.aspose.com/ocr/java) is a character and optical mark recognition API that allows developers to add OCR functionality in their applications. It provides a simple set of classes for controlling character recognition.

<p align="center">
  <a href="https://github.com/asposeocr/Aspose_OCR_Java/archive/master.zip">
    <img src="http://i.imgur.com/hwNhrGZ.png" />
  </a>
</p>

Following is a short description of the contents of the repository:

Directory | Description
----------|------------
[Examples](Examples) | A collection of Java examples that help you learn how to product features.

## Convert Image to Text via Java

- Read characters from images.
- Support for JPG, PNG, GIF, BMP, TIFF, PDF file formats for OCR.
- Support for 27 languages, including Latin, Cyrillic, and Chinese.
- Read popular fonts including Arial, Times New Roman, Courier New, Verdana, Tahoma and Calibri.
- Support for regular, bold and italic font styles.
- Scan the whole image or any part of the image.
- Scan rotated images.
- Can apply different noise removal filters before image recognition.
- Extract optical marked elements from Scanned images.
- Support for various optical marked elements such as Check Box, Choice Box, Grid, Barcode & OCR.

## Supported Characters

|   |   |   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|---|---|
| space | ! | " | # | $ | % | & | ' | ( | ) |
| * | + | , | - | . | / | 0 | 1 | 2 | 3 |
| 4 | 5 | 6 | 7 | 8 | 9 | : | ; | < | = |
| > | ? | @ | [ | \ | ] | _ | ` | { | \| |
| } | ~ | A | B | C | D | E | F | G | H |
| I | J | K | L | M | N | O | P | Q | R |
| S | T | U | V | W | X | Y | Z | a | b |
| c | d | e | f | g | h | i | j | k | l |
| m | n | o | p | q | r | s | t | u | v |
| w | x | y | z | Â | À | Á | Ã | Ä | Æ |
| Ç | È | É | Ê | Ë | Ì | Í | Î | Ï | Ñ |
| Ò | Ó | Ô | Õ | Ö | Ù | Ú | Û | Ü | ẞ |
| ß | à | á | â | ã | ä | æ | ç | è | é |
| ê | ë | ì | í | î | ï | ñ | ò | ó | ô |
| õ | ö | ù | ú | û | ü | ÿ | Œ | œ | Ÿ |


## Load Images for OCR

**Raster Formats:** JPEG, PNG, GIF, BMP, TIFF

## Supported Environments

- **Microsoft Windows:** Windows Desktop & Server (x86, x64)
- **macOS:** Mac OS X
- **Linux:** Ubuntu, OpenSUSE, CentOS, and others
- **Java Versions:** `J2SE 6.0 (1.6)` or above

## Get Started with Aspose.OCR for Java

Aspose hosts all Java APIs at the [Aspose Repository](https://releases.aspose.com/ocr/java/). You can easily use Aspose.OCR for Java API directly in your Maven projects with simple configurations. For the detailed instructions please visit [Installing Aspose.OCR for Java from Maven Repository](https://docs.aspose.com/ocr/java/installation/) documentation page.

## Extract Text from Image with skew correction

```java

		// The image path
		String imagePath = "p3.png";

		//Create api instance
		AsposeOCR api = new AsposeOCR();

		// Set preprocessing filters to rotate image before recognition.
		PreprocessingFilter filters = new PreprocessingFilter();
		filters.add(PreprocessingFilter.AutoSkew());

		// Create OcrInput object and add images/documents for recognition
		OcrInput input = new OcrInput(InputType.SingleImage, filters);
		input.add(imagePath);

		// Recognize page by full path to file
		ArrayList<RecognitionResult> result = api.Recognize(input);
		System.out.println("Result: " + result.get(0).recognitionText);
```

[Home](https://www.aspose.com/) | [Product Page](https://products.aspose.com/ocr/java) | [Docs](https://docs.aspose.com/ocr/java/) | [Demos](https://products.aspose.app/ocr/family) | [API Reference](https://apireference.aspose.com/ocr/java) | [Examples](https://github.com/aspose-ocr/Aspose.OCR-for-Java) | [Blog](https://blog.aspose.com/category/ocr/) | [Search](https://search.aspose.com/) | [Free Support](https://forum.aspose.com/c/ocr) | [Temporary License](https://purchase.aspose.com/temporary-license)
