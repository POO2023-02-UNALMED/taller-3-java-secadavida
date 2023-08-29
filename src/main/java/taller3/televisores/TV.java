package taller3.televisores;

public class TV {
	private static int numTV;
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;

	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;

		numTV++;
	}

	public void canalUp() {
		this.setCanal(this.canal + 1);
	}

	public void canalDown() {
		this.setCanal(this.canal - 1);
	}

	public void volumenUp() {
		this.setVolumen(this.volumen + 1);
	}

	public void volumenDown() {
		this.setVolumen(this.volumen - 1);
	}

	public void turnOn() {
		this.estado = true;
	}

	public void turnOff() {
		this.estado = false;
	}

	public static int getNumTV() {
		return numTV;
	}

	public Marca getMarca() {
		return marca;
	}

	public int getCanal() {
		return canal;
	}

	public int getPrecio() {
		return precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public Control getControl() {
		return control;
	}

	public boolean getEstado() {
		return this.estado;
	}

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public void setCanal(int canal) {
		if (this.estado && canal >= 1 && canal <= 120)
		this.canal = canal;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setVolumen(int volumen) {
		if (this.estado && volumen >= 0 && volumen <= 7)
		this.volumen = volumen;
	}

	public void setControl(Control control) {
		this.control = control;
	}
}