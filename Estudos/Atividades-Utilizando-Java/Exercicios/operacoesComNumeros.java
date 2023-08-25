import java.util.Scanner;

public class operacoesComNumeros {
    public static void main(String[] args) {
        Scanner opcao=new Scanner(System.in);
        System.out.println("Digite um numero");
        int a=opcao.nextInt();
        System.out.println("Digite outro numero");
        int b=opcao.nextInt();
        
        System.out.println("Escolha a operacao que deseja realizar com os numeros");
        System.out.println("1 - Média entre os dois números");
        System.out.println("2 - A soma dos dois números");
        System.out.println("3 - Oproduto entre os dois números");
        int opc=opcao.nextInt();

        if(opc==1){
            float resultado=(a+b)/2;
            System.out.println(resultado);
        }else{
            if(opc==2){
                float resultado=(a+b);
                System.out.println(resultado);
            }else{
                if(opc==3){
                    float resultado=(a*b);
                    System.out.println(resultado);
                }
            }
        }

        opcao.close();
    }
}
