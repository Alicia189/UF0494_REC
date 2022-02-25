package modelo;

import java.util.Objects;

public class Parte {
	
	private String bastidor;
	private String marca;
	private String modelo;
	private float importe;
	private int a�o;
	
	
	
	
	@Override
	public String toString() {
		return "Parte [bastidor=" + bastidor + ", marca=" + marca + ", modelo=" + modelo + ", importe=" + importe
				+ ", a�o=" + a�o + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bastidor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parte other = (Parte) obj;
		return Objects.equals(bastidor, other.bastidor);
	}
	public Parte() {
		super();
	}
	public Parte(String bastidor, String marca, String modelo, float importe, int a�o) {
		super();
		this.bastidor = bastidor;
		this.marca = marca;
		this.modelo = modelo;
		this.importe = importe;
		this.a�o = a�o;
	}
	public String getBastidor() {
		return bastidor;
	}
	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	

}
