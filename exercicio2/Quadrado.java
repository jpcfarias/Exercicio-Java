public class Quadrado extends Retangulo {
    public Quadrado(double lado, String cor){
        super(lado, lado, cor);
    }

    @Override
    public String toString() {
        return "Lado: " + this.getLado1() + " Area: "+ area() + " Cor: " + cor;
    }
}
