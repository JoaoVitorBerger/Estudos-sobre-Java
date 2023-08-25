public static void main(String[] args) {
   Scanner entrada=new Scanner(System.in);
   System.out.println("Digite um número");
   int numero= entrada.nextInt();

   if(numero > 0){
    System.out.println("Digite um número:");
   }

   entrada.close();
}