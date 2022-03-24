import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Comparator;

public class S1318 {
/*Exercici 8. Emplena un mapa LinkedHashMap amb claus de tipus String i objectes del tipus que prefereixi.
 Extregui les parelles, ordeni-les segons les claus (en ordre alfabètic) i
 torni a inserir-les en el mapa. Idea: Fes servir un ArrayList per realitzar l'ordenació amb la classe Comparator.  */
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> ciutatPoblacio = new LinkedHashMap<String, Integer>();
		ciutatPoblacio.put("zaragoza", 1800);
		ciutatPoblacio.put("madrid", 3000);
		ciutatPoblacio.put("barcelona", 1300);
		ciutatPoblacio.put("valencia", 800);
		
		ArrayList<String> ciutat = new ArrayList<String>();
		ArrayList<Integer> poblacio = new ArrayList<Integer>();
		for(Map.Entry<String, Integer> entry:ciutatPoblacio.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			ciutat.add(key);
			poblacio.add(value);
		}
		
		ciutatPoblacio = new LinkedHashMap<String, Integer>();
		String s;
		while(0<ciutat.size()) {
			int posicio = 0;
			s = ciutat.get(0);
				for(int e = 1; e<ciutat.size();e++) {
					if(ciutat.get(e).compareTo(s)<0){
						s = ciutat.get(e);
						posicio = e;
					}
				}
			ciutatPoblacio.put(ciutat.get(posicio), poblacio.get(posicio));
			ciutat.remove(posicio);
			poblacio.remove(posicio);
		}
			

		System.out.println(ciutatPoblacio);
	}

}
