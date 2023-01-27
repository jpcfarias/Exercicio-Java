public class Main {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("Joao", 19, 'M');
        Pessoa fulano = new Pessoa("Fulano", 23, 'M');
        Livro biografia = new Livro("Biografia", joao, 43);

        biografia.setLeitor(fulano);
        biografia.abrir();
        biografia.setPagAtual(1);
        biografia.avancarPag();
        System.out.println(biografia.detalhes());
        biografia.fechar();
        System.out.println(fulano);
        System.out.println(joao);
    }
}
