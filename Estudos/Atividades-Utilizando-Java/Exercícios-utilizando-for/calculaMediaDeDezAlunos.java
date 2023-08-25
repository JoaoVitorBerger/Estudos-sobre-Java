public static void main(String[] args) {
    public static void main(String[] args) {
    Scanner total= new Scanner(System.in);
    float primeiraNota[]= new float[5];
    float segundaNota[]= new float[5];
    float resultado=0;
    float media[]= new float[10];
    for(i=1;i<10;i++){
        System.out.println("Digite a nota do aluno  "+i);
        primeiraNota[i]=total.nextInt();
        System.out.println("Digite a segunda nota do aluno  "+i);
        segundaNota[i]=total.nextInt();
        System.out.println("As notas do aluno"+i+"são"+primeiraNota[i]+"e"+segundaNota[i]);
        System.out.println("Sua media é igual a"+(media[i]=((primeiraNota[i]+segundaNota[i])/2)));  
    }
    for(i=1;i<10;i++){
        resultado+=media[i];
    }
    System.out.println("A média geral dos alunos é "+(resultado));
    total.close();
}
}