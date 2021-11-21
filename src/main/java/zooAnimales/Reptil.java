package zooAnimales;
import java.util.Vector;

public class Reptil extends Animal {
	private static Vector<Reptil> listado = new Vector<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {listado.add(this);}
	public Reptil(String n, int e, String h,  String g, String c, int lc) {
		super.nombre=n;
		super.edad=e;
		super.habitat=h;
		super.genero=g;
		this.colorEscamas= c;
		this.largoCola=lc;
		listado.add(this);
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	public String movimiento () {
		return "reptar";
	}
	public static Reptil crearIguana(String n, int e, String g) {
		iguanas++;
		return new Reptil(n,e,"humedal",g,"verde",3);
	}
	public static Reptil crearSerpiente(String n, int e, String g) {
		serpientes++;
		return new Reptil(n,e,"jungla",g,"blanco",1);
	}

	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public int getLargoCola() {
		return  this.largoCola;
	}
}
