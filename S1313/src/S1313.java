import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class S1313 {
/*Exercici 3. Crea una classe anomenada Generadora que retorni noms de personatges
 * (com String) de la seva pel·lícula favorita cada que vegada que invoqui al mètode 'seguentPersonatge()',
 * i que torni al principi de la llista de personatges una vegada que hagi acabat amb tots els noms.
 * Utilitzi aquest generador per a emplenar un ArrayList, un LinkedList, un HashSet, un LinkedHashSet
 * i un TreeSet, i després imprimeixi per pantalla cada contenidor. */
	public static void main(String[] args) {
		ArrayList<String> actors = new ArrayList<String>();
		actors.add("Kate Winslet");
		actors.add("Leonardo DiCaprio");
		actors.add("Bill Zane");
		Generadora gen = new Generadora("titanic", actors);
		
		ArrayList<String> listaA = new ArrayList<String>();
		LinkedList<String> listaL = new LinkedList<String>();
		HashSet<String> listaS= new HashSet<String>();
		LinkedHashSet<String> listaH= new LinkedHashSet<String>();
		TreeSet<String> listaT= new TreeSet<String>();
		
		replicar(gen, listaA);
		replicar(gen, listaL);
		replicar(gen, listaS);
		replicar(gen, listaH);
		replicar(gen, listaT);
		System.out.println(listaA);
		System.out.println(listaL);
		System.out.println(listaS);
		System.out.println(listaH);
		System.out.println(listaT);
		
		
	}
	
	static void replicar(Generadora gen, ArrayList<String> lista) {
		for(int i=0; i<gen.getActors().size(); i++) {
			lista.add(gen.seguentPersonatge());
		}
	}
	static void replicar(Generadora gen, LinkedList<String> lista) {
		for(int i=0; i<gen.getActors().size(); i++) {
			lista.add(gen.seguentPersonatge());
		}
	}
	static void replicar(Generadora gen, HashSet<String> lista) {
		for(int i=0; i<gen.getActors().size(); i++) {
			lista.add(gen.seguentPersonatge());
		}
	}
	static void replicar(Generadora gen, LinkedHashSet<String> lista) {
		for(int i=0; i<gen.getActors().size(); i++) {
			lista.add(gen.seguentPersonatge());
		}
	}
	static void replicar(Generadora gen, TreeSet<String> lista) {
		for(int i=0; i<gen.getActors().size(); i++) {
			lista.add(gen.seguentPersonatge());
		}
	}
}

class Generadora{
	private String pelicula;
	private ArrayList<String> actors;
	int pos;
	
	Generadora(String pelicula){
		this.pelicula = pelicula;
		pos = 0;
	}
	Generadora(String pelicula, ArrayList<String> actors){
		this.pelicula = pelicula;
		this.actors = actors;
		pos = 0;
	}
	
	public String getPelicula() {
		return pelicula;
	}
	
	public ArrayList<String> getActors() {
		return actors;
	}
	
	public String seguentPersonatge() {
		String nom = "0";
		if(actors.size()!=0) {
			nom = actors.get(pos);
			pos++;
			if(pos == actors.size())
				pos = 0;
		}
		return nom;
	}
}