
package odev_1;

import java.util.Scanner;
import java.lang.Math;

public class HipotenusHesaplama {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double a,b,c,a_kare,b_kare,c_kare;
		System.out.println("birinci dik kenar uzunlu�unu giriniz :");
		
		 a = input.nextDouble();
		 
		 System.out.println("ikinci dik kenar uzunlu�unu giriniz :");
		 
		 b = input.nextDouble();
		 
		 a_kare=a*a;//c=Math.sqrt((a*a)+(b*b))
		 b_kare=b*b;
		 c_kare=a_kare+b_kare;
				 
		 c=Math.sqrt(c_kare);

		 
		 System.out.println("hipoten�s uzunlu�u :" +c);


	}

}
