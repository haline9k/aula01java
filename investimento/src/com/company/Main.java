package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor=new Scanner(System.in);
        float doacao,investimento;
        System.out.println("digite o valor da doação:");
        doacao=leitor.nextFloat();
        if(doacao<=1000) {
            investimento = (float) (doacao * 0.05);
        }
        else{
            if(doacao<=2000) {
                investimento = (float) (doacao * 0.15);
            }
            else{
                investimento = (float) (doacao * 0.10);
            }
        }
            System.out.println("o investimento sera de :" +investimento);
            leitor.close();
    }
}
