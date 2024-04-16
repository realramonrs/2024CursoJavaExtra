package Sintaxis;

public class Conversiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Conversiones implícitas
		
		int i1 = 100;
		long long1 = i1;
		
		float f1 = 6.7f;
		double d1 = f1;
		
		//Conversiones explícitas
		int i2 = 25;
		short s2 = (short)i2;
		
		//Calcular la raíz de un número --> Math.sqrt(n)
		float raiz = (float) Math.sqrt(25);
		
		//Calcular la potencia 4ta de n
		int potencia4 = (int) Math.pow(3, 4);
		
		short s3 = 9, s4 = 50;
		short suma = (short) (s3 + s4);
		
		//Problemas de conversiones explícitas
		//Overflow --> El valor desborda la capacidad de la variable 
		short s5 = 30000 , s6 = 30000;
		short suma2 = (short) (s5 + s6);
		System.out.println("Suma2 = " + suma2);
		
		//Pérdida de precisión
		
		int n1 = 5 , n2 = 9;
		float division = (float)n1/n2;
		
		System.out.println("n1/n2 = " + division);
		
		
		//Conversiones entre variables numéricas y String
		//Pasar de int a String ***********************//
		int dni = 37654312;
		String dni2 = Integer.toString(dni);
					
		if(dni2.startsWith("36")) {
			System.out.println("Empieza por 36");
		}
		
		int n = 45678;
		String nTexto = Integer.toString(n);
		int digitos = nTexto.length();
		//**********************************************//
		
		//Pasar de String a int
		String dni3 = "12345678";
		int dni3Numero = Integer.parseInt(dni3);
		
	}
	
	

}
