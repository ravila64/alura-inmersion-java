import modelo.Pelicula;
import modelo.Serie;
import java.util.Scanner;
  public class Principal {
      int opc=0;
      Scanner  teclado = new Scanner(System.in);

    private String leerNombre(String texto){
        System.out.print("Titulo[nombre] "+texto+" :");
        String nombre =  teclado.nextLine();
        return nombre;
    }
    private int leerAñoLanzamiento(String texto){
        System.out.print("Año lanzamiento "+texto+ " :");
        int año = teclado.nextInt();
        teclado.nextLine();
        return año;
    }
    private int leerDuracion(String texto){
        System.out.print("Duracion "+texto+" en minutos :");
        int duracion = teclado.nextInt();
        teclado.nextLine();
        return duracion;
    }
    private String leerDirector(){
        System.out.print("Director película: ");
        String director = teclado.nextLine();
        System.out.println("");
        return director;
    }
    private int leerCantidadCapitulos(){
        System.out.print("Cantidad de capitulos por temporada ");
        int capitulos = teclado.nextInt();
        teclado.nextLine();
        return capitulos;
    }
    private  int leerCantidadTemporadas(){
        System.out.print("Cantidad de temporadas");
        int cantTemporadas = teclado.nextInt();
        teclado.nextLine();
        return cantTemporadas;
    }
    private String leerSinopsis(){
        System.out.println("Sinopsis de la serie ");
        String sinopsis = teclado.nextLine();
        return  sinopsis;
    }

    private void menu(){
        String[] items= {"=====MENU=====","1. Registrar nueva pelicula","2. Registar nueva Serie",
                "3. Maraton de peliculas ", "9. Salir","Digite Opcion del [1..9]" };
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    private void capturaNuevaPelicula(){
        String nombre = leerNombre("Pelicula");
        int fechaLanzamiento=leerAñoLanzamiento("Pelicula");
        int duracionEnMin=leerDuracion("Pelicula");
        String director = leerDirector();
        // grabacion de datos
        Pelicula pelicula = new Pelicula();
        pelicula.setNombre(nombre);
        pelicula.setFechaLanzamiento(fechaLanzamiento);
        pelicula.setTiempoDuracionMinutos(duracionEnMin);
        pelicula.setDirector(director);
        // mostrar datos pantalla
        pelicula.mostrarFichaTecnica("Pelicula");
        System.out.println("Director "+pelicula.toString());
    }
    private void capturaNuevaSerie(){
        String nombre = leerNombre("Serie");
        int fechaLanzamiento=leerAñoLanzamiento("Serie");
        int duracionEnMin=leerDuracion("Serie");
        int capitulosSerie = leerCantidadCapitulos();
        int cantTemporadasSerie = leerCantidadTemporadas();
        String sinopsisSerie = leerSinopsis();
        // grabacion de datos
        Serie serie = new Serie();
        serie.setNombre(nombre);
        serie.setFechaLanzamiento(fechaLanzamiento);
        serie.setEpisodioPorTemporada(capitulosSerie);
        serie.setDuracionMinPorEpidosio(duracionEnMin);
        serie.setTemporada(cantTemporadasSerie);
        serie.setSinopsis(sinopsisSerie);
        // mostrar resultados pantalla
        serie.mostrarFichaTecnica("Serie");
        System.out.println(serie.toString());
    }
    private void maratonDePeliculas(){
        System.out.println("En construccion");
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
                case 3:{
                    maratonDePeliculas();
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
