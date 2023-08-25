import java.util.Scanner;

public class Construtores {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        User usuario =new User();



        System.out.println("Digite seu nome");
        usuario.nome=scaner.nextLine();

        System.out.println("Digite seu sobrenome");
        usuario.Sobrenome=scaner.nextLine();








    }
}
