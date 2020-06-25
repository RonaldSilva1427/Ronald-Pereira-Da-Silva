package br.edu.univas.main;

import java.util.Scanner;

public class Questao3
{
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
        System.out.println("Digite um numero para ver se vai arredondar ou nao:");

        int numero = input.nextInt();

        if ((numero + 1) % 5 == 0) {

            System.out.println(numero+1);

        }else if ((numero + 2)% 5 == 0) {

           System.out.println(numero + 2);

        }else
        System.out.println(numero);
	
}
}