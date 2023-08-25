import java.util.Scanner;

public class divisivelPorTresESete {
    public static void main(String[] args) {
        Scanner numero= new Scanner(System.in);
        System.out.println("Digite um número");
        int escolha=numero.nextInt();
        if(escolha%3==0 && escolha%7==0 ){
            System.out.println("Seu número é divisível por 3 e por 7");
        }
        else{}
        numero.close();
    }
}
