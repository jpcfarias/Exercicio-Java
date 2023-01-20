import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Veiculo("pwd-111", 2001));
        veiculos.add(new Onibus("dos-645", 2005, 40));
        veiculos.add(new Caminhao("rme-294", 2010, 4));
        veiculos.add(new Veiculo("gnt-457", 2020));

        for(Veiculo veiculo : veiculos){
            veiculo.exibirDados();
        }
    }
}
