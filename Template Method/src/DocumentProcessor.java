public abstract class DocumentProcessor {


    protected void openDocument() {
        // Lógica común para abrir un documento
        System.out.println("Abriendo el documento...");
    }

    // Paso abstracto que debe ser implementado por las subclases
    protected abstract void processContent();

    protected void saveDocument() {
        // Lógica común para guardar un documento
        System.out.println("Guardando el documento...");
    }
}
