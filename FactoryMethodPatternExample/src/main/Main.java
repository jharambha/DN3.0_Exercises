package main;

import document.Document;
import factory.DocumentFactory;
import factory.WordDocumentFactory;
import factory.PdfDocumentFactory;
import factory.ExcelDocumentFactory;

public class Main {
    public static void main(String[] args) {
        
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

       
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
