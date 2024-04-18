package Sintaxis;

public class TiposVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables Primitivas -->Aquellas que sólo permiten almacenar un valor
		//Numéricas
		byte b1 = 1; // -128 , 127
		short s1 = 9;
		int i1=0 , i2=9,i3=5;
		//i1 = i2 + 1;
		long long1 = 234;
		//Numéricas con decimales
		float f1 = 9.4f;
		double d1 = 9.456778;
		
		char c1 = 'd';
		char c2 = '3';
		
		boolean condicion = true;
		
		//Variables Complejas --> Objetos
		String cadenaDeTexto = "Me encanta el curso de Java";
		int numeroCaracteres = cadenaDeTexto.length();
		//Obtener la posición que ocupa un determinado caracter
		int posicionEspacio = cadenaDeTexto.indexOf(' ');
		
		//Mostrar por Consola información:
		System.out.println("Numero de caracteres: " + numeroCaracteres);
		System.out.println("Posición primer espacio: " + posicionEspacio);
		
		
		
	}

}
