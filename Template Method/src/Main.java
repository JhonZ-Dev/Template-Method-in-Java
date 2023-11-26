import procesamiento_texto.DocumentProcessor;
import procesamiento_texto.PresentationDocumentProcessor;
import procesamiento_texto.TextDocumentProcessor;
import procesamiento_texto.procesadorDocumentoHojaCalculo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        DocumentProcessor textoDocumento = new TextDocumentProcessor();
        textoDocumento.processDocument();

        DocumentProcessor hojadecalculo = new procesadorDocumentoHojaCalculo();
        textoDocumento.processDocument();

        DocumentProcessor presentaciones = new PresentationDocumentProcessor();
        textoDocumento.processDocument();

    }
}