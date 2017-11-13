/**
 * 
 */
package findarray2;

/**
 * @author Fernando Correa de Medeiros
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyFindArray myFindArray = new MyFindArray();
		testesBuscaArrays(myFindArray);

	}
	
	/**
	 * @author Fernando Correa de Medeiros
	 *
	 */
	private static void testesBuscaArrays(MyFindArray myFindArray) {
		
		// Exemplos sugeridos para os testes
		// para a dupla de arrays abaixo, o metodo deve retornar 2
		int[] array1 = {4, 9, 3, 7, 8};
		int[] subArray1 = {3, 7};
		
		// para a dupla de arrays abaixo, o metodo deve retornar 0
		int[] array2 = {1, 3, 5};
		int[] subArray2 = {1};
		
		// para a dupla de arrays abaixo, o metodo deve retornar -1
		int[] array3 = {7, 8, 9};
		int[] subArray3 = {8, 9, 10};
		
		// para a dupla de arrays abaixo, o metodo deve retornar 5
		int[] array4 = {4, 9, 3, 7, 8, 3, 7, 1};
		int[] subArray4 = {3, 7};
		
		Integer[] example = new Integer[4];
		example[0] = new Integer(myFindArray.findArray(array1, subArray1));
		example[1] = new Integer(myFindArray.findArray(array2, subArray2));
		example[2] = new Integer(myFindArray.findArray(array3, subArray3));
		example[3] = new Integer(myFindArray.findArray(array4, subArray4));
	
		for (int i = 0; i < 4; i++)
			System.out.println("O indice retornado para o exemplo " + (i+1) + " foi " + example[i]);
		
	}

}
