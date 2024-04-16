package coleccionesDatos;
import java.util.*;

public class MatricesDinamicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Listas
		ArrayList<String> matriculas = new ArrayList<String>();
		
		//Añadir elementos:
		matriculas.add("0987-TYG");
		matriculas.add("4098-VGT");
		matriculas.add("1000-ZXR");
		matriculas.add("5908-KIT");
		
		//Obtener el número de elementos que hay en la lista: size,
		int elementos = matriculas.size();
		
		//Insertar elementos en medio o al inicio de la colección
		matriculas.add(0, "0987-QWE");
		
		//Recorrer una lista:
		System.out.println("Coches actualmente en el almacén:");
		for(String m : matriculas) {
			System.out.println(m);
		}
		
		//Eliminar elementos de una lista:
		matriculas.remove(1);
		
		//Eliminar todos los elementos
		matriculas.clear();
		
	}

}
