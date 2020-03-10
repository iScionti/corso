/* Scrivere un programma TuttiPositiviPari che chiede all'utente di inserire
una seguenza di interi (chiedendo prima quanti numeri voglia inserire) e poi al 
dell'inserimento della squenza intera, stampa "tutti i positivi e pari" se i numeri inseriti
sono tutti positivi e pari, altrimenti stampa "NO". Risolvere l'esercizio senza usare l'array */


import java.util.Scanner;

public class class1 { //classe pubblica
	public static void main (String[] args){  //dichiarazione di metodo, il tipo di programma che si vuole adoperare (in questo caso è di tipo char/stringa
		
		Scanner input = new Scanner (System.in); //inserimento numeri
		System.out.println("Quanti numeri vuoi inserire?"); //quantità di numeri positivi
		int numeri = input.nextInt(); //inserimento numeri positivi
		
		boolean positivPari = true; 
		for (int i=0; i<numeri; i++){
			System.out.println("inserisci il prossimo numero");
			int n = input.nextInt();
			
			if (n>0 || n%2!=0) positivPari = false;
		}
		if (positivPari) System.out.println("tutti positivi e pari"); else System.out.println("NO");
	}
	
	
}