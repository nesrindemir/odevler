package odev_1;
import java.util.Scanner;
public class OrtalamaHesaplama {

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		
		int mat,fizik,kimya,türkce,muzik;
		
		System.out.println("Matematik notunuzu giriniz:");
		mat=input.nextInt();
		System.out.println("Fizik notunuzu giriniz:");
		fizik=input.nextInt();
		System.out.println("Kimya notunuzu giriniz:");
		kimya=input.nextInt();
		System.out.println("Türkce notunuzu giriniz:");
		türkce=input.nextInt();
		System.out.println("Muzik notunuzu giriniz:");
		muzik=input.nextInt();
		
		
		
		if((mat <0 || mat>100)){
			
			System.out.println("Matematik puanýnýz ortalamaya katýlmamýþtýr.");
			mat=0;
			
		}else if((fizik <0 || fizik>100) ){
			
			System.out.println("Fizik puanýnýz ortalamaya katýlmamýþtýr.");
			fizik=0;
			
		}else if((kimya <0 || kimya>100)) {
			
			System.out.println("Kimya puanýnýz ortalamaya katýlmamýþtýr.");
			
			kimya=0;
		}else if((türkce <0 || türkce>100)){
			
			System.out.println("Türkçe puanýnýz ortalamaya katýlmamýþtýr.");
			türkce=0;
			
		}/*else ((muzik<0)||(muzik>100)){
			
			System.out.println("Türkçe puanýnýz ortalamaya katýlmamýþtýr.");
			a=0;	
		
		}*/
		
		
		double ortalama;
		
		ortalama=mat+fizik+kimya+türkce+muzik/5;
		
		System.out.println("ortalamanýz :"+ortalama);
		
		if(ortalama>55) {
			
			System.out.println("Sýnýfý geçtiniz!");
			
		}else {
			
			System.out.println("Sýnýfta kaldýnýz!");
			
		}
		
		
		
	}
}

	
