package odev_1;
import java.util.Scanner;

public class EtkinlikOnerme {

	public static void main(String[] args) {
	
		Scanner input= new Scanner(System.in);
		
		int heat ;
		
		System.out.print("Sıcaklığı giriniz :");
		
		heat=input.nextInt();
		
		if(heat<=5) {
			System.out.println("KAYAĞA GİDEBİLİRSİNZ");
			
		}else if(heat>5 && heat<=25) {
			
			if(heat>10 && heat<15) {
				
				System.out.println("SİNEMAYA GİDEBİLİRSİNZ");
				System.out.println("PİKNİĞE GİDEBİLİRSİNZ");
				
			
			
			}else if(heat>5 &&heat<15) {
			
			System.out.println("SİNEMAYA GİDEBİLİRSİNZ");
			} 
			
			else if(heat>10 &&heat<=25) {
				System.out.println("PİKNİĞE GİDEBİLİRSİNZ");
			}
			}
		else {
			
			System.out.println("YÜZMEYE GİDEBİLİRSİNZ");
		}
	}

}
