package veicoli;

public class Veicoli {
protected String targa, marca, modello;
protected int numeroPosti;
public Veicoli (String t, String m, String mod, int n){
	this.targa = t;
	this.marca=m;
	this.modello = mod;
	this.numeroPosti = n;
}

public String getTarga(){
	return targa;
}

public String getMarca(){
	return marca;
}

public String getModello(){
	return modello;
}

public int getNumeroPosti(){
	return numeroPosti;
}

public String toString(){
	return "Targa=" + targa + " marca= " + " modello= " + modello + " numero posti=" + numeroPosti;
}

}
