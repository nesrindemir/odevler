package odev_1;
import java.util.Scanner;
public class OrtalamaHesaplama {

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		
		int mat,fizik,kimya,t�rkce,muzik;
		
		System.out.println("Matematik notunuzu giriniz:");
		mat=input.nextInt();
		System.out.println("Fizik notunuzu giriniz:");
		fizik=input.nextInt();
		System.out.println("Kimya notunuzu giriniz:");
		kimya=input.nextInt();
		System.out.println("T�rkce notunuzu giriniz:");
		t�rkce=input.nextInt();
		System.out.println("Muzik notunuzu giriniz:");
		muzik=input.nextInt();
		
		
		
		if((mat <0 || mat>100)){
			
			System.out.println("Matematik puan�n�z ortalamaya kat�lmam��t�r.");
			mat=0;
			
		}else if((fizik <0 || fizik>100) ){
			
			System.out.println("Fizik puan�n�z ortalamaya kat�lmam��t�r.");
			fizik=0;
			
		}else if((kimya <0 || kimya>100)) {
			
			System.out.println("Kimya puan�n�z ortalamaya kat�lmam��t�r.");
			
			kimya=0;
		}else if((t�rkce <0 || t�rkce>100)){
			
			System.out.println("T�rk�e puan�n�z ortalamaya kat�lmam��t�r.");
			t�rkce=0;
			
		}/*else ((muzik<0)||(muzik>100)){
			
			System.out.println("T�rk�e puan�n�z ortalamaya kat�lmam��t�r.");
			a=0;	
		
		}*/
		
		
		double ortalama;
		
		ortalama=mat+fizik+kimya+t�rkce+muzik/5;
		
		System.out.println("ortalaman�z :"+ortalama);
		
		if(ortalama>55) {
			
			System.out.println("S�n�f� ge�tiniz!");
			
		}else {
			
			System.out.println("S�n�fta kald�n�z!");
			
		}
		
		
		
	}
}

	
