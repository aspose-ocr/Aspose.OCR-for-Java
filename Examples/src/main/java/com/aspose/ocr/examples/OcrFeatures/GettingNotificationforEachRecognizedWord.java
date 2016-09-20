package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.INotifier;
import com.aspose.ocr.IRecognizedText;
import com.aspose.ocr.ImageStream;
import com.aspose.ocr.NotifierFactory;
import com.aspose.ocr.NotifierHandler;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.examples.Utils;

public class GettingNotificationforEachRecognizedWord {
	public static void main(String[] args) throws Exception {
		// ExStart:GettingNotificationforEachRecognizedWord
		// Create an instance of OcrEngine
		OcrEngine ocrEngine = new OcrEngine();

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(GettingNotificationforEachRecognizedWord.class) + "OcrFeatures/";

		/// Set the paths
		String imageFileName = dataDir + "Sample1.jpg";

		// Set image file
		ocrEngine.setImage(ImageStream.fromFile(imageFileName));

		final int[] totalWords = { 0 };

		// Get an instance of INotifier
		INotifier processorWord = NotifierFactory.wordNotifier();
		// Write a delegate to handle the Elapsed event
		processorWord.Elapsed.add(new NotifierHandler() {
			public void invoke(Object sender, IRecognizedText recognizedText) {
				totalWords[0]++;
			}
		});

		// Add the word processor to the OcrEngine
		ocrEngine.addNotifier(processorWord);

		// Perform OCR and get extracted text
		ocrEngine.process();
		// ExEnd:GettingNotificationforEachRecognizedWord
	}
}
