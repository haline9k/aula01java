package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor=new Scanner(System.in);
        int idade;
        System.out.println("digite a idade:");
        idade=leitor.nextInt();

        if(idade<16){
            System.out.println("nao pode votar e nem embarcar");
        }
        else if (idade<18){
            System.out.println("voto facultativo, embarque permitido");
        }
        else{
            System.out.println("voto obrigatorio");
        }
        leitor.close();
    }
}
