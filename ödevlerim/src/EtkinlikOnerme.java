package odev_1;
import java.util.Scanner;

public class EtkinlikOnerme {

	public static void main(String[] args) {
	
		Scanner input= new Scanner(System.in);
		
		int heat ;
		
		System.out.print("S�cakl��� giriniz :");
		
		heat=input.nextInt();
		
		if(heat<=5) {
			System.out.println("KAYA�A G�DEB�L�RS�NZ");
			
		}else if(heat>5 && heat<=25) {
			
			if(heat>10 && heat<15) {
				
				System.out.println("S�NEMAYA G�DEB�L�RS�NZ");
				System.out.println("P�KN��E G�DEB�L�RS�NZ");
				
			
			
			}else if(heat>5 &&heat<15) {
			
			System.out.println("S�NEMAYA G�DEB�L�RS�NZ");
			} 
			
			else if(heat>10 &&heat<=25) {
				System.out.println("P�KN��E G�DEB�L�RS�NZ");
			}
			}
		else {
			
			System.out.println("Y�ZMEYE G�DEB�L�RS�NZ");
		}
	}

}
