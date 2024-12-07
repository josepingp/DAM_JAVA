package javabeans;

public class Producto {
	private int numeroProducto;
	private String descripcion;
	private double precioUnitario;
	private int cantidadStock;
	private String talla;
	private String color;
	
	public Producto() {
		super();
	}

	public Producto(int numeroProducto, String descripcion, double precioUnitario, int cantidadStock, String talla,
			String color) {
		super();
		this.numeroProducto = numeroProducto;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.cantidadStock = cantidadStock;
		this.talla = talla;
		this.color = color;
	}

	public int getNumeroProducto() {
		return numeroProducto;
	}

	public void setNumeroProducto(int numeroProducto) {
		this.numeroProducto = numeroProducto;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Producto [numeroProducto=" + numeroProducto + ", descripcion=" + descripcion + ", cantidadStock="
				+ cantidadStock + ", talla=" + talla + ", color=" + color + "]";
	}
	
	public double precioConIva(int iva) {
		return precioUnitario/100 * iva + precioUnitario;
	}
	
	public void aumentarStock(int cantidad) {
		cantidadStock += cantidad;
	}
	
	public boolean disminuirStock(int cantidad) {
		if (cantidadStock - cantidad < 0)
			return false;
		
		cantidadStock -= cantidad;
		return true;
	}
	
	public double precioAplicado() {
		switch (talla.toUpperCase()){
		case "XS": 
			return precioUnitario;
		case "S", "M", "L", "XL":
			return precioUnitario + precioUnitario * 0.03;
		case "XXL", "XXXL":
			return precioUnitario + precioUnitario * 0.04;
		default:
			throw new IllegalArgumentException("Unexpected value: " + talla.toUpperCase());
		}
	}
	
}
