public static void main(String[] args) {
    Scanner total= new Scanner(System.in);
    int inicio=1;
    int fim=10;
    int resultado=0;
    
    do{
        resultado+=resultado+1;
        inicio++;        
    }while(inicio<fim);
    System.out.println("A soma dos números de 1 a 10 é "+resultado);
   
    total.close();
}