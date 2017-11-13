/**
 * 
 */
package findChar;


/**
 * @author Fernando Correa de Medeiros
 * 
 * Esta classe contem a funcao que retorna o primeiro 
 * caracter de uma palavra que nao se repete nela, caso haja repeticoes em todos os caracteres, 
 * ela retorna o caracter vazio para fins de controle
 *
 */
public class MyFindCharachter implements FindCharachter {

	@Override
	public char findChar(String word) {
		
		word = word.trim();
		char[] charArray = word.toCharArray();
		char charValue = ' ';	 // se retornar este espaco eh porque ha caracteres repetidos em toda a string 
		int countRepeat = 0;
		
		for (int i = 0; i < charArray.length; i++) {
			
			for (int j = 0; j < charArray.length; j++) {			
				
				// Conta-se as repeticoes, para ser mais claro, ha uma repeticao quando a variavel countRepeat >= 2
				if (charArray[i] == charArray[j]) {
					countRepeat++;
				}
				
				// Neste caso encontrou mais de uma ocorrencia, ou seja, uma repeticao, posso descartar esta busca e ir para o proximo caracter
				if (countRepeat > 1) {
					countRepeat = 0;
					break;
				}
				
			}
			
			// Se na varredura interior nao encontrou repeticoes, posso parar a varredura externa pois encontramos a primeira ocorrrencia de caracter sem repeticao
			if (countRepeat == 1) {
				charValue = charArray[i];
				break;
			}
			
		}
		
		return charValue;
	}

}
