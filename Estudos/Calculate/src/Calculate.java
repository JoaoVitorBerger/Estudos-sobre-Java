public class Calculate {
    public static void main(String[] args){
        int x= Integer.parseInt(args[1]);
        int y= Integer.parseInt(args[2]);


        if (args[0].equals("soma")){
            soma(x,y);
        }else
            if(args[0].equals("subtrair")){
            subtrair(x,y);
        }else if(args[0].equals("multiplicar")){
                multiplicar(x,y);

            }else if(args[0].equals("dividir")){
                dividir(x,y);
            }else{
                System.out.println("Insira uma operacao valida");
            }
    }

    static void soma(int x, int y){
        System.out.println(x+y);
    }
    static void subtrair(int x, int y){
        System.out.println(x-y);
    }

    static void multiplicar(int x, int y){
        System.out.println(x*y);
    }
    static void dividir(int x, int y){
        System.out.println(x/y);
    }
}
