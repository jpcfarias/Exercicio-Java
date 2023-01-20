import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Boolean validacao = false;
        String item;
        int quantidade, x;
        Double total = 0.0, total1 = 0.0;
        Itens compras = new Itens();
        Supermercado supermercado = new Supermercado();
        Scanner input = new Scanner(System.in);
        System.out.println("Bom dia, estes sao nosso produtos:"+ supermercado.getProdutos());
        while(true){
            System.out.println("Qual produto?");
            item = input.next();
            System.out.println("Quantos?");
            quantidade = input.nextInt();
            compras.setNome_produto(item);
            compras.setQnt(quantidade);
            if(compras.getQnt() > supermercado.getTabela_estoque(item)){
                System.out.println("Nao possui essa quantidade em estoque");
            }else{
                compras.setSacola(compras.getNome_produto(), compras.getQnt());
                validacao = true;
            }

            System.out.println("deseja comprar mais alguma coisa? 0-sim 1-nao");
            x = input.nextInt();
            if (x == 1) {
                break;
            }
        }
        System.out.println(compras.getSacola());
        if (validacao == true) {
            for(int j = 0; j < compras.itens_sacola(); j++){
                Object[] arr = compras.getNomes();
                String aux = arr[j].toString();
                total1 = supermercado.getValueTabela_preco(aux) * compras.getQnt();
                total = total1 + total;
            }
            System.out.println(total);
        }else{
            System.out.println("Volte sempre");
        }
        input.close();
    }
}
