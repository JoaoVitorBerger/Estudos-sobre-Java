/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.joaovitor;

import java.util.Scanner;

/**
 *
 * @author Usere
 */
public class atividadeVetores {
    public static void main(String[] args) {
        Scanner valores= new Scanner(System.in);
        int[] primeiroVetor= new int[5];
        int[] segundoVetor= new int[5];
        int[] resultado= new int[5];
        
        for(int i=1;i<5;i++){
        System.out.println("Digite o"+i+ "numero para o primeiro vetor");
        primeiroVetor[i]=valores.nextInt();
        System.out.println("Digite o"+i+ "numero para o segundo vetor");
        segundoVetor[i]=valores.nextInt();
        resultado[i]=segundoVetor[i]+primeiroVetor[i];
        
        }
        
        for(int i=1;i<5;i++){
        System.out.println("A soma da posicao "+i+" do vetor1 + a soma da posicao"+i+"do vetor2 é igual a"+resultado[i]);
        }
        
        
        
        valores.close();
    }
}
