---
title: Perform OCR on an image
type: docs
weight: 10
url: /java/perform-ocr-on-an-image/
---

## **Perform OCR on an Image**
Aspose.OCR for Java provides the following methods to perform OCR operation on images.

- [RecognizePage](https://apireference.aspose.com/ocr/java/com.aspose.ocr/AsposeOCR#RecognizePage-java.lang.String-): Recognizing text on some page, It detects where is the paragraph or header and recognizes each of the text segments.
- [RecognizeLine](https://apireference.aspose.com/ocr/java/com.aspose.ocr/AsposeOCR#RecognizeLine-java.lang.String-): Perform OCR operation on the image containing a single line.
### **Performing OCR on an image of a page**
Aspose.OCR provides the [RecognizePage](https://apireference.aspose.com/ocr/java/com.aspose.ocr/AsposeOCR#RecognizePage-java.lang.String-) method* *that detects where the header or paragraph is and recognizes each text segment. The [RecognizePage](https://apireference.aspose.com/ocr/java/com.aspose.ocr/AsposeOCR#RecognizePage-java.lang.String-) method takes the image path as a parameter and returns the recognized text. The following code snippet demonstrates the use of the [RecognizePage](https://apireference.aspose.com/ocr/java/com.aspose.ocr/AsposeOCR#RecognizePage-java.lang.String-) method to perform OCR on an image.

{{< gist "aspose-com-gists" "3830491066e58e54903b3025d04e5b0c" "Examples-src-main-java-com-aspose-ocr-examples-OcrFeatures-PerformOCROnPage-1.java" >}}
### **Performing OCR on a Buffered image**
The [RecognizePage](https://apireference.aspose.com/ocr/java/com.aspose.ocr/AsposeOCR#RecognizePage-java.awt.image.BufferedImage-) overloaded method takes the buffered image as a parameter and returns the recognized text. The following code snippet demonstrates the use of the [RecognizePage](https://apireference.aspose.com/ocr/java/com.aspose.ocr/AsposeOCR#RecognizePage-java.awt.image.BufferedImage-) method to perform OCR on a buffered image.

{{< gist "aspose-com-gists" "3830491066e58e54903b3025d04e5b0c" "Examples-src-main-java-com-aspose-ocr-examples-OcrFeatures-PerformOCROnBufferedImage-1.java" >}}
### **Performing OCR on an image of a line**
The following code snippet demonstrates the use of the [RecognizeLine](https://apireference.aspose.com/ocr/java/com.aspose.ocr/AsposeOCR#RecognizeLine-java.lang.String-) method to perform OCR operation on the image containing a single line.

{{< gist "aspose-com-gists" "3830491066e58e54903b3025d04e5b0c" "Examples-src-main-java-com-aspose-ocr-examples-OcrFeatures-RecognizeLine-1.java" >}}
