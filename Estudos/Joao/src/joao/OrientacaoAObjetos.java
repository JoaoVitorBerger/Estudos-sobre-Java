package joao;

import java.util.Scanner;

public class OrientacaoAObjetos {

    public static void main(String[] args) {
        User userA = new User();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Qual é seu nome?");

        String nome= scanner.nextLine();
        //quando for alterar o valor da variavel, utilizamos o set
        userA.setFirstName(nome);
        //quando formos imprimir o valor da variavel atualizada, utilizamos o get
        System.out.println(userA.getFirstName());

        User userB = new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o nome de sua cidade");
        String nomeCidade= sc.nextLine();
        userB.setLastName(nomeCidade);
        System.out.println(userB.getLastName());
    }
}
