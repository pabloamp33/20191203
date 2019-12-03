package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio1 {

	/* 
	 * 4 puntos
	 * 
	 * Escribir en el método main un programa que pida por teclado un número decimal menor o igual
	 * que 3000 y muestre por pantalla el resultado de convertirlo a un número romanos.
	 *     
	 *     La conversión se realizará transformando individualmente cada dígito, empezando por el correspondiente
	 *     a las unidades de millar, seguido de las centenas, decenas y unidades de la forma siguiente:
	 *     
	 *     		Dígito decimal		|	Transformación
	 *     		--------------------|----------------------------------------------------------------------------
	 *     		1, 2 o 3			|	Escribir C1 de una a tres veces
	 *     		4					|	Escribir C1 seguido de C2
	 *     		5, 6, 7 o 8			|	Escribir una vez C2 seguido de C1 de cero a tres veces
	 *     		9					|	Escribir C1 seguido de C3
	 *     
	 *     donde C1, C2 y C3 son los caracteres de numeración romana que corresponda según la tabla siguiente:
	 *     
	 *     							|   C1   |   C2   |   C3   |
	 *     		--------------------|--------|--------|--------|        
	 *     		unidades			|	I    |   V    |   X    |
	 *     		decenas				|	X    |   L    |   C    |
	 *     		centenas			|	C    |   D    |   M    |
	 *     		unidades de millar	|	M    |        |        |
	 *     
	 *     Sólo se permite el uso de recursos del lenguaje Java vistos en las unidades 2 y 3.
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero=0,millar=0,centena=0,decena=0,unidad=0,digito=0,cociente=0; 
		String romano="";
		do {
			System.out.println("Introduzca un número menor o igual a 3000");
			numero=teclado.nextInt();
		} while (numero<0 || numero>3000);
		
		teclado.close();
		cociente=numero;
		while (cociente > 0 )
		{
			digito= cociente%10;
			cociente= cociente/10;
			if (cociente>99) {
				unidad=digito;
			} else {
				if (cociente>9) {
					decena=digito;
				} else {
					if (cociente>0) {
						centena=digito;
					} else {
						millar=digito;
					}
				}
			}
			
		}
		switch(millar) {
		  case 1:
			  romano=romano+"M";
			  break;
		  case 2:
			  romano=romano+"MM";
			  break;
		  case 3:
			  romano=romano+"MMM";
			  break;
		  default:
			  romano=romano+"";
			  break;
		 }
		
		switch(centena) {
		  case 1:
			  romano=romano+"C";
			  break;
		  case 2:
			  romano=romano+"CC";
			  break;
		  case 3:
			  romano=romano+"CCC";
			  break;
		  case 4:
			  romano=romano+"CD";
			  break;
		  case 5:
			  romano=romano+"D";
			  break;
		  case 6:
			  romano=romano+"DC";
			  break;
		  case 7:
			  romano=romano+"DCC";
			  break;
		  case 8:
			  romano=romano+"DCCC";
			  break;
		  case 9:	
			  romano=romano+"CM";
		      break;
		}
		
		switch(decena) {
		  case 1:
			  romano=romano+"X";
			  break;
		  case 2:
			  romano=romano+"XX";
			  break;
		  case 3:
			  romano=romano+"XXX";
			  break;
		  case 4:
			  romano=romano+"XL";
			  break;
		  case 5:
			  romano=romano+"L";
			  break;
		  case 6:
			  romano=romano+"LX";
			  break;
		  case 7:
			  romano=romano+"LXX";
			  break;
		  case 8:
			  romano=romano+"LXXX";
			  break;
		  case 9:	
			  romano=romano+"XC";
		      break;
		}
		
		switch(unidad) {
		  case 1:
			  romano=romano+"I";
			  break;
		  case 2:
			  romano=romano+"II";
			  break;
		  case 3:
			  romano=romano+"III";
			  break;
		  case 4:
			  romano=romano+"IV";
			  break;
		  case 5:
			  romano=romano+"V";
			  break;
		  case 6:
			  romano=romano+"VI";
			  break;
		  case 7:
			  romano=romano+"VII";
			  break;
		  case 8:
			  romano=romano+"VIII";
			  break;
		  case 9:	
			  romano=romano+"IX";
		      break;
		}
		  System.out.println("El número "+numero+" pasado a romanos es:"+romano );    
		
		
	}
	
}
