/**
 * 
 */
package findChar;

/**
 * @author Fernando Correa de Medeiros
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyFindCharachter myFindChar = new MyFindCharachter();
		testesBuscaChars(myFindChar);

	}
	
	/**
	 * @author Fernando Correa de Medeiros
	 *
	 */
	private static void testesBuscaChars(MyFindCharachter myFindChar) {
		
		// Exemplos sugeridos para os testes
		String[] strings = new String[2];
		
		// para o exemplo abaixo, o metodo deve retornar o caracter 't'
		strings[0] = new String("stress");
		
		// para o exemplo abaixo, o metodo deve retornar o caracter 'm'
		strings[1] = new String("reembolsar");
				
		for (int i = 0; i < 2; i++) {
			char character = myFindChar.findChar(strings[i]);
			
			if (character == ' ')
				System.out.println("Existem repeticoes em todos os caracteres da palavra '" + strings[i] + "'.");
			else
				System.out.println("O caracter retornado para o exemplo " + (i+1) + " da palavra '" + strings[i] + "' foi: '" + character + "'.");
		}

	}

}
