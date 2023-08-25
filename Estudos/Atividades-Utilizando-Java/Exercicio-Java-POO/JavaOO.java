/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sun;

import java.util.Scanner;
import sistema.Quadrado;

/**
 *
 * @author autologon
 */
public class JavaOO {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        Quadrado quadradoA,quadradoB;
        quadradoA = new Quadrado();      
        quadradoB = new Quadrado();
        
        System.out.println("Programa para calcular");
        System.out.println("Informe a altura do quadrado A");
        quadradoA.altura= sc.nextDouble();
        
        System.out.println("Informe a altura do quadrado A");
        quadradoA.largura= sc.nextDouble();
       
        double resultadoQa=quadradoA.calcularArea();
        
         System.out.println("Informe a altura do quadrado B");
        quadradoB.altura= sc.nextDouble();
        
        System.out.println("Informe a altura do quadrado B");
        quadradoB.largura= sc.nextDouble();
       
        double resultadoQb=quadradoB.calcularArea();
        
        
        
        if(resultadoQa>resultadoQb){
            System.out.println("A área do Quadrado A é maior.");
            
        }else{
            System.out.println("A área do Quadrado B é maior.");
        }
                
       
    }
}
