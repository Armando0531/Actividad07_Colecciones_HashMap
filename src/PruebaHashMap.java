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
}
public class PruebaHashMap {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String op="";
		int x=1;
		Map<String, Alumno> mapa=new HashMap<>();
		ListaAlumno map=new ListaAlumno();
		map.llenarMapa(x);
	}

}
