package nombre;

import java.util.Scanner;

public class nombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Tu nombre es " + nombre);
		
		teclado. close();
		
	}

}
