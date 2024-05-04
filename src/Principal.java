import modelo.Pelicula;
import modelo.Serie;
import java.util.Scanner;
  public class Principal {
      int opc=0;
      Scanner  teclado = new Scanner(System.in);

    private void leerDatos(String tipo){
        System.out.print("Titulo "+tipo+" :");
        String nombre =  teclado.nextLine();
        System.out.print("Año lanzamiento "+tipo);
        int fechaLanzamiento = teclado.nextInt();
        teclado.nextLine();
    }
    private void capturaNuevaPelicula(){
        leerDatos("Pelicula");
        System.out.print("Duracion : ");
        int duracionEnMin = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Director : ");
        String director = teclado.nextLine();
        System.out.println("");
        Pelicula pelicula = new Pelicula();
        pelicula.setNombre(nombre);
        pelicula.setFechaLanzamiento(fechaLanzamiento);
        pelicula.setTiempoDuracioMin(duracionEnMin);
        pelicula.setDirector(director);
        pelicula.mostrarFichaTecnica();
        System.out.println("Director "+pelicula.toString());
    }
    private void capturaNuevaSerie(){
        System.out.print("Nombre de la serie");
        String nombreSerie = teclado.nextLine();
        System.out.print("Año de lanzamiento de la serie");
        int fechaLanzamientoSerie = teclado.nextInt();
        teclado.nextLine();
        System.out.print("El tiempo duración minutos por capitulo ");
        int tiempoDuracionMinCapitulo = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Cantidad de capitulos por temporada ");
        int capitulosSerie = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Cantidad de temporadas");
        int cantTemporadasSerie = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Sinopsis de la serie");
        String sinopsisSerie = teclado.nextLine();
        System.out.println("");
        Serie serie = new Serie();
        serie.setNombre(nombreSerie);
        serie.setFechaLanzamiento(fechaLanzamientoSerie);
        serie.setEpisodioPorTemporada(capitulosSerie);
        serie.setDuracionMinPorEpidosio(tiempoDuracionMinCapitulo);
        serie.setTemporada(cantTemporadasSerie);
        serie.setSinopsis(sinopsisSerie);
        serie.mostrarFichaTecnica();
    }
      public void menu(){
        String menu = """
                    ====Bienvenido a Screen Match====
                    1) Registrar nueva pelicula 
                    2) Registar nueva Serie
                    3) Maraton de peliculas
                    
                    9) Salir
                    Digite Opcion del [1..9]
                    """;
        System.out.println(menu);
    }
    public void leerOpcion() {


        while(opc!=9){
            menu();
            opc = teclado.nextInt();
            teclado.nextLine();
            switch (opc){
                case 1: {
                    capturaNuevaPelicula();
                    break;
                }
                case 2: {
                    capturaNuevaSerie();
                    break;
                }
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }
        }
    }
}
