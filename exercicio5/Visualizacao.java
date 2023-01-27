public class Visualizacao {
    private Garfanhoto espectador;
    private Video filme;
    
    public Visualizacao(Garfanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        espectador.setTotAssistindo(espectador.getTotAssistindo() + 1);
        filme.setViews(filme.getViews() + 1);
    }
    public void avaliar(){

    }
    public void avaliar(int nota){

    }
    public void avaliar(String porc){

    }
    public Garfanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Garfanhoto espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }
    @Override
    public String toString() {
        return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
    }
}
