package proxy;

public class MainProxy {

    public static void main(String[] args) {
        boolean usuarioAutenticado = false;
        Documento documento = new DocumentoProxy("Archivo de prueba", usuarioAutenticado);

        documento.mostrarContenido();// Primera llamada si usuarioAutenticado es true a mostrarContenido(): Crea el documento si es necesario y muestra su contenido

        documento.mostrarContenido();// Segunda llamada si usuarioAutenticado es true a mostrarContenido(): Intenta acceder nuevamente al contenido del documento ya creado

        String informacion = ((DocumentoProxy) documento).obtenerInformacionDocumentoReal();
        System.out.println("Información del documento: " + informacion);
    }
}
