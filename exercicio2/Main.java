public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(2, 3, "azul");
        System.out.println(retangulo.toString());
        Quadrado quadrado = new Quadrado(3, "vermelho");
        System.out.println(quadrado);
        Triangulo triangulo = new Triangulo(9, 12, "verde");
        System.out.println(triangulo);
        Circulo circulo = new Circulo(3, "cinza");
        System.out.println(circulo);
    }
}
