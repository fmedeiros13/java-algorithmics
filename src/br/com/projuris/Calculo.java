/**
 * 
 */
package br.com.projuris;

import java.util.List;

/**
 * @author Fernando Correa de Medeiros
 * 
 * @see br.com.projuris.Calculos
 *
 */
public interface Calculo {
	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios);
	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios);
}
