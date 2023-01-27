public class Livro implements Publicacao{
    private String titulo;
    private Pessoa autor;
    private Pessoa leitor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;

    public Livro(String titulo, Pessoa autor, int totPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
    }

    public String detalhes() {
        return "Titulo: " + titulo + "\nAutor: " + autor.getNome() + 
        "\nLeitor: " + leitor.getNome() +"\nTotal de paginas: " + totPaginas +
        "\nPagina atual: " + pagAtual; 
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pagina) {
        this.pagAtual = this.pagAtual + pagina;
    }

    @Override
    public void avancarPag() {
        this.pagAtual = this.pagAtual + 1;
    }

    @Override
    public void voltaPag() {
        this.pagAtual = this.pagAtual - 1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }
    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
