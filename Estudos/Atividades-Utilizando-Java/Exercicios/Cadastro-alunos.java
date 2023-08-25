/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joao.vitor.berger.e.vert;

import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class JoaoVitorBergerEVert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
         
      Scanner total= new Scanner(System.in);
    int[] cadastro=new int[3]; 
    int escolha;int idade=0;int idadeEscolhida=0;
    String[] aluno= new String[3];
    int contador=0;
    String nome= new String();
    String guardaNome= new String();
    int contadorMensagem=0;
    
    
    do{
        
        System.out.println("\nDigite o numero da opcao que deseja realizar\n");
        System.out.println("1 - Cadastrar  alunos");
        System.out.println("2 - Ordenar as idades por ordem crescente e mostrar na tela");
        System.out.println("3 - Faça uma pesquisa com as idades digitadas");
        System.out.println("0 - Para sair do menu\n");
        
        escolha=total.nextInt();
        
        switch(escolha){
            case 1://Cadastrar alunos
                for(int i=0; i<cadastro.length;i++){

                System.out.println("Digite a idade do aluno"+(i+1));
                cadastro[i]=total.nextInt();
                System.out.println("Digite o nome do aluno"+(i+1));
                aluno[i]=total.next();
                }
                break;
                
            
            case 2://Organizacao em ordem crescente
                int aux;
                for(int k=0;k<cadastro.length;k++){
                for(int i=0;i<cadastro.length-1;i++){
                if(cadastro[i]>cadastro[i+1]){
                    aux=cadastro[i];
                    cadastro[i]=cadastro[i+1];
                    cadastro[i+1]=aux;
                    nome=aluno[i];
                    aluno[i]=aluno[i+1];
                    aluno[i+1]=nome;
                    }
                }
                    
                                                  }
               
                                                     
                
                                                
                int m=0;
                while(cadastro.length>m){
                    System.out.println(cadastro[m]+aluno[m]+", \n");
                    m++;
                                        }
                break;
                
            case 3:
                
                System.out.println("Digite a idade que deseja pesquisar");
                 idade=total.nextInt();
                 
                for(int l=0;l<cadastro.length;l++)
                {
            
                    if(cadastro[l]==idade)
                    {
                        contador+=1;
                        guardaNome=aluno[l];
                        
                    }
                    else {
                       contadorMensagem=0;
                }
                }
                
                
                 if(contador!=0)
                 {
                    System.out.println("A pessoa que tem "+idade+" é "+guardaNome);
                 }
                 if(contadorMensagem==0){
                     System.out.println("Não encontrado");
                 }
                
                break;
                 
        }
    
        }while(escolha!=0);    
    total.close();
    
    }
    }



    
     

