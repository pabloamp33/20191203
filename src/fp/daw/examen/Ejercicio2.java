package fp.daw.examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	/*
	 * 3 puntos
	 * 
	 * Escribir en el método main un programa que lea del teclado dos números enteros y calcule
	 * la suma de todos los números impares comprendidos entre ellos, ambos incluidos.
	 * 
	 * El programa deberá calcular el resultado sin importar el orden en que se introduzcan los dos números
	 * (primero el mayor o primero el menor).
	 * 
	 * Si es posible, minimizar el número de iteraciones que se ejecutarán para obener el resultado.
	 * 
	 * No se permite el uso de la clase Scanner para leer del teclado.
	 * 
	 * Sólo se permite el uso de recursos del lenguaje Java vistos en las unidades 2 y 3.
	 */
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int numero1, numero2, temp, suma=0;
			System.out.print("Introduzca el primer número: ");
			numero1 = Integer.parseInt(in.readLine());
			System.out.print("Introduzca el primer número: ");
			numero2 = Integer.parseInt(in.readLine());
			if (numero1>numero2) {
				temp=numero1;
				numero1=numero2;
				numero2=temp;
			}
			for (int i = numero1; i <= numero2; i++) {
				if (i%2!=0) {
					suma=suma+i;
				}
			}
			System.out.println("La suma de los números impares entre "+numero1+" y "+numero2+" es: "+suma);
			
	}

}
