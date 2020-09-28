package LiandraJavaAngular;

import java.util.Scanner;

public class ListaExercicioIF7 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int quantidadeLados;
		int base;
		int altura; 
		
		System.out.println("Quantos lados tem seu poligono regular?:");
		System.out.println("3, 4 ou 5?");
		quantidadeLados = ler.nextInt();
		
		if (quantidadeLados == 3) {
			System.out.println("Voce informou um triângulo, vamos calcular a area");
			System.out.println("-------------------------------------------------");
			System.out.println("Digite a medida da base");
			base = ler.nextInt();
			System.out.println("Digite a medida da altura");
			altura = ler.nextInt();
			System.out.println(((base * altura) / 2) + "cm");
		} else if (quantidadeLados == 4) {
			System.out.println("Você informou um quadrado, vamos calcular a area");
			System.out.println("-------------------------------------------------");
			System.out.println("Digite a medida da base");
			base = ler.nextInt();
			System.out.println("Digite a medida da altura");
			altura = ler.nextInt();
			System.out.println((base * altura) + " cm");
		} else if (quantidadeLados == 5) {
			System.out.println("Voce informou um pentágono, vamos calcular a area");
			System.out.println("-------------------------------------------------");
			System.out.println("Digite a medida da base");
			base = ler.nextInt();
			System.out.println("Digite a medida da altura");
			altura = ler.nextInt();
			System.out.println(((base * altura) / 2) + " cm");
		} else if (quantidadeLados < 3) {
			System.out.println("Não é um poligono");
		} else {
			System.out.println("Poligono não identificado");
		}
		ler.close();	
	}
}