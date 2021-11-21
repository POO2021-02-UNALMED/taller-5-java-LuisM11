package zooAnimales;
import java.util.*;

public class Mamifero extends Animal {
	private Vector<Mamifero> listado = new Vector<Mamifero>();
	private static int caballos;
	private static int leones;
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
	public Mamifero crearCaballo() {
		caballos++;
		return new Mamifero(null,0,"pradera",null,true,4);
		
	}
	public Mamifero crearLeon() {
		leones++;
		return new Mamifero(null,0,"selva",null,true,4) ;
	}
}
