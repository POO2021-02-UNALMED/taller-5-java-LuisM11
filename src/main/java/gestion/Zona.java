package gestion;
import zooAnimales.Animal;

import java.util.Collections;
import java.util.Vector;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private Vector<Animal> animales= new Vector<Animal>() ; 
	
	public Zona() {
	}
	public Zona(String n, Zoologico z,Vector<Animal> a ) {
		this.nombre =n;
		this.zoo=z;
		this.animales=a;
		
	}
	public void agregarAnimales (Animal a) {
		this.animales.add(a);
	}
	public void agregarAnimales (Animal[] a) {
		Collections.addAll(this.animales, a);
	}
	public int cantidadAnimales() {
		return animales.size();
		
	}
	public String getNombre() {
		return this.nombre;
	}
	public Zoologico getZoo() {
		return this.zoo;
	}

	/*public static void main(String[] args ) {
		Zona z1= new Zona();
		Zona z2 = new Zona();
		z1.agregarAnimales(new Animal());
		z1.agregarAnimales(new Animal());
		z2.agregarAnimales(new Animal());
		z1.cantidadAnimales();
		z2.cantidadAnimales();
		Zoologico z = new Zoologico("sd","sds",new Zona[]{z2,z1});
		
		Zona z3=new Zona(); Zona z4 =new Zona(); Zona[] arr = {z4};
		Animal[] an = { new Animal(), new Animal()};
 		z.agregarZonas(arr);
 		z3.agregarAnimales(an);
		System.out.println(z.getzonas());
		
		
	}*/

}


