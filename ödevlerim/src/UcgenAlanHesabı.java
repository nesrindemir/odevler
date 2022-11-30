
package odev_1;
 
import java.util.Scanner;

public class UcgenAlanHesabý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		int a,b,c;
		double alan;
		
		System.out.println("Lütfen üçgenin kenar uzunluklarýný giriniz :");
		System.out.println("a kenarý :");
		a=input.nextInt();
		System.out.println("b kenarý :");
		b=input.nextInt();
		System.out.println("c kenarý :");
		c=input.nextInt();
		
		
		
	
		

		
		alan=a*b*c;
		
		System.out.println("Üçgenin alaný= " +alan);
				
				

	}

}
