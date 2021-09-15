import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;

class Alumno{
	private String nombre;
	private int edad;
	private String carrera;
	private String fechaInscripcion;
	
	public Alumno(String nombre, int edad, String carrera, String fechaInscripcion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.carrera = carrera;
		this.fechaInscripcion = fechaInscripcion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(String fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + ", fechaInscripcion="
				+ fechaInscripcion + "]";
	}
	
	
}
class ListaAlumno{
	Map<Integer, Alumno> mapa=new HashMap<>();
	Scanner entrada=new Scanner(System.in);
	
	public void llenarMapa(int num) {
		System.out.println("Ingresa los siguientes datos:");
		System.out.println("Nombre del alumno");
		String nom=entrada.nextLine();
		System.out.println("Edad del alumno");
		int edad=entrada.nextInt();
		entrada.nextLine();
		System.out.println("Carrea del alumno:");
		String carrera=entrada.nextLine().toUpperCase().replace(" ","");
		System.out.println("Fecha de inscripcion en formato dd/mm/aaaa");
		String fecha=entrada.nextLine();
		Alumno alumno=new Alumno(nom, edad, carrera, fecha);
		
		mapa.put(num,alumno);
	}
	public void mostrarAlumnosCarrera(int op) {
		String carrera = null;
		if(op==1) {carrera="ISC";
		}else if(op==2) {
			carrera="IIA";
		}else if(op==3) {
			carrera="IM";
		}else if(op==4) {
			carrera="LA";
		}else if(op==5) {
			carrera="CP";
		}
		System.out.println("Lista de alumnos que se inscribieron a la carrera "+carrera);
		for (Entry<Integer, Alumno> alum : mapa.entrySet()) {
			if(alum.getValue().getCarrera().equalsIgnoreCase("ISC") && op==1) {
				System.out.println(alum.getValue().getNombre());
			}else if(alum.getValue().getCarrera().equalsIgnoreCase("IIA") &&op==2) {
				System.out.println(alum.getValue().getNombre());
			}else if(alum.getValue().getCarrera().equalsIgnoreCase("IM") &&op==3) {
				System.out.println(alum.getValue().getNombre());
			}else if(alum.getValue().getCarrera().equalsIgnoreCase("LA") &&op==4) {
				System.out.println(alum.getValue().getNombre());
			}else if(alum.getValue().getCarrera().equalsIgnoreCase("CP") &&op==5) {
				System.out.println(alum.getValue().getNombre());
			}
		}
	}
}
public class PruebaHashMap {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String op="";
		int x=1;
		Map<String, Alumno> mapa=new HashMap<>();
		ListaAlumno map=new ListaAlumno();
		map.llenarMapa(x);
		int op2=0;
		System.out.println("Cual carrera quieres mostrar:");
		System.out.println("1) ISC");
		System.out.println("2) IIA");
		System.out.println("3) IM");
		System.out.println("4) LA");
		System.out.println("5) CP");
		op2=entrada.nextInt();
		map.mostrarAlumnosCarrera(op2);
		entrada.nextLine();
	}

}
