/**
 * 
 */
package br.com.projuris;

import java.math.BigDecimal;

/**
 * @author Fernando Correa de Medeiros
 *
 */
public class Funcionario {
	private String cargo;
	private String departamento;
	private BigDecimal salario;
	
	public Funcionario(String cargo, String departamento, BigDecimal salario) {
		this.setCargo(cargo);
		this.setDepartamento(departamento);
		this.setSalario(salario);
	}

	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	/**
	 * @return the salario
	 */
	public BigDecimal getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}	
	
}
