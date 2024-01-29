package com.aspose.ocr.examples.License;

import com.aspose.ocr.License;

public class SetLicense {

	public static void main(String[] args) {
		// ExStart:1
		//Set license
		String file = "Aspose.Total.lic"; //change the path to point to a valid license
		License .setLicense(file);

		//Check license
		boolean resLicense = License.isValid();
		System.out.println("License is set: " + resLicense);
		// ExEnd:1
	}
}
