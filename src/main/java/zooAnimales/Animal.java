package zooAnimales;
import gestion.Zona;

public class Animal {
	protected int totalAnimales=0;
	protected String nombre;
	protected int edad;
	protected String habitat;
	protected String genero;
	protected Zona zona;
	
	public Animal() {
		totalAnimales++;
	}
	public Animal(int t, String n,int e, String h, String g,Zona z) {
		this.totalAnimales=t;
		this.nombre=n;
		this.edad=e;
		this.habitat=h;
		this.genero=g;
		this.zona=z;
		totalAnimales++;
	}
	public Animal(String n, int e, String h, String g) {
		this(0,n,e,h,g,null);
		totalAnimales++;
	}
	public String movimiento() {
		return "desplazarse";
	}
	public static String totalPorTipo() {
		
		return "Mamiferos: " +Mamifero.cantidadMamiferos()+ "\n" + "Aves: " + Ave.cantidadAves()+ "\n" + "Reptiles: " + Reptil.cantidadReptiles()+ "\n" + "Peces: " + Pez.cantidadPeces() +"\n" + "Anfibios: "+ Anfibio.cantidadAnfibios() ;
		
	}
	public String toString() {
		
		return "Mi nombre es " + ", tengo una edad de "+ ", habito en "+ " y mi genero es "+ ", la zona en la que me ubico es "+", en el zoo ";
	}
	public String getNombre() {
		return this.nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public String getHabitat() {
		return this.habitat;
	}
	public String getGenero() {
		return this.genero;
	}
	
	
}
