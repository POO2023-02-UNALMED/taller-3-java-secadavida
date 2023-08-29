package taller3.televisores;

public class Control {
    private TV tv;

	public void volumenUp() {
		this.tv.volumenUp();
	}

	public void volumenDown() {
		this.tv.volumenDown();
	}

	public void canalUp() {
		this.tv.canalUp();
	}

	public void canalDown() {
		this.tv.canalDown();
	}

	public void turnOn() {
		this.tv.turnOn();
	}

	public void turnOff() {
		this.tv.turnOff();
	}

	public void setCanal(int canal) {
		this.tv.setCanal(canal);
	}

	public void setVolumen(int volumen) {
		this.tv.setVolumen(volumen);
	}

	public void enlazar(TV tv) {
		this.tv = tv;
		this.tv.setControl(this);
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}

	public TV getTv() {
		return this.tv;
	}
}