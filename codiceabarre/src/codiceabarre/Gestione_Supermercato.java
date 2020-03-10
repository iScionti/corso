package codiceabarre;

import java.util.Scanner;

public class Gestione_Supermercato {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String codice;
		double quantità;
		double prezzo_totale=0;
		for (int indice =1; indice <= 3; indice++){ //tre possibilità di immissione
			System.out.println("inserire il codice del prodotto: ");
			codice=input.next(); //il codice inserito da tastiera, dalla quale sarà poi possibile effettuare altri controlli.
			System.out.println("Inserire la quantità della vendita: ");
			quantità=input.nextDouble(); //quantità del prodotto
			lettura_codice codici = new lettura_codice(codice); //oggetto che viene istanziato e dichiarato per fare i seguenti test
			System.out.println("Il tipo di articolo è: " +codici.Tipo_Prodotto()); //questa istruzione, chiama il metodo "tipo prodotti" della classe "lettura codice" ed effettua le istruzioni all'interno del metodo.
			System.out.println("L'articolo è: "+codici.Nome_Prodotto());
			System.out.println("L'iva é: "+ codici.prezzo_Prodotto()+" %");
			System.out.println("Il prezzo è: "+codici.prezzo_Prodotto());
			double prezzo_finale=((codici.prezzo_Prodotto()*codici.ivaprodotto()));
			prezzo_finale=prezzo_finale*quantità;
			System.out.println("Il totale prodotto è: "+prezzo_finale+"€");
			prezzo_totale=prezzo_totale+prezzo_finale;
		}
	System.out.println("Il totale acquistato è: "+prezzo_totale);
	}

}
