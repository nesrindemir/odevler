package odev_1;
import java.util.Scanner;
public class DaireAlan�Hesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner (System.in);
		double r,cevre,alan,pi_sayisi,dilimAlani;
		pi_sayisi=3.14;
		System.out.print("L�tfen dairenin yar��ap�n� giriniz :");
		
		r=input.nextDouble();
		cevre=2*pi_sayisi*r;
		alan=pi_sayisi*r*r;
		
		
		System.out.println("Dairenin �evresi :"+cevre);
		System.out.println("Dairenin alan� :"+alan);
		System.out.println("A��y� giriniz :");
		
		
		int a;
		a=input.nextInt();
		
		
		
		dilimAlani=(pi_sayisi * (r*r) * a) / 360;
		
		System.out.println("Dilim Alan� :"+dilimAlani);
		

	}

}
