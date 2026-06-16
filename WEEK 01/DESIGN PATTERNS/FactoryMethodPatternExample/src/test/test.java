package test;

import factory.DocumentFactory;
import interfaces.Document;

/**
 * @author Aswin Senthilkumar
 *
 */
public class test {
	
public static void main(String[] args) {
	Document doc = DocumentFactory.createDocument("Pdf");
	doc.docType();
	Document doc2 = DocumentFactory.createDocument("Word");
	doc2.docType();
	Document doc3 = DocumentFactory.createDocument("Excel");
	doc3.docType();
}

}
