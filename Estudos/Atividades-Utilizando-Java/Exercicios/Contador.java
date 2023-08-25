/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.joaovitor;

import java.util.Scanner;

/**
 *
 * @author Usere
 */
public class JoaoVitor {

    public static void main(String[] args) {
        int contador=0;
        int contador2=0;
        Scanner total= new Scanner(System.in);
        for(int i=1;  i<=30; i++){
            System.out.println("Digite a sua idade");
            int idade= total.nextInt();
            if(idade>25){
                 contador+=1;
            }else{
                contador2+=1;
            }
            }
        System.out.println("A quantidade de pessoas que têm mais de 25 anos são" +contador+ "pessoas");
        System.out.println("A quantidade de pessoas que têm menos de 25 anos são" +contador2+ "pessoas");
                
                
        total.close();
    }
        
}

