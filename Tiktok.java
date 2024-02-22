public class Tiktok {
    public static void main(String[] args) {
        Usuario usu1 = new Usuario("Argyro Pliego");
        Video vid1= new Video (6000,"Sleeping at Last - Saturn","https://www.youtube.com/watch?v=v6AdJZMSrzU");
        usu1.SubirVideo(vid1);
        usu1.MostrarInfoUsuario();
        System.out.println("---");
        
        Usuario usu2 = new Usuario ("Saori");
        Comentario commt1 = new Comentario("Me gusto mucho el video", usu2);
        
        System.out.println("El usuario: " + usu2.getNombre() + "    Realizo el comentario: " + commt1.getContenido());
    }
}