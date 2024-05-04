package modelo;

public class Serie extends Titulo{
    private int temporada;
    private int episodioPorTemporada;
    private int duracionMinPorEpisodio;

    @Override  // sobreescritura de metodo
    public int getTiempoDuracioMin() {
       //   return super.getTiempoDuracioMin();
        int duracion = duracionMinPorEpisodio * episodioPorTemporada * temporada;
      return duracion;
    }
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
        return duracionMinPorEpisodio;
    }

    public void setDuracionMinPorEpidosio(int duracionMinPorEpidosio) {
        this.duracionMinPorEpisodio = duracionMinPorEpidosio;
    }
}
