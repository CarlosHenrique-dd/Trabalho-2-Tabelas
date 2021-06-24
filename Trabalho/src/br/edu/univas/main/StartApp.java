package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.FileSave;
import br.edu.univas.vo.NumberCheck;

public class StartApp {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int escolha = 0;
		
		FileSave.FileName();
		NumberCheck.carrega();
		do {
			MainMenu();
			
			escolha = ReadInteger();
			NumberCheck.verificaMega();
			if(escolha != 9) {
				SubMenu();
				ReadInteger();
				
				
			}
			
			
		}while(escolha != 9);
		
		sc.close();
	}
	
	private static int ReadInteger() {
		int value = sc.nextInt();
		sc.nextLine();
		return value;
	}
	
	private static void MainMenu() {	
		System.out.println("1. Mega-Sena \n"
				+ "2. Quina \n"
				+ "3. LotoFacil \n"
				+ "9. Sair");	}
	
	private static void SubMenu() {
		System.out.println("1. 5 Numeros que mais sairam. \n"
				+ "2. 5 Numeros que menos sairam. \n"
				+ "3. Gerar numeros randomicos. \n"
				+ "4. Verificar meu jogo. ");	}
	
	private static void escolheAquivo(int aux) {
		if(aux == 1) {}
		if(aux == 2) {}
		if(aux == 3) {}
	}
	
}
