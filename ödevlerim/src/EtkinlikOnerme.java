package odev_1;
import java.util.Scanner;

public class EtkinlikOnerme {

	public static void main(String[] args) {
	
		Scanner input= new Scanner(System.in);
		
		int heat ;
		
		System.out.print("Sýcaklýðý giriniz :");
		
		heat=input.nextInt();
		
		if(heat<=5) {
			System.out.println("KAYAÐA GÝDEBÝLÝRSÝNZ");
			
		}else if(heat>5 && heat<=25) {
			
			if(heat>10 && heat<15) {
				
				System.out.println("SÝNEMAYA GÝDEBÝLÝRSÝNZ");
				System.out.println("PÝKNÝÐE GÝDEBÝLÝRSÝNZ");
				
			
			
			}else if(heat>5 &&heat<15) {
			
			System.out.println("SÝNEMAYA GÝDEBÝLÝRSÝNZ");
			} 
			
			else if(heat>10 &&heat<=25) {
				System.out.println("PÝKNÝÐE GÝDEBÝLÝRSÝNZ");
			}
			}
		else {
			
			System.out.println("YÜZMEYE GÝDEBÝLÝRSÝNZ");
		}
	}

}
