package metodos;

import java.util.Scanner;

public class PruebaMatematicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Prueba método isPrimo
		int number;
		System.out.println("Introduzca un número");
		Scanner lector = new Scanner(System.in);
		number = lector.nextInt();
		
		if(Matematicos.isPrimo(number)) {
			System.out.println("Es primo");
			}
		else {
			System.out.println("No es primo");
		}
		
		//Prueba para rellenar matriz
		int[] matriz = new int[20];
		Matematicos.rellenarArray(matriz, 1, 11);
		//Calcular la media
		double media = Matematicos.calcularMedia(matriz);
		
		Matematicos.mostrarMatriz(matriz);
		
		
		int[] matriz2 = {6,4,8,9};
		Matematicos.mostrarMatriz(matriz2);
		
		//Prueba Sumar10
		int x = 20;
		Matematicos.sumar10(x);
		
		System.out.println("Valor= " + x);
		
		Matematicos.sumar10Array(matriz2);
		
		System.out.println("Matriz2[0]= " + matriz2[0]);
		
		
		
		
	}

}
