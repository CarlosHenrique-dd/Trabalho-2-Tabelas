package br.edu.univas.vo;

import java.util.ArrayList;

import br.edu.univas.tabs.Lotofacil;
import br.edu.univas.tabs.Mega;
import br.edu.univas.tabs.Quina;

public class NumberCheck {
	private static ArrayList<Mega> mega = new ArrayList<>();
	private static ArrayList<Quina> quina = new ArrayList<>();
	private static ArrayList<Lotofacil> loto = new ArrayList<>();
	
	
	
	public static void carrega() {
		mega = FileSave.MegaAr();
		quina = FileSave.quinaAr();
		loto = FileSave.lotoAr();}
	
	public static void verificaMega() {
		
		for(int i=0;i<mega.size();i++) {
			
			int[] numbers = mega.get(i).getLoto();
			
			
				
			
		}
	}
		
		
	

}
