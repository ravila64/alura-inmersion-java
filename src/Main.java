import modelo.Pelicula;
import modelo.Serie;

public class Main {
    public static void main(String[] args) {
        Pelicula matrix = new Pelicula();
        matrix.setNombre("Matrix");
        matrix.setTiempoDuracioMin(120);
        matrix.setFechaLanzamiento(1999);
        matrix.mostrarFichaTecnica();

        Pelicula encanto = new Pelicula();
        encanto.setNombre("Encanto");
        encanto.setFechaLanzamiento(2022);
        encanto.setTiempoDuracioMin(120);
        encanto.mostrarFichaTecnica();

        Serie friends=new Serie();
        friends.setNombre("friends");
        friends.setFechaLanzamiento(1997);
        friends.setTemporada(10);
        friends.setEpisodioPorTemporada(22);
        friends.setDuracionMinPorEpidosio(30);
        friends.mostrarFichaTecnica();

    }
}