import java.util.Arrays;
import java.util.Scanner;

public class recebeDoisNumeros {
    public static void main(String[] args) {
        Scanner numeros= new Scanner(System.in);
        System.out.println("Digite um número");
        int a=numeros.nextInt();
        System.out.println("Digite outro número");
        int b=numeros.nextInt();
        int[][] escolha= new int[a][b];
        Arrays.sort(escolha);
        System.out.println(escolha);
        numeros.close();
    }
}
