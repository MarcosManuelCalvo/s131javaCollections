import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Iterator;

public class S1314 {
/*Exercici 4. Escriu un ḿetode que utilitzi un iterador per a recórrer una col·lecció
 * genèrica passada per argument i imprimeixi tots els seus objectes (fent servir el mètode toString()).
 * Empleni tots els diferents tipus de Java Collections (ArrayList, LinkedList, HashSet, LinkedHashSet i TreeSet),
 * amb una sèrie d'objectes i apliqui el mètode dissenyat a cada Contenidor.*/
	public static void main(String[] args) {
		ArrayList<String> listaA = new ArrayList<String>();
		listaA.add("Kate Winslet");
		listaA.add("Leonardo DiCaprio");
		listaA.add("Bill Zane");
		iteradorPrint(listaA);
		LinkedList<String> listaL = new LinkedList<String>();
		listaL.add("Enero");
		listaL.add("febrero");
		listaL.add("marzo");
		iteradorPrint(listaL);
		HashSet<String> listaS= new HashSet<String>();
		listaS.add("1");
		listaS.add("2");
		listaS.add("3");
		iteradorPrint(listaS);
		LinkedHashSet<String> listaH= new LinkedHashSet<String>();
		listaH.add("2000");
		listaH.add("2002");
		listaH.add("2020");
		iteradorPrint(listaH);
		TreeSet<String> listaT= new TreeSet<String>();
		listaT.add("Kate");
		listaT.add("Leonardo");
		listaT.add("Bill");
		iteradorPrint(listaT);
		
	}
	
	public static void iteradorPrint(ArrayList<String> list) {
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			  System.out.println(it.next().toString());
		}
	}
	
	public static void iteradorPrint(LinkedList<String> list) {
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			  System.out.println(it.next().toString());
		}
	}
	
	public static void iteradorPrint(HashSet<String> list) {
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			  System.out.println(it.next().toString());
		}
	}
	
	public static void iteradorPrint(LinkedHashSet<String> list) {
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			  System.out.println(it.next().toString());
		}
	}
	
	public static void iteradorPrint(TreeSet<String> list) {
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			  System.out.println(it.next().toString());
		}
	}

}
