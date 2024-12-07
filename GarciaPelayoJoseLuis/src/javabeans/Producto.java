package javabeans;

public class Producto {
	long CódigoDeBarras;
	String descripcion;
	double precioUnitario;
	int cantidadStock;
	String talla;
	String color;
	
	public Producto() {
		super();
	}

	public Producto(long códigoDeBarras, String descripción, double precioUnitario, int cantidadStock, String talla,
			String color) {
		super();
		CódigoDeBarras = códigoDeBarras;
		this.descripcion = descripción;
		this.precioUnitario = precioUnitario;
		this.cantidadStock = cantidadStock;
		this.talla = talla;
		this.color = color;
	}

	public long getCódigoDeBarras() {
		return CódigoDeBarras;
	}

	public void setCódigoDeBarras(long códigoDeBarras) {
		CódigoDeBarras = códigoDeBarras;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripción) {
		this.descripcion = descripción;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
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
		return "Producto [CódigoDeBarras=" + CódigoDeBarras + ", descripción=" + descripcion + ", precioUnitario="
				+ precioUnitario + ", cantidadStock=" + cantidadStock + ", talla=" + talla + ", color=" + color + "]";
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
		case "S", "M", "L", "XL":
			return precioUnitario + precioUnitario * 0.03;
		case "XXL", "XXXL":
			return precioUnitario + precioUnitario * 0.04;
		}
		return precioUnitario;
	}
	
	
}
