package LiandraJavaAngular;

import java.util.Scanner;

public final class ListaExercicioIfElse6 {
	 public static void main(String[] args) {
		 
		/*tendo como entrada a altura e o sexo (codificado da seguinte forma:
		 *1: feminino 2:masculino) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as
		 *seguintes formulas:
		 *para homens (72.7 * altura) -58
		 *para mulheres(62.1 * altura) -44.7
		 */
		 
		 Scanner ler = new Scanner (System.in);
		 
		 String feminino = "1";
		 String masculino = "2";
		 String genero;
		 double altura;
	
		 System.out.println("Digite o seu genero: ");
		 genero = ler.next();
		 
		 if (genero == feminino) {
			 System.out.println("digite sua altura: ");
			 altura = ler.nextDouble();
			 System.out.println((62.1 * altura) - 44.7);
		 } else {
			 System.out.println("Digite sua altura: ");
			 altura = ler.nextDouble();
			 System.out.println((72.7 * altura) - 58);
		 }
		 
		 ler.close();
	}
}
