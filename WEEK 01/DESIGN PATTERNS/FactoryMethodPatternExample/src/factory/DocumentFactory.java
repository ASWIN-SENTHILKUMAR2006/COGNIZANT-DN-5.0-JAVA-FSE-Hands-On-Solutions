package factory;

import concreateclasses.ExcelDocument;
import concreateclasses.PdfDocument;
import concreateclasses.WordDocument;
import interfaces.Document;

/**
 * @author Aswin Senthilkumar
 *
 */
public class DocumentFactory {

public static Document createDocument(String doc) {
	if(doc.toLowerCase().equals("pdf")) {
		return new PdfDocument();
	}
	if(doc.toLowerCase().equals("word")) {
		return new WordDocument();
	}
	if(doc.toLowerCase().equals("excel")) {
		return new ExcelDocument();
	}
	
	return null;
}
	
	
}
