import java.util.*;

public class Pila {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//crea una pila (generics <>) vuota
		Stack<Integer> pila = new Stack<Integer>();
		int num;
		Integer numObj;
		
		
		//aggiunge elementi alla pila
		for (int i=0; i <10; i++) {
			num = (int) (Math.random()*100);
			numObj = new Integer (num);
			System.out.println(numObj+" ");
			pila.push(numObj); //inserisce il numero nella istanza "pila"
		}
		
		System.out.println("\n Elementi nella pila: "+pila.size());
		
		while (!pila.empty()) { // mentre la pila è vuota...
			numObj = pila.pop();
			System.out.println(numObj + " ");
		}
		System.out.println();
	}

}
