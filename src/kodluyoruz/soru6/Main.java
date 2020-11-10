package kodluyoruz.soru6;

public class Main {

    public static void main(String[] args) {

    	/*
    	* main methodu static olduğu için çağırılan metodlarda static olmalı
    	* */
		PDFDocument pdfDocument=new PDFDocument("pdfDocument");
		WordDocument wordDocument =new WordDocument("wordDocument");
		Printer.printPDFDocument(pdfDocument.getBody());
		Printer.printWordDocument(wordDocument.getBody());
    }
}
