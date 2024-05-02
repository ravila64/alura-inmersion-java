package modelo;

public class Serie extends Titulo{
    private int temporada;
    private int episodioPorTemporada;
    private int duracionMinPorEpi   kdosio;
    // getters and setters

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getDuracionMinPorEpidosio() {
        return duracionMinPorEpidosio;
    }

    public void setDuracionMinPorEpidosio(int duracionMinPorEpidosio) {
        this.duracionMinPorEpidosio = duracionMinPorEpidosio;
    }
}
