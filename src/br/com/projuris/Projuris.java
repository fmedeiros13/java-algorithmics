/**
 * 
 */
package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Fernando Correa de Medeiros
 * 
 * Classe que contem o Main, este programa calcula o custo de uma empresa, por cargo e por departamento
 *
 */
public class Projuris {
	
	protected List<Funcionario> listaFuncionario = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Projuris projuris = new Projuris();
		
		projuris.readData();		
		projuris.calculaCustoCargo();
		projuris.calculaCustoDepartamento();
		projuris.clean();

	}
	
	/**
	 * @author Fernando Correa de Medeiros
	 * 
	 * Exemplo fornecido pela empresa DUO TECNOLOGIA para ajudar na implementacao deste programa
	 *
	 */
	private void readData() {
		
		Funcionario funcionario1 = new Funcionario("Assistente", "Administrativo", new BigDecimal(1000.0));
		Funcionario funcionario2 = new Funcionario("Gerente", "Administrativo", new BigDecimal(7000.70));
		Funcionario funcionario3 = new Funcionario("Diretor", "Administrativo", new BigDecimal(10000.45));
		Funcionario funcionario4 = new Funcionario("Assistente", "Financeiro", new BigDecimal(1300.9));
		Funcionario funcionario5 = new Funcionario("Gerente", "Financeiro", new BigDecimal(7500));
		Funcionario funcionario6 = new Funcionario("Diretor", "Financeiro", new BigDecimal(11000.0));
		Funcionario funcionario7 = new Funcionario("Estagiário", "Jurídico", new BigDecimal(700.4));
		Funcionario funcionario8 = new Funcionario("Assistente", "Jurídico", new BigDecimal(1800.90));
		Funcionario funcionario9 = new Funcionario("Gerente", "Jurídico", new BigDecimal(9500.50));
		Funcionario funcionario10 = new Funcionario("Diretor", "Jurídico", new BigDecimal(13000.0));
		
		listaFuncionario = new ArrayList<>();

		listaFuncionario.add(funcionario1);
		listaFuncionario.add(funcionario2);
		listaFuncionario.add(funcionario3);
		listaFuncionario.add(funcionario4);
		listaFuncionario.add(funcionario5);
		listaFuncionario.add(funcionario6);
		listaFuncionario.add(funcionario7);
		listaFuncionario.add(funcionario8);
		listaFuncionario.add(funcionario9);
		listaFuncionario.add(funcionario10);
				
	}
	
	/**
	 * @author Fernando Correa de Medeiros
	 * 
	 * Metodo que calcula o custo da empresa por cargos
	 *
	 */
	private void calculaCustoCargo() {
		
		Calculos totalCusto = new Calculos();		
		List<CustoCargo> custo = totalCusto.custoPorCargo(listaFuncionario);
		
		for (int i = 0; i < custo.size(); i++) {
			CustoCargo cc = (CustoCargo) custo.get(i);
			System.out.println("O custo total para o cargo de " + cc.getCargo() + " é de: " + cc.getCusto());
		}
		
		custo.clear();
		
		System.out.println("");
		
	}
	
	/**
	 * @author Fernando Correa de Medeiros
	 * 
	 * Metodo que calcula o custo da empresa por departamentos
	 *
	 */
	private void calculaCustoDepartamento() {
		
		Calculos totalCusto = new Calculos();		
		List<CustoDepartamento> custo = totalCusto.custoPorDepartamento(listaFuncionario);
		
		for (int i = 0; i < custo.size(); i++) {
			CustoDepartamento cd = (CustoDepartamento) custo.get(i);
			System.out.println("O custo total para o departamento " + cd.getDepartamento() + " é de: " + cd.getCusto());
		}
		
		custo.clear();
		
		System.out.println("");
		
	}
	
	/**
	 * @author Fernando Correa de Medeiros
	 * 
	 * Desaloca memoria.
	 *
	 */
	private void clean() {
			
		listaFuncionario.clear();
		
	}
	
}
