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
public class calculoImc {
    public static void main(String[] args) {
        Scanner dados= new Scanner(System.in);
        float[] altura=new float[5];
        float[] peso=new float[5];
        float[] imc=new float[5];
        
        for(int i=1; i<=5; i++){
            System.out.println("Digite sua altura");
            altura[i]=dados.nextFloat();
            System.out.println("Digite seu peso");
            peso[i]=dados.nextFloat();
            imc[i]=(peso[i]/(altura[i]*altura[i]));
            System.out.println("O índice de imc da pessoa" +i+ " é igual a "+imc[i]);
        }
       
        
        
        
        dados.close();
    }
}
