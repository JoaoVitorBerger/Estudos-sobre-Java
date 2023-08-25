public class Caneta {



        public String modelo;
        public String cor;
        public double ponta;

        public int carga;
        public boolean tampada;

        void status() {
            System.out.println("Uma caneta"+ this.cor);
            System.out.println("Está tampada?"+ this.tampada);
        }
        void rabiscar(String modelo){
                System.out.println("A caneta "+ modelo+"  está rabiscando");
        }

        void tampar(boolean tampada){
                if (tampada==true){
                        System.out.println("Sua caneta esta tampada");
                }else{
                        System.out.println("Sua caneta está destampada");
                }
        }


    }

