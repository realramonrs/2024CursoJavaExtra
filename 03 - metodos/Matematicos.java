package metodos;

import java.util.Random;

public class Matematicos {
	
	//Método que indica si un número es primo
	public static boolean isPrimo(int numero) {
		boolean primo = true;
		for(int i = 2;i<= numero/2;i++) {
			if(numero % i == 0) {
				primo =  false;
				break;
			}
		}
		
		return primo;
	}
	
	//Método que llena un array con numeros aleatorios de un rango
	public static void rellenarArray(int[] matriz,int inferior,int superior) {
		
		Random generador = new Random();
		
		for(int i = 0;i<matriz.length;i++) {
			matriz[i] = generador.nextInt(inferior,superior);
		}
	}
	
	//Método que calcule la media de un array
	public static double calcularMedia(int[] matriz) {
		
		int suma = 0;
		double media = 0;
		for(int valor : matriz) {
			suma = suma + valor;
		}
		media = suma/matriz.length;
		return media;
	}
	
	public static void mostrarMatriz(int[] matriz) {
		for(int valor : matriz) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
	
	public static void sumar10(int n) {
		n = n + 10;
	}
	
	public static void sumar10Array(int[] n) {
		n[0] += 10;
	}
	
	

}
