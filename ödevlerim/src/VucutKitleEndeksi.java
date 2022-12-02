
import java.util.Scanner;
public class VucutKitleEndeksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double boy,kilo,kitleEndeksi;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("L�tfen metre cinsinden boyunuzu giriniz :");
         boy=input.nextDouble();
         System.out.println("L�tfen kg cinsinden kilonuzu giriniz :");
         kilo=input.nextDouble();
         
         kitleEndeksi=kilo/(boy*boy);
         
         System.out.println("Vuc�t Kitle Endeksiniz :"+kitleEndeksi);
        		 
	
	
	
	}

}
