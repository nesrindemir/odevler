package odev_1;
import java.util.Scanner;
public class TaksimetreUcretHesabı {
	public static void main(String[] args) {
      
		 Scanner input= new Scanner(System.in);
		 
		double acilisUcret,artısUcret,minUcret,toplamTutar;
		int gidilenMesafe;
		
		System.out.println("Gidilen mesafeyi giriniz :");
		gidilenMesafe=input.nextInt();
		
		acilisUcret=10;
		artısUcret=2.20;
		toplamTutar=acilisUcret+(gidilenMesafe*artısUcret);
		
		if(toplamTutar<=20) {
			
			
			toplamTutar=20;
			
		}
		
		
		System.out.println("Toplam tutar  "+toplamTutar);
		
		
		
		
		
		
		
}
}
