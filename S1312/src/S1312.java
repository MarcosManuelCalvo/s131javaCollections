
import java.util.Scanner;
import java.util.HashSet;
	
public class S1312 {
/*Exercici 2. Asseguri's que si convertim el Contenidor
 * utilitzat en el punt anterior a un Contenidor HashSet,
 * aquest no permet duplicats. Verifica-ho.*/

	public static void main(String[] args) {
			HashSet<Month> any = new HashSet<Month>();
			int num = 3;
			for(int i = 0; i<num; i++) {
				Month mes = new Month(pideMes("Introduce mes: "));
				any.add(mes);
			}

			System.out.println(any);

			HashSet<String> any2 = new HashSet<String>();
			for(int i = 0; i<num; i++) {
				String mes = pideMes("Introduce mes: ");
				any2.add(mes);
			}
			System.out.println(any2);

			System.out.println("com verifica l'igualtat? a month li asigna un id que es diferent per a cada month i aixo fa que tots siguin direrents");
		}



	public static String pideMes(String mensaje) {
		Scanner sc  =  new Scanner(System.in);
		System.out.println(mensaje);
		return sc.nextLine();
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