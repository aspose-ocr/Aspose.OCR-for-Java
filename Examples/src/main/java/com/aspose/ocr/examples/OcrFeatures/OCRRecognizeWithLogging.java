package com.aspose.ocr.examples.OcrFeatures;

import com.aspose.ocr.*;
import com.aspose.ocr.RecognitionResult.LinesResult;
import com.aspose.ocr.examples.Utils;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class OCRRecognizeWithLogging {

	public static void main(String[] args) throws IOException {
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(OCRRecognizeWithLogging.class);

		// The image path
		String file = dataDir + "multi_page_1.pdf";

		// Create api instance
		AsposeOCR api = new AsposeOCR();

		// Set logging level and output
		Logging.loggingLevel = LoggingLevel.Debug;
		Logging.fileSystem = false;
		Logging.console = true;

		// Set recognition options
		RecognitionSettings settings = new RecognitionSettings();
		settings.setLanguage(Language.Eng);


		// Create OcrInput object and add images/documents for recognition
		OcrInput input = new OcrInput(InputType.PDF);
		input.add(file, 0, 2);

		// Get result list
		ArrayList<RecognitionResult> result = api.Recognize(input, settings);

		// print result		
		for(RecognitionResult r: result) {
			printResult(r);
		}
	
		// ExEnd:1
		System.out.println("OCRRecognizePdf: execution complete");
	}
	
	 static void printResult(RecognitionResult result) {
	    	//TEXT
	    	System.out.println("TEXT:\n" + result.recognitionText);
	    	
	    	//SKEW
	    	System.out.print("SKEW: ");
	    	System.out.println(result.skew);
	    	
	    	//PARAGRAPHS
	    	System.out.println("\nPARAGRAPHS:");    	
	    	for (String paragraph : result.recognitionAreasText){
	    		System.out.println(paragraph);
	    	}
	    	
	     	//PARAGRAPHS COORDS
	    	System.out.println("PARAGRAPHS COORDS:");
	    	for (Rectangle rectangle : result.recognitionAreasRectangles){
	    		System.out.println("X: " + rectangle.x + "Y: " + rectangle.y + "Width: " + rectangle.width + "Height: " + rectangle.height);
	    	}
	    	
	    	//LINES
	    	System.out.println("LINES:");
	    	for (LinesResult line : result.recognitionLinesResult){
	    		if(line.line != null) {
					System.out.print("X: " + line.line.x + "Y: " + line.line.y + "Width: " + line.line.width + "Height: " + line.line.height);
					System.out.println(" " + line.textInLine);
				}
	    	}
	    	
	    	//POSSIBLE CHOICES FOR CHARACTERS
	    	System.out.println("POSSIBLE CHOICES FOR CHARACTERS:");
	    	for (char[] choices : result.recognitionCharactersList){
	    		if(choices != null) {
					System.out.println("character: " + choices[0] + " - " + choices[1] + " " + choices[2] + " " + choices[3] + " " + choices[4]);
				}
	    	}    	
	    	
	    	//WARNINGS
	    	System.out.println("WARNINGS:");
	    	for (String warning : result.warnings){
	    		System.out.print(warning);
	    	}
	    	
	    	//JSON
	    	System.out.println("JSON:");
	    	System.out.print(result.GetJson());
	    	
	    	//SPELL-CHECK CORRECTED TEXT
	    	System.out.println("SPELL-CHECK CORRECTED TEXT:");
	    	System.out.print(result.getSpellCheckCorrectedText());
	    }
}
