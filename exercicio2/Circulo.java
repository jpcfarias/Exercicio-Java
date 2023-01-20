public class Circulo extends Figura{
    double raio;
    public Circulo(double raio, String cor){
        this.raio = raio;
        this.cor = cor;
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double area(){
        return 3.14 * (raio * raio);
    }
    public double getDiametro(){
        return 2 * raio;
    }
    @Override
    public String toString() {
        return "Raio: "+ this.raio +" Area: "+ this.area() +" Cor: "+ this.cor;
    }
}