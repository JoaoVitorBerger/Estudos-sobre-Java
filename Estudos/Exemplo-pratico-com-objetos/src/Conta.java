import java.util.Scanner;

public class Conta {
    public int numConta;
    protected String tipo;

    private String dono;

    private double saldo;
    private boolean status;

    public void Conta(int numConta,String tipo,String dono,double saldo,boolean status){
        this.dono=dono;
        this.numConta=numConta;
        this.tipo=tipo;
        this.saldo=saldo;
        this.status=status;

        setNumConta(numConta);
        setDono(dono);
        setStatus(status);
        setTipo(tipo);
        setSaldo(saldo);


    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }




    public int  getNumConta() {
        return numConta ;
    }



    public String getTipo() {
        return tipo;
    }



    public String getDono() {
        return dono;
    }



    public double getSaldo() {
        return saldo;
    }


    public boolean getStatus(){
        return status;
    }

    // Métodos
    public void abrirConta(boolean status,String tipo){
        if (status==true){
            if(tipo=="cc"){
                saldo+=50;
                System.out.println("Por ter aberto uma conta corrente você recebeu um acrescimo em seu saldo de 50 reais, seu saldo atua é de "+getSaldo());
            }else {
                saldo+=150;
                System.out.println("Por ter aberto uma conta poupança você recebeu um acrescimo em seu saldo de 150 reais, seu saldo atua é de "+getSaldo());
            }


        }else {
            System.out.println("A sua permissao para abrir a conta não está liberada");
        }
    }

    public void fecharConta(boolean status){

        if(status==true){

                if (getSaldo()==0){
                    System.out.println("Sua conta foi fechada com sucesso");
                }else{
                    if (getSaldo()<0){
                        System.out.println("Seu saldo está negativo, faça o pagamento das pendencias para fechar sua conta");
                    }else {
                        if (getSaldo()>0){
                            System.out.println("Sua conta apresenta valores que podem ser sacados, faça o saque para concluir o fechamento da conta");
                        }
                    }
                }

        }
    }
    public void despositar(int valor){
         saldo+=valor;
          System.out.println("O valor que foi depositado é de "+valor+", seu saldo atual é de  "+getSaldo());
    }
    public void sacar(int saque){
        if (saldo<saque){
            System.out.println("Seu saldo é insulficiente para ser sacado, saldo atual é de "+getSaldo());

        }

    }

    public void pagarMensal(String tipo){
        if (tipo=="cc"){
            saldo-=12;
        }else {
            saldo-=20;
        }
    }

    public void Status(){
        System.out.println(getDono());
        System.out.println(getNumConta());
        System.out.println(getTipo());
        System.out.println(getSaldo());
        System.out.println(getStatus());
    }
}
