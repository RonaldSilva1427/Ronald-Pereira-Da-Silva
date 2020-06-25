package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		float numeros;
		int conta = 0;
		 
		do {
			
			System.out.println("Digite seus numeros");
			System.out.println("Para sair digite: 0");
			numeros = leitura.nextFloat();

            if (numeros < 0) {
                conta++;
            }

                else if ( numeros == 0) {
                    break;

            }


           } while (true);

        System.out.println("Foram digitados " + conta + " números negativos!");
				
	}

}
