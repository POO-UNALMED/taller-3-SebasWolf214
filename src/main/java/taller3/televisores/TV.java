package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	Control control;
	private static int numTV;
	
	public TV(Marca mar, boolean est){
		marca = mar;
		estado =est;
		setNumTV(getNumTV() + 1);
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public Control getControl() {
		return control;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if(estado==true) {
			if(canal<=120 && canal>=1) {
				this.canal = canal;
			}
		}
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		if(this.estado==true) {
			this.volumen = volumen;
		}
	}
	
	
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if(estado==true) {
			if(canal<=120 && canal>=1) {
				canal++;
			}
		}
		
	}
	public void canalDown() {
		if(estado==true) {
			if(canal<=120 && canal>=1) {
				canal--;
			}
		}
		
	}
	
	
	public void volumenUp() {
		if(this.estado==true) {
			if(this.volumen<=7 && this.volumen>=0) {
				this.volumen++;
			}
		}
		else {
			
		}
		
	}
	public void volumenDown() {
		if(this.estado==true) {
			if(this.volumen<=7 && this.volumen>=0) {
				this.volumen--;
			}
		}
		else {
			
		}
	}
	
	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}

	
	
	
}
