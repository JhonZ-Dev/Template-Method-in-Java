import procesamiento_texto.DocumentProcessor;
import procesamiento_texto.PresentationDocumentProcessor;
import procesamiento_texto.TextDocumentProcessor;
import procesamiento_texto.procesadorDocumentoHojaCalculo;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
        System.out.println("***********Documento de texto***********************\n");
        DocumentProcessor textoDocumento = new TextDocumentProcessor();
        textoDocumento.processDocument();

        System.out.println("");
        System.out.println("");
        System.out.println("***********Documento de hoja de calculo***********************\n");
        DocumentProcessor hojadecalculo = new procesadorDocumentoHojaCalculo();
        hojadecalculo.processDocument();

        System.out.println("");
        System.out.println("");
        System.out.println("***********Documento de presentaciones***********************\n");
        DocumentProcessor presentaciones = new PresentationDocumentProcessor();
        presentaciones.processDocument();

    }
}