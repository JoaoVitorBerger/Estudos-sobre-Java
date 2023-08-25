import java.util.Scanner;

public class reajusteSlario {
    public static void main(String[] args) {
        Scanner salario= new Scanner(System.in);
        System.out.println("Qual é o seu salário");
        int valor=salario.nextInt();
        if(valor<=300){
            valor= valor+(valor/35/100);
            System.out.println("Seu salário com o reajuste é");
        }else{
            valor= valor+(valor/15/100);
            System.out.println("Seu salário com o reajuste é");
        }
        salario.close();
    }
}
