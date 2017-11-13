/**
 * 
 */
package br.com.projuris;

import java.math.BigDecimal;

/**
 * @author Fernando Correa de Medeiros
 * 
 * Classe CustoDepartamento Bean que setas os metodos e os seus atributos
 *
 */
public class CustoDepartamento {
	
	private String departamento;
	private BigDecimal custo;
	
	public CustoDepartamento(String departamento, BigDecimal custo) {
		this.setDepartamento(departamento);
		this.setCusto(custo);
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
	 * @return the custo
	 */
	public BigDecimal getCusto() {
		return custo;
	}
	
	/**
	 * @param custo the custo to set
	 */
	public void setCusto(BigDecimal custo) {
		this.custo = custo;
	}

}
