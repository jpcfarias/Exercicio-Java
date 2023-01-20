import java.util.Scanner;

public class ex2 {
    private static int root(int k) {
        int aux = 0;
        while ((aux * aux) < k) {
            aux = aux+1;
        }
        return aux;
    }
    public static void main(String[] args) {
        int aux,distancia;
        System.out.println("Digite as cordenadas na ordem -> (x1,y1,z1)(x2,y2,z2)");
        Scanner input = new Scanner(System.in);
        int[] cordenadas = {0,0,0,0,0,0};
        for(int x=0; x < 6; x++){
            aux = input.nextInt();
            cordenadas[x] = aux;
        }
        input.close();
        distancia = root(
        ((cordenadas[3] - cordenadas[0]) * (cordenadas[3] - cordenadas[0]))+
        ((cordenadas[4] - cordenadas[1]) * (cordenadas[4] - cordenadas[1]))+
        ((cordenadas[5] - cordenadas[2]) * (cordenadas[5] - cordenadas[2]))                  
        );
        System.out.println("A distancia entre esses pontos é: "+distancia);
    }
}
