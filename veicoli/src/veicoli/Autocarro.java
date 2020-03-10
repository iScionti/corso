package veicoli;
public class Autocarro extends Veicoli{
	private int Capacit‡Massima;
	
	public Autocarro (String targa, String marca, String Modello, int numeroPosti, int capacit‡Massima){
		super (targa, Modello, Modello, capacit‡Massima);
		this.Capacit‡Massima = Capacit‡Massima;
	}
	
	public int getCapacit‡Massima(){
		return Capacit‡Massima;
	}
	
	public String toString(){
		return super.toString() + "capacit‡ massima : "+ Capacit‡Massima;
	}
	
}
