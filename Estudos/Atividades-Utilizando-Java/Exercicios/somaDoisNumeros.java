import java.util.Scanner;

public class somaDoisNumeros {
    public static void main(String[] args) {
        Scanner numeros= new Scanner(System.in);
        System.out.println("Digite um número");
        int a=20;
        System.out.println("Digite outro número");
        int b=30;
        int soma= (a + b);

        if(soma>10){
            System.out.println(+soma);
        }
        numeros.close();
    }
}
