package zooAnimales;
import java.util.Vector;

public class Pez extends Animal {
	private Vector<Pez> listado = new Vector<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {listado.add(this);}
	public Pez(String n, int e, String h,  String g, String ce, int ca) {
		super.nombre=n;
		super.edad=e;
		super.habitat=h;
		super.genero=g;
		this.colorEscamas= ce;
		this.cantidadAletas=ca;
		listado.add(this);
	}
	
	public int cantidadPeces() {
		return listado.size();
	}
	public String movimiento () {
		return "nadar";
	}
	public static Pez crearSalmon(String n, int e, String g) {
		salmones++;
		return new Pez(n,e,"oceano",g,"rojo",6);
	}
	public static Pez crearBacalao(String n, int e, String g) {
		bacalaos++;
		return new Pez(n,e,"oceano",g,"gris",6);
	}
	public String getEscamas() {
		return this.colorEscamas;
	}
	public int getCantidadAletas() {
		return  this.cantidadAletas;
	}
}
