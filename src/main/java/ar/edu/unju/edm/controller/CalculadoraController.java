package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ar.edu.unju.edm.model.Calculadora;
@Controller
public class CalculadoraController {
	@GetMapping("/menu")
	public String mostrarMenuCalculadora() {
		return "index";
	}
	@GetMapping("/calculoSuma")
	public String getSumaPage(@RequestParam(name = "n1")int n1, @RequestParam(name = "n2")int n2) {
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.sentN1(n1);
		nuevaCalculadora.sentN2(n2);
		nuevaCalculadora.sumaNumero();
		return "resultado";
		
	}
	
}