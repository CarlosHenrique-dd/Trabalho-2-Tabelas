package br.edu.univas.vo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.tabs.Lotofacil;
import br.edu.univas.tabs.Mega;
import br.edu.univas.tabs.Quina;

public class FileSave {
	
	private static ArrayList<Mega>	arrMega = new ArrayList<>();
	private static ArrayList<Quina>	arrQuina = new ArrayList<>();
	private static ArrayList<Lotofacil>	arrLoto = new ArrayList<>();
	
	private static int countFile = 0;
	
	public static void FileName() {
		
			FileReader("mega.csv");
			
			FileReader("quina.csv");
			
			FileReader("lotofacil.csv");
			
	}
	
	public static void FileReader(String name) {
		File file = new File(name);
		String arquivo; 
		try {
			Scanner fileEntry = new Scanner(file);
			while(fileEntry.hasNext()) {
				
				arquivo = fileEntry.next();
				split(arquivo);
				}
			countFile++;
			fileEntry.close();
			
		} catch (FileNotFoundException e) {	e.printStackTrace();	}
	}
	
	
	public static void split(String linha) {
		String[] info = linha.split(",");
		int[] numbers = new int[15];
		int aux = 0;
		int jogo = 0;
		String data = "";
		
		for(int i=0;i<info.length;i++) {
			if(i == 0) {jogo = Integer.parseInt(info[i]);}
			if(i == 1) {data= info[i];}
			if(i != 0 && i != 1){numbers[aux] = Integer.parseInt(info[i]);aux++;}
		}
		SaveArray(jogo,data,numbers);
		
	}
	
	public static void SaveArray(int game, String date, int[] num) {
		
		if(countFile==0) {
			Mega mega = new Mega();
			
			mega.setJogo(game);
			mega.setData(date);
			mega.setLoto(num);
			
			arrMega.add(mega);
			}
		
		if(countFile==1) {
			Quina quina = new Quina();
			
			quina.setJogo(game);
			quina.setData(date);
			quina.setLoto(num);
			
			arrQuina.add(quina);
			}
		
		if(countFile==2) {
			Lotofacil loto = new Lotofacil();
			
			loto.setJogo(game);
			loto.setData(date);
			loto.setLoto(num);
			
			arrLoto.add(loto);
			}
	}
	
	public static ArrayList<Mega> MegaAr() {return arrMega;}
	
	public static ArrayList<Quina> quinaAr() {return arrQuina;}
	
	public static ArrayList<Lotofacil> lotoAr() {return arrLoto ;}
	
}
