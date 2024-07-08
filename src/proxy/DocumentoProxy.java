package proxy;

public class DocumentoProxy implements Documento{

    private DocumentoReal documentoReal;
    private String nombreArchivo;
    private boolean usuarioAutenticado;

    public DocumentoProxy(String nombreArchivo, boolean usuarioAutenticado){
        this.nombreArchivo = nombreArchivo;
        this.usuarioAutenticado = usuarioAutenticado;
    }

    @Override
    public void mostrarContenido() {
        if(!usuarioAutenticado){
            System.out.println("Acceso denegado. Usuario no autenticado.");
            return;
        }
        if(documentoReal == null){
            documentoReal = new DocumentoReal(nombreArchivo);
        }
        System.out.println("Accediendo al documento...");
        registrarAcceso();
        documentoReal.mostrarContenido();

    }
    private void registrarAcceso(){
        System.out.println("Registro de acceso " + nombreArchivo + " accedido en " + new java.util.Date());
    }

    public String obtenerInformacionDocumentoReal() {
        if (documentoReal != null) {
            return documentoReal.toString();
        } else {
            return "DocumentoReal no ha sido creado aún.";
        }
    }
}
