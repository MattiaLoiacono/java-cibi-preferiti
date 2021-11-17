package org.generation.italy.array;

public class CibiPreferiti {
	
	public static void main(String[] ags) {
		
		String[] cibiPreferiti= {"risotto alla milanese","lasagna","frittelle ai fiori di zucca","polenta","carbonara","focaccia","alette di pollo"};
		
		int lungezza=cibiPreferiti.length;
		
		System.out.println("La classifica ha "+lungezza+" posizioni");
		System.out.println("Il mio cibo preferito è: "+cibiPreferiti[0]);
		System.out.println("Il cibo all'ultima posizione è: "+cibiPreferiti[lungezza-1]);
	}
}
