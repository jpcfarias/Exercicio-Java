import java.util.*;

public class Produtos {
    protected String nome_produto;
    protected double preco;
    protected int qnt;
    protected Map<String,Integer> tabela_estoque = new HashMap<>();
    protected Map<String, Double> tabela_preco = new HashMap<>();

    public Set<String> getProdutos() {
        return tabela_estoque.keySet();
    }
    public int getTabela_estoque(String k) {
        return tabela_estoque.get(k);
    }
    public void setTabela_estoque(String x, int y) {
        this.tabela_estoque.put(x,y);
    }
    public Map<String, Double> getTabela_preco() {
        return tabela_preco;
    }
    public void setTabela_preco(String x, double y) {
        this.tabela_preco.put(x,y);
    }
    public Double getValueTabela_preco(String k) {
        return tabela_preco.get(k);
    }
    public String getNome_produto() {
        return nome_produto;
    }
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQnt() {
        return qnt;
    }
    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    
}