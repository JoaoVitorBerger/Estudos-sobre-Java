import java.util.Scanner;

public class JavaInterativo {
    // Voce pode utilizar atribuições do objeto a qualquer variavel desejada, no caso
    // Utilizei uma função do Scanner que armazena uma informação, no caso uma String
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Qual é seu nome");

        String nome= scanner.nextLine();

        System.out.println("Olá," + nome);
    }
}
