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
 * Metodo que implementa a interface Calculo, conforme pedia o enunciado do exercicio
 *
 */
public class Calculos implements Calculo {

	@Override
	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {
		
		List<CustoCargo> custoCargo = new ArrayList<>();
		
		BigDecimal custoAssist = new BigDecimal(0.0);
		BigDecimal custoEstag = new BigDecimal(0.0);
		BigDecimal custoGer = new BigDecimal(0.0);
		BigDecimal custoDir = new BigDecimal(0.0);
		
		for (int i = 0; i < funcionarios.size(); i++) {
			Funcionario func = (Funcionario) funcionarios.get(i);
			String cargo = func.getCargo();
			
			if (cargo.equalsIgnoreCase("ASSISTENTE"))
				custoAssist = custoAssist.add(func.getSalario());
			
			if (cargo.equalsIgnoreCase("ESTAGIÁRIO"))
				custoEstag = custoEstag.add(func.getSalario());
			
			if (cargo.equalsIgnoreCase("DIRETOR"))
				custoDir = custoDir.add(func.getSalario());
			
			if (cargo.equalsIgnoreCase("GERENTE"))
				custoGer = custoGer.add(func.getSalario());
			
		}
		
		custoCargo.add(new CustoCargo("Assistente", custoAssist));
		custoCargo.add(new CustoCargo("Estagiário", custoEstag));
		custoCargo.add(new CustoCargo("Gerente", custoGer));
		custoCargo.add(new CustoCargo("Diretor", custoDir));

		return custoCargo;
	}

	@Override
	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios) {
		
		List<CustoDepartamento> custoDepartamento = new ArrayList<>();
		
		BigDecimal custoAdmin = new BigDecimal(0.0);
		BigDecimal custoJurid = new BigDecimal(0.0);
		BigDecimal custoFinan = new BigDecimal(0.0);
		
		for (int i = 0; i < funcionarios.size(); i++) {
			Funcionario func = (Funcionario) funcionarios.get(i);
			String departamento = func.getDepartamento();
			
			if (departamento.equalsIgnoreCase("ADMINISTRATIVO"))
				custoAdmin = custoAdmin.add(func.getSalario());
			
			if (departamento.equalsIgnoreCase("JURÍDICO"))
				custoJurid = custoJurid.add(func.getSalario());
			
			if (departamento.equalsIgnoreCase("FINANCEIRO"))
				custoFinan = custoFinan.add(func.getSalario());
			
		}
		
		custoDepartamento.add(new CustoDepartamento("Administrativo", custoAdmin));
		custoDepartamento.add(new CustoDepartamento("Jurídico", custoJurid));
		custoDepartamento.add(new CustoDepartamento("Financeiro", custoFinan));
		
		return custoDepartamento;
	}

}
