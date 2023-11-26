import procesamiento_texto.DocumentProcessor;
import procesamiento_texto.TextDocumentProcessor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        DocumentProcessor textoDocumento = new TextDocumentProcessor();
        textoDocumento.processDocument();
    }
}