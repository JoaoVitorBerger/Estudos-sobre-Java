import java.util.Scanner;

public class numeroMaiorQueVinte {
    public static void main(String[] args) {
        Scanner numero= new Scanner(System.in);
        System.out.println("Digite um número");
        int escolha=numero.nextInt();
        if(escolha>=20){
            System.out.println("Número maior que 20");
        }
        else{
            System.out.println("Número menor que 20");
        }
        numero.close();
    }
}
