public static void main(String[] args) {
    Scanner notas= new Scanner(System.in);
    int numeros[]= new int[30];
    for(i=1;i<30;i++){
    System.out.println("Digite o "+i+" número\n");
    numeros[i]=notas.nextInt();
    }

    for(i=1;i<30;i++){
        if(numeros%2==0){
            System.out.println("O numero "+numeros[i]+" é par\n");
        }else{
            System.out.println("O numero "+numeros[i]+" não é par\n");
        }
    }
    notas.close();
}
