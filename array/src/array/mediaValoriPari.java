package array;


/*Scrivere una classe Esercizio1 che contenga al suo interno un metodo main, nel quale si chiede
all'utente di inserire un vettore di numeri reali V e si calcoli la media degli elementi di valore
pari, stampandola sullo schermo.
 */
import java.util.Scanner;

public class mediaValoriPari {
public static void main(String[] args){
	double [] v;
	int cont = 0;
	int dim = 0;
	double sum=0;
	v = new double[dim];
	Scanner in =new Scanner(System.in);
	System.out.print("dim= ");
	dim=in.nextInt();
	for(int i =1; i<dim; i++){
		System.out.println("v["+i+"]=");
		v[i]=in.nextDouble();
		if(v[i]%2==0){
			sum+=v[i];
			cont++;
		}
	}
}
}
