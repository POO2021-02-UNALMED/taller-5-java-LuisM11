package zooAnimales;
import java.util.Vector;

public class Anfibio extends Animal {
	private static Vector<Anfibio> listado = new Vector<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {listado.add(this);}
	public Anfibio(String n, int e, String h,  String g, String cp, boolean v) {
		super.nombre=n;
		super.edad=e;
		super.habitat=h;
		super.genero=g;
		this.colorPiel= cp;
		this.venenoso=v;
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	public String movimiento () {
		return "saltar";
	}
	public static Anfibio crearRana(String n, int e, String g) {
		ranas++;
		return new Anfibio(n,e,"selva",g,"rojo",true);
	}
	public static Anfibio crearSalamandra(String n, int e, String g) {
		salamandras++;
		return new Anfibio(n,e,"selva",g,"negro y amarillo",false);
	}
	public String getColorPiel() {
		return this.colorPiel;
	}
	public boolean isVenenoso() {
		return  this.venenoso;
	}
}
