public static void main(String[] args){
Scanner notas= new Scanner(System.in);
    float[] primeiraNota= new float[30];
    float[] segundaNota= new float[30];
    float[] media= new float[60];
    int[] aprovados= new float[60];
    int[] reprovados= new float[60];
    int[] exame= new float[60];
    

    for(i=1;i<60;i++){//recolher dados:no caso notas
    System.out.println("Digite a nota %i do aluno "+i);
    primeiraNota[i]=notas.nextInt();
    System.out.println("Digite a nota %i do aluno "+i);
    segundaNota[i]=notas.nextInt();
    media[i]=(primeiraNota[i] +segundaNota[i] )/2;
    
    }
    for(i=1;i<60;i++){// identificar em que situacao se encontra o aluno
       System.out.println("A média do aluno %d é %d",i,media[i]);
       if(media<3){
        System.out.println("Reprovado");
        reprovados[i]=reprovados[i]+1;
       }else{
        if(media>=5){
            System.out.println("Aprovado");
            aprovados[i]=aprovados[i]+1;
        }else{
            System.out.println("Exame");
            exame[i]=exame[i]+1;
        }
       }
    }
    for(i=1;i<60;i++){//mostrar a quantidade de aprovados, reprovado e que ficaram de exame
        System.out.println("Alunos reprovados "+reprovados);
        System.out.println("Alunos aprovados "+aprovados);
        System.out.println("Alunos exame "+exame);

    }

    notas.close();
}