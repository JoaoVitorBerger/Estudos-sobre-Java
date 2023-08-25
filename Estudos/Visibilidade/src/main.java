public class main {
    // Nessa aula aprendi sobre a visibilidade dentro de um objeto,
    // como funciona o private, public e protected
    //public qualquer arquivo pode ter acesso a minha classe
    //private somente a classe em que se encontra o atributo pode alterar o estado ou valor
    //protected somente classes que estao no mesmo diretorio podem ter acesso a minha variavel

    public static void main(String[] args) {
    Caneta c1 = new Caneta();
    c1.modelo="Bic";

    c1.escrever();
    c1.status();
    c1.destampar();
    c1.carga=80;
    }
}
