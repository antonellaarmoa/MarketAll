package impl;

public class Datos{
	private String nombre;
	private int codigo;
	private int precio;
	private int StockTotal;
	private int StockMinimo;
	private String descripcion;
	
	public Datos(String n,int cod, int p, int st, int sm, String d) {
		nombre = n;
		codigo= cod;
		precio=p;
		StockTotal=st;
		StockMinimo=sm;
		descripcion=d;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio (int precio) {
		this.precio = precio;
	}
	public int getStockTotal() {
		return StockTotal;
	}
	
	public void setStockTotal (int StockTotal) {
		this.StockTotal = StockTotal;
	}
	public int getStockMinimo() {
		return StockMinimo;
	}
	
	public void setStockMinimo(int StockMinimo) {
		this.StockMinimo= StockMinimo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String Descripcion) {
		this.descripcion = Descripcion;
	}
	public String toString() {
		return nombre;
	}
	public String GetCod() {
		return Integer.toString(getCodigo());
	}
	
	public String GetP() {
		return Integer.toString(getPrecio());
	}
	public String GetST() {
		return Integer.toString(getStockTotal());
	}
	
	public String GetMin() {
		return Integer.toString(getStockMinimo());
	}

	
}
