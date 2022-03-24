import java.util.Scanner;
import java.util.ArrayList;

public class S1311 {
/*Exercici 1. Crea una classe anomenada Month amb un atribut
 * "name" (que emmagatzemarà el nom del mes de l'any). Afegeix 11
 * objectes Month (cadascun amb el seu atribut diferent) en un Contenidor
 * ArrayList Java, a excepció de l'objecte amb atribut "Agost". Després,
 * efectuï la inserció en el lloc que correspon a aquest mes i
 * demostri que el Contenidor manté l'ordre correcte.*/
	public static void main(String[] args) {
		ArrayList<Month> any = new ArrayList<Month>();
		int num = 12;
		for(int i = 0; i<num; i++) {
			Month mes = new Month(pideMes("Introduce mes: "));
			intro(mes, any);
		}

		for(int i = 0; i<num; i++)
			System.out.println(any.get(i).getName());
	}

public static void intro(Month mes, ArrayList<Month> any) {
	int posicio =0;
	boolean trobat = false;
	while(posicio<any.size()&&!trobat) {
		if(monthToNumber(mes)> (monthToNumber(any.get(posicio)))){
			posicio++;
		}
		else {
			any.add(posicio, mes);
			trobat=true;
		}
	}
	if(!trobat)
		any.add(mes);
}

public static String pideMes(String mensaje) {
	Scanner sc  =  new Scanner(System.in);
	System.out.println(mensaje);
	return sc.nextLine();
}

public static int monthToNumber(Month mes) {
		int resultado = 0;
		switch(mes.getName()) {
		case "gener":
			resultado = 0;
			break;
		case "febrer":
			resultado = 1;
			break;
		case "març":
			resultado = 2;
			break;
		case "abril":
			resultado = 3;
			break;
		case "maig":
			resultado = 4;
			break;
		case "juny":
			resultado = 5;
			break;
		case "juliol":
			resultado = 6;
			break;
		case "agost":
			resultado = 7;
			break;
		case "setembre":
			resultado = 8;
			break;
		case "octubre":
			resultado = 9;
			break;
		case "novembre":
			resultado = 10;
			break;
		case "desembre":
			resultado = 11;
			break;
		default:
			System.out.print("Operació no suportada.");
		}
		return resultado;
	}

}

class Month{
	private String name;
	
	Month(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}