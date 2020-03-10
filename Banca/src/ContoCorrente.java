import java.util.Scanner; // libreria per importare le istruzioni della lettura da tastiera


public class ContoCorrente {
	public static void main(String[] args) {
		float versamento, prelievo, saldoAt = 3000;
		byte tentativo = 1;
		String NomeUt, Password;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Buongiorno... inserire le credenziali di accesso");
		NomeUt = input.next();
		Password = input.next();
			for (tentativo = 1; tentativo < 3;){
				

		if(NomeUt.equals("Davi97") && Password.equals("sonopovero")){
			System.out.println("BENVENUTO!");
			int scelta = 0;
			
			while(scelta <= 3){
				System.out.println("Questo è il menu della banca, digitare i numeri a sinistra per una corretta navigazione.");
			    System.out.println("1. Versamento");
			    System.out.println("2. Prelievo");
			    System.out.println("3. Saldo disponibile");
			    System.out.println("PREMERE QUALSIASI PULSANTE PER TORNARE INDIETR0");
			    scelta = input.nextInt();
			    
			    
			    switch(scelta){
			    case 1:
			    	if(scelta == 1){
			    		System.out.println("BENVENUTI NELLA PAGINA PER FARE UN VERSAMENTO O PER AVERE UN SALDO INIZIALE");
			    		System.out.println("QUANTO VUOI VERSARE?");
			    		versamento = input.nextInt();
			    		saldoAt = saldoAt+versamento;
			    		System.out.println("HAI VERSATON "+versamento+"€ sul conto corrente");
			    	} 
			    	
			    case 2: 
			    	if(scelta == 2){
			    		System.out.println("BENVENUTI NELLA PAGINA DI PRELIEVO DAL CONTO, QUANTO VUOLE PRELEVARE?");
			    		prelievo=input.nextInt();
			    		saldoAt = saldoAt-prelievo;
			    		System.out.println("HAI SOTTRATTO "+prelievo+"€ dal conto corrente");
			    	}
			    case 3:
			    	if(scelta == 3){
			    		System.out.println("BENVENUTI, QUA POTETE SAPERE IL VOSTRO ATTUALE CONTO IN BANCA");
			    		System.out.println("TU HAI "+saldoAt+"€ SUL CONTO");
			    	}
			   		}
			    
			    
			
		}
	}
			else if (!"Davi97".equals(NomeUt) && !"sonopovero".equals(Password)){
		++tentativo;
		System.out.println("CREDENZIALI SBAGLIATE. "+ tentativo +" tentativi rimasti.");
		break;
		} 

		
if (tentativo==3){
			 System.out.println("ACCOUNT BLOCCATO, CONTATTARE L'ASSISTENZA.");
		 }
 	
}

}
}