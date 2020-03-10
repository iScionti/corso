/*questo programma viene utilizzato dai CAF per la gestione
 * di diverse opzioni al cittadino (disoccupazione, calcolo irpef ed ecc..)
 */




import java.util.*;

public class CAF {

	public static void main(String[] args) {
		float isee; //intero per il modello ISEE
		char risposta;
		char risDis;
		Scanner input = new Scanner(System.in); //inizializzazione della input da tastiera.
		System.out.println ("selezionare una tipologia di assistenza:"); 
		//dopo questa riga ci sarà la parte in cui sarà possibile stampare a schermo il menu.
		System.out.println("1) Inoccupati;");
		System.out.println("2) Lavoratori con partita IVA;");
		System.out.println("3) Pensionati;");
		System.out.println("4) disoccupati.");
		risposta = input.next().trim().charAt(0); //legge un carattere dalla tastiera.
		
//---------------------------------------------------------------------------- RISPOSTA 1 ---------------------------------------
		
		if (risposta=='1'){ //scelta n.1 del programma e verifica la condizione dal risultato immesso prima
			System.out.println("Benvenuti, vediamo se il cliente può aderire al reddito di cittadinanza");
			System.out.print("Età del cliente..: ");
			int etaCitt= input.nextInt();  //legge l'eta dalla tastiera per poter verificare in seguilo la condizione per il reddito di cittadinanza
			System.out.println("Ora inserire il modello ISEE con il relativo importo... ");
			isee = input.nextInt(); 
			if (etaCitt >= 18 && etaCitt <=65 && isee <=9960){
				System.out.println("Il cliente può usfruire del reddito di cittadinanza");
			} else {
				System.out.println("Il cliente non ha rispettato i parametri per il reddito di cittadinanza");		
			}
		}		
//------------------------------------------------------------------------------- RISPOSTA 2 -----------------------------------
			
		if (risposta=='2'){ //scelta numero due con condizione
			System.out.println("Benvenuti, in questa opzione è possibile vedere quanto paga di irpef il possessore della partita iva.");
		
	    System.out.println("Immettere il totale guadagno annuo del titolare della partita IVA");
	    float fattura = input.nextInt();
	    
	    if (fattura < 15000.00){
	    	System.out.println("Il titolare della partita IVA deve pagare il 23%");
	    	fattura = fattura/100;
	    	fattura = fattura*23;
	    	System.out.println("La tassazione è..."+fattura+"€");
	    }
	    
	    if (fattura>=15000.01 && fattura < 28000.00){
	    	System.out.println("Il titolare della partita IVA deve pagare il 27%");
	    	fattura = fattura/100;
	    	fattura = fattura*27;
	    	System.out.println("La tassazione è..."+fattura+"€");
	    }
	    
	    if (fattura>=28000.00 && fattura < 55000.00){
	    	System.out.println("Il titolare della partita IVA deve pagare il 38%");
	    	fattura = fattura/100;
	    	fattura = fattura*38;
	    	System.out.println("La tassazione è..."+fattura+"€");
	    }
	    
	    if (fattura>=55000.00 && fattura < 75000.00){
	    	System.out.println("Il titolare della partita IVA deve pagare il 41%");
	    	fattura = fattura/100;
	    	fattura = fattura*41;
	    	System.out.println("La tassazione è..."+fattura+"€");
	    }
	    
	    if (fattura > 75000.00){
	    	System.out.println("Il titolare della partita IVA deve pagare il 43%");
	    	fattura = fattura/100;
	    	fattura = fattura*23;
	    	System.out.println("La tassazione è..."+fattura+"€");
	    }
	 }
		
		
		
//-------------------------------------------------------------------- RISPOSTA 3 ----------------------------------------------------
			
		if (risposta == '3'){
			System.out.println("Benvenuti nella pagina di controllo per la pensione.");
			System.out.println("Quanti anni ha il richiedente?");
			int etaPens = input.nextInt();
			System.out.println("Mettere l'età contributiva: ");
			int etaContr = input.nextInt();
			final byte quotacento = 100;
			if(etaPens+etaContr >= quotacento && etaPens >= 62){
				System.out.println("Il cliente può accedere alla pensione");
			} else {
				System.out.println("Il cliente non può accedere alla pensione"); 
			}
		}
		
//--------------------------------------------------------------------- RISPOSTA 4	-------------------------------------------------	

		if (risposta == '4'){
			System.out.println("Benvenuti nel portale inerente ai disoccupati");
			System.out.println("il disoccupato ultimamente non ha lavorato per almeno 2 anni?");
			risDis = input.next().trim().charAt(0);
			if(risDis=='y'){
				System.out.println("ok, il cliene può accedere al servizio Naspi. ");
			    System.out.println("il cliente quanto prendeva nelle precedenti buste paga?");
			    System.out.println("da far notare alla persona che aveva sempre guadagnato al di sotto dei 1200 euro, può accedere al 75% del suo vecchio stipendio...");
			    System.out.println("da 1200 euro in poi, può accedere al 100% del guadagno precedente.");
			    float bustaPaga = input.nextFloat();
			    
			    if (bustaPaga<=1199.99){
			     float Naspi= (bustaPaga*75);
			     Naspi=Naspi/100;
			     System.out.println("Il cliente avrà diritto al valore Naspi di... "+Naspi+" Euro al mese");
			    }else if(bustaPaga>=1200.00){
			     System.out.println("il cliente avrà accesso al 100% del suo vecchio stipendio."+" "+bustaPaga);
			    }
			    
			   }else if(risDis == 'n'){
			    System.out.println("il cliente non può avere accesso alla Naspi. ");
			   }
		}
		
		
		
	}

}
