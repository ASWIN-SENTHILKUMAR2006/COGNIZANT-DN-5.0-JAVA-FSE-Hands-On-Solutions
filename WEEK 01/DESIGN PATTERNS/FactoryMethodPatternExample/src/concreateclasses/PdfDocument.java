package concreateclasses;

import interfaces.Document;

/**
 * @author Aswin Senthilkumar
 *
 */
public class PdfDocument implements Document {

	@Override
	public void docType(){
		System.out.println("Type: Pdf Document ");
	}
}
