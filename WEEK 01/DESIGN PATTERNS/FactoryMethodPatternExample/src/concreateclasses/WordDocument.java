package concreateclasses;

import interfaces.Document;

/**
 * @author Aswin Senthilkumar
 *
 */
public class WordDocument  implements Document{

	@Override
	public void docType(){
		System.out.println("Type: Word Document");
	}
}
