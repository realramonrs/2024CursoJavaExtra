package Sintaxis;

public class SentenciasSeleccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if else if
		//switch()
		// ? : : ;
		
		int valor = 10;
		String calificacion;
		if(valor < 5) {
			calificacion = "Suspenso";
		}
		else if(valor < 9) {
			calificacion = "Aprobado";
		}
		else if(valor <= 10) {
			calificacion = "Sobresaliente";
		}
		else {
			calificacion = "Error";
		}
		
		switch(calificacion) {
		case "Suspenso":
			System.out.println("Está suspenso, espabila!");
			break;
		case "Aprobado":
			System.out.println("Está aprobado, enhorabuena!");
			break;
		case "Sobresaliente":
			System.out.println("Sobresaliente, tiene derecho a beca");
			break;
		default:
			System.out.println("Error en la calificación");
			break;				
		}
		
		//Operador condicional  valor = condicion ? verdadero : falso;
		
		int n = 10;
		boolean positivo = n>0 ? true : false;
		
		String calif = n >= 5 ? "Aprobado" : "Suspenso";
	}

}
