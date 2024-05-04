package modelo;

public class Titulo {
    private String nombre;
    private int fechaLanzamiento;
    private double evaluacion;
    private boolean incluyePlanBasico;
    private String sinopsis;
    private int tiempoDuracioMin;

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

    public int getTiempoDuracioMin() {
        return tiempoDuracioMin;
    }

    public void setTiempoDuracioMin(int tiempoDuracioMin) {
        this.tiempoDuracioMin = tiempoDuracioMin;
    }

    public void mostrarFichaTecnica(){
        System.out.println("FICHA TECNICA");
        System.out.println("Nombre del Titulo   "+nombre);
        System.out.println("Fecha lanzamiento "+fechaLanzamiento);
        System.out.println("Duracion en minutos "+getTiempoDuracioMin() + " minutos");
    }

}

