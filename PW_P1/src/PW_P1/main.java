package PW_P1;
import java.util.Scanner;
public class main {
	 public  static void main_(String[] args) {
		 
		 System.out.println("\nEsta son las opciones disponibles en nuestro menu de reservas:");
		 System.out.println("\nCrear kart: pulsa 0");
		 System.out.println("\nImprime info kart: pulsa 1");
		 System.out.println("\nCrear pista: 2");
		 System.out.println("\nImprime info pista: pulsa 3");
		 System.out.println("\nCrear usuario: pulsa 4");
		 System.out.println("\nImprime info usuario: pulsa 5");
		 System.out.println("\nImprime antiguedad usuario: pulsa 6");
		 System.out.println("\n");
		 System.out.println("\n");
		 System.out.println("\n");
		 System.out.println("\n");
		 System.out.println("\n");
		 System.out.println("\nSalir : pulsa 30");
		 
		 
		 try (Scanner leer = new Scanner(System.in)) {
			int opcion = leer.nextInt();
			 
			 switch (opcion) {
			case 0: {
				
				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		}
	}
}
