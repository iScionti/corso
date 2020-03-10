package veicoli;
public class Autocarro extends Veicoli{
	private int CapacitÓMassima;
	
	public Autocarro (String targa, String marca, String Modello, int numeroPosti, int capacitÓMassima){
		super (targa, Modello, Modello, capacitÓMassima);
		this.CapacitÓMassima = CapacitÓMassima;
	}
	
	public int getCapacitÓMassima(){
		return CapacitÓMassima;
	}
	
	public String toString(){
		return super.toString() + "capacitÓ massima : "+ CapacitÓMassima;
	}
	
}
