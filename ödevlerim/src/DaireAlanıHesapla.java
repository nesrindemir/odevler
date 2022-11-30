package odev_1;
import java.util.Scanner;
public class DaireAlanýHesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner (System.in);
		double r,cevre,alan,pi_sayisi,dilimAlani;
		pi_sayisi=3.14;
		System.out.print("Lütfen dairenin yarýçapýný giriniz :");
		
		r=input.nextDouble();
		cevre=2*pi_sayisi*r;
		alan=pi_sayisi*r*r;
		
		
		System.out.println("Dairenin çevresi :"+cevre);
		System.out.println("Dairenin alaný :"+alan);
		System.out.println("Açýyý giriniz :");
		
		
		int a;
		a=input.nextInt();
		
		
		
		dilimAlani=(pi_sayisi * (r*r) * a) / 360;
		
		System.out.println("Dilim Alaný :"+dilimAlani);
		

	}

}
