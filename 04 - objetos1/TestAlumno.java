package objetos1;

public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarar una variable de Tipo Alumno
		Alumno a1 = new Alumno();
		Alumno a2 = new Alumno("12345688F",23);
		Alumno a3 = new Alumno("22222222F","Pedro","p@gmail.com",19,1);
		
		a1.dni = "12345678P";
		a1.edad = 20;
	//	a1.media = 9.4f;
		
		//Mostrar por pantalla los datos de un alumno:
		System.out.println(a1.dni + " " + a1.edad + " " + a1.media);
		System.out.println(a2.dni + " " + a2.edad + " " + a2.media);
		
		//Meter notas a los alumnos
		a1.guardarNota(8.6);
		a1.guardarNota(5.6);
		a2.guardarNota(7.4);
		a2.guardarNota(8.9);
		a3.guardarNota(9.6);
		if(a3.guardarNota(48.1)) {
			System.out.println("Nota guardada con éxito");
		}
		else {
			System.out.println("La nota no es correcta.");
		}
		
		System.out.println("La media de a1 es: " + a1.media);
		System.out.println("La media de a2 es: " + a2.media);
		System.out.println("La media de a3 es: " + a3.media);
		
		
	}

}
