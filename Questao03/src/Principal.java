import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Dada uma string qualquer, desenvolva um algoritmo que encontre o n�mero de
		 * pares de substrings que s�o anagramas.
		 */

		// ABRINDO O SCANNER PARA RECEBER A PALAVRA A SER AVALIADA
		Scanner s = new Scanner(System.in);

		System.out.println("Digite uma palavra para saber a quantidade de pares de anagramas poss�veis:");
		String palavra = s.next();
		
		//armazenei o tamanho da palavra digitada em uma variavel inteira n
		int n =  palavra.length();
		
		//criei um vetor do tamanho da palavra e preenchi com todos os caracteres
		char vetorDeCaracteres[] = new char[n];
				for (int i = 0; i < n; i++) {
			vetorDeCaracteres[i] = palavra.charAt(i);
		}
				
		//criei e inicializei uma variavel para armazenar a quantidade de anagramas
		int qtdAnagrama = 0; 
		int letrasrepetidas = 0; 
				
		//verificando se existem caracteres iguais e contabilizando como um par de anagrama
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(vetorDeCaracteres[i] == vetorDeCaracteres[j]) {
					qtdAnagrama++;
					letrasrepetidas++;
				}
			}
		}
		
		/*A quantidade de pares de anagramas poss�veis dentro da palavra ter� sempre comprimento menor do que a palavra
		 * original. Pelo principio fundamental da contagem, anagramas s�o calculados usando fatorial e contando as
		 * letras repetida como uma s�. Como s�o pares, o n�mero fatorial ser� dividido por 2 e arrendondado para menos.
		*/
		int fat = 1;
		if (letrasrepetidas > 0) {
			int tamanhoAnagrama = n - letrasrepetidas;
			for (int i = tamanhoAnagrama; i > 1; i--) {
				fat = fat * i; 
			}
		}
		System.out.println("qtd de anagrama" + qtdAnagrama);
		qtdAnagrama += Math.floor(fat/2); 
		System.out.println("qtd de anagrama" + qtdAnagrama);
		
		
		//retornando a quantidade de anagramas no console
		if (letrasrepetidas > 0) {
			System.out.println("H� " + qtdAnagrama + " pares de anagramas na palavra digitada.");
		} else {
			System.out.println("N�o h� anagramas na palavra digitada.");
		}

	}

}
