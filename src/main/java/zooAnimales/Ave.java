package zooAnimales;
import java.util.*;

public class Ave extends Animal {
	private  Vector<Ave> listado = new Vector<Ave>();
	public static  int halcones;
	public  static int aguilas;
	private String colorPlumas;
	
	public Ave() {listado.add(this);}
	public Ave(String n, int e, String h,  String g, String c) {
		super.nombre=n;
		super.edad=e;
		super.habitat=h;
		super.genero=g;
		this.colorPlumas= c;
		listado.add(this);
	}
	public int cantidadAves() {
		return listado.size();
	}
	public String movimiento () {
		return "volar";
	}
	public static Ave crearHalcon(String n, int e, String g) { 
		halcones++;
		return new Ave(n,e,"montanas",g,"cafe glorioso");
	}
	public static Ave crearAguila(String n, int e, String g) {
		aguilas++;
		return new Ave(n,e,"montanas",g,"blanco y amarillo");
	}
	
	public String getColorPlumas() {
		return this.colorPlumas;
	}

}
