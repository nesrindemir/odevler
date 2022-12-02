import java.util.Scanner;
public class TaksimetreUcretHesab� {
	public static void main(String[] args) {
      
		 Scanner input= new Scanner(System.in);
		 
		double acilisUcret,art�sUcret,minUcret,toplamTutar;
		int gidilenMesafe;
		
		System.out.println("Gidilen mesafeyi giriniz :");
		gidilenMesafe=input.nextInt();
		
		acilisUcret=10;
		art�sUcret=2.20;
		toplamTutar=acilisUcret+(gidilenMesafe*art�sUcret);
		
		if(toplamTutar<=20) {
			
			
			toplamTutar=20;
			
		}
		
		
		System.out.println("Toplam tutar  "+toplamTutar);
		
		
		
		
		
		
		
}
}
