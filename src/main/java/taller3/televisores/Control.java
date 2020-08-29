package taller3.televisores;

public class Control {
	private TV tv;
	
	
	

	public TV getTv() {
		return tv;
	}


	public void setTv(TV tv) {
		this.tv = tv;
	}


	public void enlazar(TV tv) {
		this.setTv(tv);
		this.getTv().setControl(this);
	}
	
	
	public void turnOn() {
		this.getTv().turnOn();
	}
	public void turnOff() {
		this.getTv().turnOff();;
	}
	public void canalUp() {
		this.getTv().canalUp();
	}
	public void canalDown() {
		this.getTv().canalDown();
	}
	public void volumenUp() {
		if(this.getTv().getEstado()==true) {
			this.getTv().volumenUp();
		}	
	}
	public void volumenDown() {
		if(this.getTv().getEstado()==true) {
			this.getTv().volumenDown();
		}
		
	}
	public void setCanal(int canal) {
		this.getTv().setCanal(canal);
	}
	
	
	
	
	
}
