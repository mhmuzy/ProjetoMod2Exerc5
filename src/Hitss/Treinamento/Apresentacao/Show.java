package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		try {
			System.out.println("");
			System.out.println("           Hitss Treinamento");
			System.out.println("");
			double litro, km, calc;
			
			km = 0.5;
			
			System.out.println("Digite a Quantidade de Litros para Colocar no Carro:");
			
			System.out.println("");
			
			Scanner teclado = new Scanner(System.in); 
			
			litro = teclado.nextDouble();
			
			System.out.println("");
			
			calc = litro * km;
			
			System.out.println("A quanatidade de Km's Rodados é de: " + calc);
			
		} catch (Exception e) {
			System.out.println("Erro de Processamento: " + e.getMessage());
		}
	}
}
