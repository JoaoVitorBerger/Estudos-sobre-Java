package joao;

import java.util.Scanner;

public class ComparandfoStings {
    public static void main(String[] args) {
        String password ="123456";
        System.out.println("Digite a sua senha:");

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        System.out.println(password.equals(pass));

        // == nao compara o conteudo, ele compara a referencia dos objetos
        System.out.println(password ==pass);

    }
}
