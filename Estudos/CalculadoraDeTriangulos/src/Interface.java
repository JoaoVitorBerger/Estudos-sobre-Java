import Informacoes.DadosTriangulo;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        DadosTriangulo trianguloA= new DadosTriangulo();

        DadosTriangulo trianguloB= new DadosTriangulo();

        System.out.println("Digite o ladoA do triangulo 1 ");
        trianguloA.ladoA=scanner.nextInt();

        System.out.println("Digite o ladoB do triangulo 1 ");
        trianguloA.ladoB=scanner.nextInt();

        System.out.println("Digite o ladoC do triangulo 1 ");
        trianguloA.ladoC=scanner.nextInt();


        System.out.println("A area do triangulo 1 é igual a " + trianguloA.Area());



        System.out.println("Digite o ladoA do triangulo 2 ");
        trianguloB.ladoA=scanner.nextInt();

        System.out.println("Digite o ladoB do triangulo 2 ");
        trianguloB.ladoB=scanner.nextInt();

        System.out.println("Digite o ladoC do triangulo 2 ");
        trianguloB.ladoC=scanner.nextInt();

        System.out.println("A area do triangulo 2 é igual a " + trianguloB.Area());


        if(trianguloA.Area()>trianguloB.Area()){
            System.out.println("A area do triangulo 1 é maior que a area do triangulo 2");
        }else{
            System.out.println("A area do triangulo 2 é maior que a area do triangulo 1");
        }



    }
}
