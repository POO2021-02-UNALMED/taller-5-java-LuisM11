package gestion;
import java.util.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private Vector<Zona>zonas=new  Vector<Zona>(); 
	
	public Zoologico() {
	}
	public Zoologico(String n, String u,Zona[] z ) {
		this.nombre =n;
		this.ubicacion=u;
		Collections.addAll(this.zonas, z);
	}
	public Zoologico(String n, String u) {
		this(n,u,null);
	}
	public void agregarZonas (Zona z) {
		this.zonas.add(z);
	}
	public void agregarZonas (Zona[] z) {
		Collections.addAll(this.zonas, z);
		
	}
	public int cantidadTotalAnimales() {
		Iterator<Zona> i= zonas.iterator();
		int c=0;
		while (i.hasNext()) {
			c+=i.next().cantidadAnimales();
		}
		
		return c;
	}
	public Vector<Zona> getzonas(){
		return zonas;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getUbicacion() {
		return this.ubicacion;
	}

}
