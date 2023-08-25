import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Nessa aula aprendemos sobre atributos e metodos,
        // aprendi sobre o que é instanciar uma classe que é transformar uma classe em objeto
        //e sobre metodos que são as ações que esse objeto ira realizar
        Caneta c1= new Caneta();
        c1.cor="vemelho";
        c1.carga=90;
        c1.modelo="bic";
        c1.ponta=0.5;
        

        c1.rabiscar("Bic");
        c1.status();
        c1.tampar(false);



    }
}
