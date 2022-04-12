package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;
@Component
public class Calculadora {
	private int n1;
	private int n2;
	
	public Calculadora() {
		//TODO auto-generated constructor stub
	}
	public int getN1() {
		return n1;
	}
	public void sentN1(int n1) {
		this.n1 =n1;
	}
	public int getN2() {
		return n2;
	}
	public void sentN2(int n2) {
		this.n2 =n2;
	}
	public int sumaNumero() {
		return n1+n2;
	}
	
}
