import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner nome= new Scanner(System.in);
        System.out.println("Digite F para feminino");
         var sexo=nome.next();
         if("F".equals(sexo)){
            System.out.println("Sexo feminino");
         }
        nome.close();
    }
}
