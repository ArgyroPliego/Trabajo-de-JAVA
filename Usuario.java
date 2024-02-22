public class Usuario {

    String nombre;
    Video videosubido;
    public Usuario () {
    }
    public Usuario  (String nombre) {
        this.nombre= nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre (String nombre) {
        this.nombre= nombre;
    }
     public Video getVideosubido () {
        return videosubido;
    }
    public void SubirVideo (Video video) {
        this. videosubido= video;
    }   
    public void MostrarInfoUsuario() {
        System.out.println("Tu usuario es: " + getNombre());
        if (videosubido != null) {
            System.out.println ("Ultimo video subido: " + videosubido.getTitulo());
        } else {
            System.out.println ("Aun no ha subido ningun video.");
        }   
        
}
}