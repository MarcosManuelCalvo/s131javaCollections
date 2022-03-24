import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class S1316 {
/*Exercici 6. Crea un objecte buit LinkedList<Integer>. Utilitzant un iterador ListIterator,
 * afegeixi valors sencers a la llista inserint-los sempre a la meitat d'aquesta.*/
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		ListIterator<Integer> it = list.listIterator();
		
		for(int i = 1;i<21;i++) {
			it.add(pideInt("Introdueix enter: "));
			if(i%2 == 0)
				it.previous();
		}

		for(int i=0; i<list.size();i++) 
			System.out.println(list.get(i));
	}
	public static int pideInt(String mensaje) {
		System.out.println(mensaje);
		Scanner sc  =  new Scanner(System.in);
		return sc.nextInt();
	}
}
