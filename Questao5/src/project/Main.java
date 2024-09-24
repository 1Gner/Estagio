package project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		String palavra = scanner.nextLine();
		char [] word = new char[palavra.length()];
		int posicao = 0;
		for(int i =palavra.length() -1 ; i>= 0 ; i--) {
			word[posicao] = palavra.charAt(i);
			posicao++;	
		}
		
		palavra = new String(word);
		
		System.out.println(palavra);
	}

}
