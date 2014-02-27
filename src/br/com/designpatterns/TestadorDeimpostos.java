package br.com.designpatterns;

public class TestadorDeimpostos {

	public static void main(String[] args) {
		Imposto icms =  new ICMS();
		Imposto iss =  new ISS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calculadora = new CalculadorDeImpostos();
		
		calculadora.realizaCalculo(orcamento, icms);
		calculadora.realizaCalculo(orcamento, iss);

	}

}
