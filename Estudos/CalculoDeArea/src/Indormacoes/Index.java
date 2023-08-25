package Indormacoes;

import Indormacoes.Parametros;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        //Programa que recebe os 3 lados de um triangulo e calcula sua  area.
        Scanner scanner= new Scanner(System.in);
        Parametros t1= new Parametros();
        System.out.println("Digite o lado A do triangulo 1");
        t1.ladoA=scanner.nextInt();

        System.out.println("Digite o lado B do triangulo 1");
        t1.ladoB=scanner.nextInt();

        System.out.println("Digite o lado C do triangulo 1");
        t1.ladoC=scanner.nextInt();

        t1.CalcularArea();

        Parametros t2= new Parametros();
        System.out.println("Digite o lado A do triangulo 2");
        t2.ladoA=scanner.nextInt();

        System.out.println("Digite o lado B do triangulo 2");
        t2.ladoB=scanner.nextInt();

        System.out.println("Digite o lado C do triangulo 2");
        t2.ladoC=scanner.nextInt();

        t2.CalcularAreaTdois();








    }
}
