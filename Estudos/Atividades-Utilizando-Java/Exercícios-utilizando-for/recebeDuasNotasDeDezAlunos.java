public static void main(String[] args) {
    Scanner media= new Scanner(System.in);
    float primeiraNota[]= new float[5];
    float segundaNota[]= new float[5];
    float media[]= new float[10];
    for(i=1;i<10;i++){
        System.out.println("Digite a primeira nota do aluno "+i+"\n");
        primeiraNota[i]=media.nextInt();
        System.out.println("Digite a segunda nota do aluno "+i+"\n");
        segundaNota[i]=media.nextInt();
        media[i]=(primeiraNota+segundaNota)/2;
        System.out.println("Sua média foi "+media[i]);
        
    }
    media.close();
}