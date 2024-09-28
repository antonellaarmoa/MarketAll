package impl;
import java.util.ArrayList;

public class Administrador {
	private ArrayList <Datos> lista;
	
	public Administrador() {
		lista = new ArrayList<Datos>();
	}
	
	
	public void agregarP(Datos p) {
		lista.add(p);
	}
	
	
	public ArrayList<Datos> getLista(){
		return lista;
	}

	}
	