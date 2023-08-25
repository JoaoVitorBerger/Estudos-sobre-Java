import java.util.Scanner;

public class maioridade {
    public static void main(String[] args) {
        Scanner idade=new Scanner(System.in);
        System.out.println("Quantos anos você tem");
        int maioridade= idade.nextInt();
        if(maioridade<18){
            System.out.println("Menor de idade");
        }else{
            System.out.println("Maior de idade");
        }
        idade.close();
    }
}
