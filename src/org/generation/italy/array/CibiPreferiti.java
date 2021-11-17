package org.generation.italy.array;

public class CibiPreferiti {
	
	public static void main(String[] ags) {
		
		String[] cibiPreferiti= {"risotto alla milanese","lasagna","frittelle ai fiori di zucca","polenta","carbonara","focaccia","alette di pollo"};
		
		int lunghezza=cibiPreferiti.length;
		
		System.out.println("La classifica ha "+lunghezza+" posizioni");
		System.out.println("Il mio cibo preferito è: "+cibiPreferiti[0]);
		System.out.println("Il cibo all'ultima posizione è: "+cibiPreferiti[lunghezza-1]);
		
		
			if (lunghezza % 2 == 0) {
				System.out.println("I cibi a metà classifica sono: \n"+(lunghezza/2)+"° posizione, "+cibiPreferiti[lunghezza/2-1]+"\n"+(lunghezza/2+1)+"° posizione, "+cibiPreferiti[lunghezza/2]);
			}else {
				System.out.println("Il cibo a metà classifica è: "+(lunghezza/2)+"° posizione, "+cibiPreferiti[lunghezza/2-1]);
			}
		
	}
}
