package concreateclasses;

import interfaces.Document;

/**
 * @author Aswin Senthilkumar
 *
 */
public class ExcelDocument implements Document{

	@Override
	public void docType(){
		System.out.print("Type: Excel Document");
	}
}
