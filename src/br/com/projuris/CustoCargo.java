/**
 * 
 */
package br.com.projuris;

import java.math.BigDecimal;

/**
 * @author Fernando Correa de Medeiros
 * 
 * Classe CustoCargo Bean que setas os metodos e os seus atributos
 *
 */
public class CustoCargo {
	
	private String cargo;
	private BigDecimal custo;
	
	public CustoCargo(String cargo, BigDecimal custo) {
		this.setCargo(cargo);
		this.setCusto(custo);
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
