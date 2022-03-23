package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double valor1,valor2,valor3,res1,res2;
        Scanner leitor=new Scanner(System.in);
        System.out.println("Este programa ira quantidade de KM por Litro");
        System.out.println("Digite a quantidade de KM inicial: ");
        valor1=leitor.nextDouble();
        System.out.println("Digite a quantidade de KM final: ");
        valor2=leitor.nextDouble();
        System.out.println("Digite a quantidade de litros de gasolina: ");
        valor3=leitor.nextDouble();
        res1=valor2-valor1;
        res2=res1/valor3;
        System.out.println("A qtde de km por litro é :" + res2 + " km/l");
        leitor.close();
    }
}
