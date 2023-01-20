import java.util.*;

public class Itens extends Produtos{
    private Map<String,Integer> sacola = new HashMap<>();

    public void limpar_carrinho(String k) {
        sacola.remove(k);
    }
    public Map<String, Integer> getSacola() {
        return sacola;
    }
    public void setSacola(String nome, int quantidade) {
        sacola.put(nome, quantidade);
    }
    public int itens_sacola() {
        return sacola.size();
    }
    public int getQnt(String k){
        return sacola.get(k);
    }
    public Object[] getNomes() {
        Set<String> nomes = sacola.keySet();
        Object[] arr = nomes.toArray();
        return arr;
    }
/*
 * 
 * o preco nao é visivel pois esta em private, é preciso estar em protect
    public void a() {
    preco = 3.4;
    }
 * 
 */
}
