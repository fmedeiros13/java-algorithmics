/**
 * 
 */
package findarray2;

/**
 * @author Fernando Correa de Medeiros
 *
 * Esta classe contem a funcao que implementa uma busca de um sub array em um array
 * retornando o indice do array da ultima ocorrencia deste sub array no array ou -1 caso nao tenha ocorrencias
 */
public class MyFindArray implements FindArray {

	@Override
	public int findArray(int[] array, int[] subArray) {
		
		int indexSeek = -1;
		int sizeArray = array.length;
		int sizeSubArray = subArray.length;
		int cont = 0; //Variavel para contar a ocorrencia entre numeros iguais do sub array e do array
		boolean finish = false;
		
		if (sizeSubArray <= sizeArray) {
			
			// O laco externo foi criado para comecar a busca de tras para frente, 
			// ja que vale apenas a ultima ocorrencia em caso de repeticoes, melhor performance
			for (int i = sizeArray-1; i >= 0; i--) {
				
				int auxI = i; // variavel auxiliar para reiniciar o indice do array mais externo, caso precise refazer a busca
				for (int j = sizeSubArray-1; j >= 0; j--) {
					
					// Se encontrar uma ocorrencia de igualdade entre os arrays
					if (subArray[j] == array[i]) {
						cont++; // inicializa o contador da ocorrencia
						indexSeek = i; // guarda o indice
						i--; 
						
						// Se encontrou a primeira ocorrencia (como esta de tras para frente, no nosso caso, sera
						// a ultima ocorrencia) da sub array na array, encerra-se a busca
						if (cont == sizeSubArray) {
							finish = true; // flag usada para encerrar a busca
							break;
						}
						
					} else {
						
						// neste caso nao encontrou ocorrencia, deve-se reiniciar as variaveis com os
						// valores corretos para uma nova busca da sub array no que sobrou da array
						cont = 0;
						j = sizeSubArray-1;
						i = auxI;
						indexSeek = -1;
						break;							
						
					}
					
				}
				
				// flag usada para encerrar a busca
				if (finish)
					break;
					
			}
			
		}
		
		return indexSeek;
	}

}
