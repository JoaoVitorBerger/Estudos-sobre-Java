import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Conta jubileu= new Conta();
    jubileu.Conta(1234,"cp","Jubileu",300,true);
    jubileu.abrirConta(true, "cp");
    jubileu.fecharConta(true);
    jubileu.despositar(500);
    jubileu.sacar(1000);
    jubileu.Status();
    jubileu.pagarMensal("cp");
    







    }
}
