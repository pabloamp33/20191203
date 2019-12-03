package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio3 {

	/* 3 puntos
	 * 
	 * Decimos que un número entero positivo es guay si puede obtenerse como suma de dos o más números
	 * enteros consecutivos. Por ejemplo, 3 (=1+2), 5 (=2+3), 6(=1+2+3), son números guays.
	 * 
	 * Escribir en el método main un programa que lea un número entero positivo e indique si éste es guay.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero=0, i,j,suma=0;
		boolean esguay=false;
		do {
			System.out.println("Introduzca un número entero positivo");
			numero=teclado.nextInt();
		} while (numero<0);
		teclado.close();
		i=1;
		while (i<(numero/2)+1) {
			suma=i;
			j=i;
			while (suma<numero) {
				j++;
				suma=suma+j;
			}
			if (suma==numero) {
				esguay=true;
				i=numero;
			} else {
				i++;
			}
		}
		if (esguay) {
			System.out.println("El número "+numero+" es guay");
		} else {
			System.out.println("El número "+numero+" no es guay");

		}
				
	}

}
