package modelo;

public class Titulo {
    private String nombre;
    private int fechaLanzamiento;
    private double evaluacion;
    private boolean incluyePlanBasico;
    private String sinopsis;
    private int tiempoDuracionMinutos;

    // getters and setters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }
    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public boolean isIncluyePlanBasico() {
        return incluyePlanBasico;
    }

    public void setIncluyePlanBasico(boolean incluyePlanBasico) {
        this.incluyePlanBasico = incluyePlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDuracionMinutos() {
        return tiempoDuracionMinutos;
    }

    public void setTiempoDuracionMinutos(int tiempoDuracionMinutos) {
        this.tiempoDuracionMinutos = tiempoDuracionMinutos;
    }

    public void mostrarFichaTecnica(String texto){
        System.out.println("====================================================");
        System.out.println("FICHA TECNICA "+texto.toUpperCase());
        System.out.println("Nombre o Titulo "+texto+" : "+nombre);
        System.out.println("Fecha lanzamiento "+texto+" :"+fechaLanzamiento);
        System.out.println("Duracion en minutos "+texto+" :"+getTiempoDuracionMinutos() + " minutos");
        System.out.println("====================================================");
    }
}

