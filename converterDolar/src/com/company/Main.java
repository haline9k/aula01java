package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double valor1,res;
        double valor2;
        Scanner leitor=new Scanner(System.in);
        System.out.println("Este programa ira converter dolar em real");
        System.out.println("Digite o valor em dolar: ");
        valor1=leitor.nextDouble();
        System.out.println("Digite o valor da cotação: ");
        valor2=leitor.nextDouble();
        res=valor1*valor2;
        System.out.println("o valor em reais é :" + res);
        leitor.close();

    }
}
