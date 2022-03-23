package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int valor1,valor2,res;
        Scanner leitor=new Scanner(System.in);
        System.out.println("Este programa ira exibir a soma de dois numeros");
        System.out.println("Digite o primeiro numero: ");
        valor1=leitor.nextInt();
        System.out.println("Digite o segundo numero: ");
        valor2=leitor.nextInt();
        res=valor1+valor2;
        System.out.println("A soma é :" + res);
        leitor.close();
    }
}
