package zooAnimales;
import java.util.*;

public class Mamifero extends Animal {
	private Vector<Mamifero> listado = new Vector<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero () {
		listado.add(this);
	}
	public Mamifero( String n, int e, String h, String g, boolean pe, int pa ) {
		super.nombre=n;
		super.edad=e;
		super.habitat=h;
		super.genero=g;
		this.pelaje=pe;
		this.patas=pa;
		listado.add(this);
	}
	public int cantidadMamiferos() {
		return listado.size();
	}
	public static Mamifero crearCaballo(String n, int e, String g ) {
		caballos++;
		return new Mamifero(n,e,"pradera",g,true,4);
		
	}
	public static Mamifero crearLeon(String n, int e, String g ) {
		leones++;
		return new Mamifero(n,e,"selva",g,true,4) ;
	}
	
	public boolean isPelaje() {
		return this.pelaje;
	}
	public int getPatas() {
		return  this.patas;
	}
}
