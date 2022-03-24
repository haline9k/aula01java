package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor=new Scanner(System.in);
        int idade;
        idade=leitor.nextInt();
        if(idade>=12){
           System.out.println("Voce pode jogar") ;
        }
        leitor.close();
    }
}
