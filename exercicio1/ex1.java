import java.util.Scanner;
//import java.lang.Math;
/**
 * ex1
 */
public class ex1 {
    private static int root(int k) {
        int aux = 0;
        while ((aux * aux) < k) {
            aux = aux+1;
        }
        return aux;
    }
    public static void main(String[] args) {
        int a,b,c,baskara1, baskara2;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        input.close();
        baskara1 = (((-1)*b) + root((b*b) - (4 * a * c)))/2*a;
        baskara2 = (((-1)*b) - root((b*b) - (4 * a * c)))/2*a;
        System.out.println("Primeira raiz = "+ baskara1 +"\nSegunda raiz = "+ baskara2);
    }
}