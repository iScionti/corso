package codiceabarre;

public class lettura_codice { //questa classe
	String codice; //creazione della variabile in cui si può immettere il codice.
	
	public lettura_codice(String codice){ //costruttore che verrà poi richiamato successivamente, dice solamente che da ora in poi verà utilizzato la stessa variabile della classe.
		this.codice=codice; //si riferisce alla variabile "codice" della all'interno della classe.
	}
	
	public String Tipo_Prodotto(){ //questa classe, prima seleziona la prima stringa numerica del codice (che va dal carattere n.0 fino al carattere n.2) e poi cerca di convertirlo in una stringa.
		String tp=""; //istanza una stringa vuota per poter essere sovrascritta.
		String tipo_prodotto=codice.substring(0,2); //seleziona il pezzo di codice che va dal carattere 0 al carattere 2 
		if (tipo_prodotto.equals("01")) tp = "Alimenti di base"; //l'equals è un metodo di confronto dele stringhe, se la prima parte della stringa è uguale a 01, allora quel codice corrisponde alla categoria "alimenti di base"
		if(tipo_prodotto.equals("02")) tp ="Altri alimenti";//in questo caso la stessa cosa della riga sopra, solamente che l'iniziale di questo codice è 02, e quindi corrisponde alla categoria "altri alimenti"
		if(tipo_prodotto.equals("03")) tp ="Altri prodotti"; //stessa cosa nelle due righe precedenti, solamente che lo "03" riguarda gli altri prodotti del supermercato.
		return tp; //ritornami un valore 
	}
	
	
	
	public String Nome_Prodotto(){ //dal secondo, al quinto carattere troviamo invece il metodo che distingue ogni codice a barre per nome, e convertirlo.
		String np =""; 
		String nome_prodotto=codice.substring(2,5); //seleziona dal carattere 2, al carattere 5.
		if(nome_prodotto.equals("001")){ //se la seconda parte del codice è "001", il np (nome prodotto) è "pane"
			np ="pane";
			System.out.println(np);
		}
		
		if(nome_prodotto.equals("002")){ 
			np="formaggio";
			System.out.println("formaggio");
		}
		
		if(nome_prodotto.equals("020")){
			np="dentifricio";
			System.out.println(np);
		}
		
		return np;
		}
		
	
	
	
	
	public int ivaprodotto(){ //una parte del codice a barre che mostra l'iva.
		int iva=0;
		iva =Integer.parseInt(codice.substring(5,7)); //la parte in cui è interessata l'iva
		return iva; //ritornami nel metodo, il valore di IVA
	}
		
	
	public double prezzo_Prodotto() { //estrae il prezzo del prodotto dalle ultime cinque caratteri della stringa numerica.
		String testoprezzo="";
		testoprezzo=codice.substring(7,12);
		double prezzoProdotto = (Double.parseDouble(testoprezzo)/100); //converte il valore in un valore decimale
		return prezzoProdotto; //ritornami il prezzo da questo metodo.
	}


	
}
