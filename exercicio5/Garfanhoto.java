public class Garfanhoto extends Pessoa{
    private String login;
    private int totAssistindo;

    public Garfanhoto(String nome, int idade, char sexo, String login, int totAssistindo) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistindo = totAssistindo;
        //TODO Auto-generated constructor stub
    }

    public void viuMaisUm(){

    }

    @Override
    public String toString() {
        return "Garfanhoto ["+super.toString()+"login=" + login + ", totAssistindo=" + totAssistindo + "]";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }
}
