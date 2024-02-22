public class Video {
    int DuracionSegundos;
    String Titulo;
    String URL;
    public Video () {
    }
    public Video (int Duracion, String Titulo, String URL) {
        this.DuracionSegundos= Duracion;
        this.Titulo= Titulo;
        this. URL= URL;
    }
    public int getDuracion() {
        return DuracionSegundos;
    }
    public void setDuracion (int Duracion) {
        this.DuracionSegundos= Duracion;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo (String titulo) {
        this.Titulo= titulo;
    }
    public String getURL() {
        return URL;
    }
    public void setURL (String URL) {
        this.URL= URL;
    }
    
}