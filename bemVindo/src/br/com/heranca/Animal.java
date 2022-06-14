package br.com.heranca;

public class Animal  {
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

	double peso;
	String comida;
	
	void dormi() { 
		System.out.println("Dormiu");
	}
	
	void fazerBarulho() {
		System.out.println("fazer barulho");
		
	}
	
	}

