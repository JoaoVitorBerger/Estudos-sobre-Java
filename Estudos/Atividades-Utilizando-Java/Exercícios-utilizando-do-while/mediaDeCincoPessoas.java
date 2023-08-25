public static void main(String[] args) {
    Scanner total= new Scanner(System.in);
     int fim=5;
     int inicio=1;
     float resultado=0;
     float[] altura= new float[5];
    
    do{
        System.out.println("Digite sua altura\n");
        altura[inicio]=nextFloat();
        resultado+=altura[inicio];
        inicio++;
    }while(inicio<fim);
    System.out.println("A média aritmética das alturas é"+(resultado/5));
   
    total.close();
}