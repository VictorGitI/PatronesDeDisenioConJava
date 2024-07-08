package proxy;

public class DocumentoReal implements Documento{

    private String nombreArchivo;

    public DocumentoReal(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        cargarDesdeDisco(nombreArchivo);
    }

    @Override
    public void mostrarContenido() {
        System.out.println("Mostrando contenido del documento" + nombreArchivo);
    }

    private void cargarDesdeDisco(String nombreArchivo){
        System.out.println("Cargando" + nombreArchivo + "desde disco...");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(nombreArchivo + "cargado.");
    }

    @Override
    public String toString() {
        return "DocumentoReal{" +
                "nombreArchivo='" + nombreArchivo + '\'' +
                '}';
    }
}
