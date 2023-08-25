public class main {
    //Nessa aula aprendi sobre construtores, getters e setters
    //getters:  retornam uma informação para onde foi chamado
    //setters: pega um valor que é inserido e dentro da classe privada faza a alteração da variavel
    // construtores: responsavel por inicializar as variaveis e seus metodos e atributos
    public static void main(String[] args) {
    Caneta c1= new Caneta();
    c1.Caneta("bic",0.5);

        System.out.println(c1.getPonta());
        System.out.println(c1.getModelo());

    }
}
