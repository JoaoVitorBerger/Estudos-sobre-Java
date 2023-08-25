public static void main(String[] args) {
    Scanner total= new Scanner(System.in);
    System.out.println("Digite um numero");
    int numero=total.nextInt();
    int incremento=0;
    do{
        incremento++;
        System.out.println("Seu numero é  "+(numero)+"\n");
        System.out.println("Seu antecessor é "+(numero-1)+"\n");
        System.out.println("Seu sucessor é  "+(numero+1)+"\n");
    }while(incremento<1);
   
    total.close();
}