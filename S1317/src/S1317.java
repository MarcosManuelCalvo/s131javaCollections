
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class S1317 {
/*Eexercici 7. Emplena un HashMap amb parelles clau-valor. Ordeni les parelles segons el codi hash
 * i imprimeixi el resultat (Idea: fer servir un TreeMap). Extregui les parelles ordenades i introdueixi-les en un mapa
 * LinkedHashMap (Idea: fer servir el seu constructor). Demostri que es manté l'ordre d'inserció.
 * Extregui només les claus ordenades i introdueixi-les primer en un HashSet i després en un LinkedHashSet. Es manté l'ordre?*/
	public static void main(String[] args) {
		HashMap<String, Integer> ciutatPoblacio = new HashMap<String, Integer>();
		ciutatPoblacio.put("zaragoza", 1800);
		ciutatPoblacio.put("madrid", 3000);
		ciutatPoblacio.put("barcelona", 1300);
		ciutatPoblacio.put("valencia", 800);
		System.out.println(ciutatPoblacio);
		TreeMap<String, Integer> ciutPob = new TreeMap<String, Integer>(ciutatPoblacio);
		System.out.println(ciutPob);
		LinkedHashMap<String, Integer> ciP = new LinkedHashMap<String, Integer>(ciutatPoblacio);
		System.out.println(ciP);
		System.out.println("Tree Map ho ordena, LinkedHashMap ho torna a l`ordre introduit");
		HashSet<String> cP = new HashSet<String>();
		cP.add("madrid");
		cP.add("barcelona");
		cP.add("valencia");
		cP.add("zaragoza");
		System.out.println(cP);
		LinkedHashSet<String> fi = new LinkedHashSet<String>(cP);
		fi.add("madrid");
		fi.add("valencia");
		fi.add("barcelona");
		fi.add("zaragoza");
		System.out.println(fi);
		System.out.println("no es manté");
		
		
		
	}

}
