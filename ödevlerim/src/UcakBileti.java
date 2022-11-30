package odev_1;
import java.util.Scanner;
public class UcakBileti {

	public static void main(String[] args) {

//deðiþkenleri belirtelim.
		int mesafe,yas;
		int yolculukTipi;
		double normalTutar;
		double ucretOarný=0.10;
		double yasIdirimOrani,yasIndirimi,indirimliTutar,gdbIndirimi,toplamTutar,gdbOraný;
		
		
		Scanner  input= new Scanner(System.in);
		
		System.out.print("Mesafeyi km türünden giriniz : ");
		
		mesafe=input.nextInt();
		
		System.out.print("Yaþýnýzý giriniz : ");
		yas=input.nextInt();
		
		System.out.print("Yolculuk tipini giriniz :");
		yolculukTipi=input.nextInt();//1 tekyön 2 gidiþ-dönüþ
		
		
		if((mesafe>0 && yas>0)&& (yolculukTipi==1 ||yolculukTipi==2)) {
			
		normalTutar=mesafe*ucretOarný;
		System.out.println("Normal Tutar :" + normalTutar );
		
		if(yas<=12) {
			yasIdirimOrani=0.50;
		}else if(yas>12 && yas <=24) {
			yasIdirimOrani=0.10;
		}else if(yas>65) {
			yasIdirimOrani=0.30;
			
		}else {
			
			yasIdirimOrani=0;
		}
		
		if(yolculukTipi==2) {
			
			gdbOraný=0.20;
		}else {
			
			gdbOraný=0;
		}
		
		yasIndirimi=normalTutar*yasIdirimOrani;
		System.out.println("Yaþ indirimi :"+yasIndirimi);
		indirimliTutar=normalTutar-yasIndirimi;
		System.out.println("Ýndrimli Tutar :"+indirimliTutar);
		
		gdbIndirimi=indirimliTutar*gdbOraný;
		System.out.println("Gidiþ Dönüþ Bilet indirimi :"+gdbIndirimi);
		
		toplamTutar=(indirimliTutar-gdbIndirimi)*yolculukTipi;
		System.out.println("Toplam Tutar :"+toplamTutar);
		
		
		}else {
			
			System.out.println("Hatalý Veri Girdiniz!"  );
		}
		
	}

}
