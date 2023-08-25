public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;

    protected double carga;

    protected boolean tampada;

    void status(){
        System.out.println("Modelo "+modelo);
        System.out.println("uma caneta "+cor);
        System.out.println("Ponta:" +ponta);
        System.out.println("Carga:" +carga);
        System.out.println("Está tampada"+tampada);
    }


    public void destampar(){
        tampada=true;
        if (tampada==false){
            System.out.println("A caneta esta destampada");
        }else {
            System.out.println("A caneta esta tampada");
        }
    }
    public void escrever(){
        System.out.println("A caneta "+modelo+ " esta escrevendo");
    }
    private  void rabiscar(){

    }
}
