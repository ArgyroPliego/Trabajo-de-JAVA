public class Comentario {
    String Comentario;
    Usuario Autor;
    public Comentario () {
    }
    public Comentario (String Contenido,Usuario Perfil) {
        this.Comentario= Contenido;
        this.Autor= Perfil;
    }
    public Usuario getPerfil() {
        return Autor;
    }
    public void setPerfil (Usuario Perfil) {
        this.Autor=Perfil;
    }
    public String getContenido() {
        return Comentario;
    }
    public void setContenido (String Contenido) {
        this.Comentario= Contenido;
    }
    }