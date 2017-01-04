package com.aspose.ocr.examples.OmrFeatures;

public class MeteredLicesingInOMR 
{
    public static void main(String[] args) throws Exception
    {
        //ExStart
        
        // Create an instance of OCR Metered class
        com.aspose.ocr.metered.Metered metered = new com.aspose.ocr.metered.Metered();
        
        // Access the setMeteredKey property and pass public and private keys as parameters
        metered.setMeteredKey("publicKeyValue", "privateKeyValue");
 
        // Get consumed qantity value before accessing API
        double amountBefore = com.aspose.ocr.metered.Metered.getConsumptionQuantity();
        System.out.println(amountBefore);
        
        // DO PROCESSING
        // set up OMR engine
        // com.aspose.omr.OmrEngine omr = new com.aspose.omr.OmrEngine(new com.aspose.omr.OmrTemplate());
        // String path = "sampleimage.png";
        // com.aspose.omr.OmrImage omrImage = com.aspose.omr.OmrImage.load(path);
 
        // Since upload data is running on another thread, so we need wait some time
        Thread.sleep(10000);
        
        // get metered data amount
        double amountAfter = com.aspose.ocr.metered.Metered.getConsumptionQuantity();
        System.out.println(amountAfter);
        
        //ExEnd
    }
}
