import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class S1315 {
/*Exercici 5. Crea i emplena un objecte List<Integer>. Crea i emplena un segon objecte List<Integer>
 * de la mateixa grandària que el primer. Utilitza sengles objectes ListIterator per a llegir els elements
 * de la primera llista i inserir-los en la segona en ordre invers (provi d'explorar
 * diverses formes diferents de resoldre aquest problema).*/
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		List<Integer> listb = new ArrayList<Integer>();
		listb.add(10);
		listb.add(20);
		listb.add(30);
		ListIterator<Integer> ita = lista.listIterator();
		ListIterator<Integer> itb = listb.listIterator();
		for(int i=0; i<lista.size();i++) {
			ita.next();
			itb.next();
		}
		for(int i=3;i>0;i--)
			itb.add(ita.previous());
		
		for(int i=0; i<listb.size();i++) 
			System.out.println(listb.get(i));
	}

}
