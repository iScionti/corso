package veicoli;

public class Autoveicolo extends Veicoli{
	byte NumeroPorte;
	
	public Autoveicolo (String targa, String marca, String mod, int numeroPosti, int i){
		super(targa, marca, mod, numeroPosti);
		this.NumeroPorte = NumeroPorte;
		
	}
	
	public byte getNumeroPorte(){
		return NumeroPorte;
	}

	public String toString(){
		return super.toString() + "Numero di porte: "+ NumeroPorte;
	}
	
}
