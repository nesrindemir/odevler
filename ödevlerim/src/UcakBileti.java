
import java.util.Scanner;
public class UcakBileti {

	public static void main(String[] args) {

//de�i�kenleri belirtelim.
		int mesafe,yas;
		int yolculukTipi;
		double normalTutar;
		double ucretOarn�=0.10;
		double yasIdirimOrani,yasIndirimi,indirimliTutar,gdbIndirimi,toplamTutar,gdbOran�;
		
		
		Scanner  input= new Scanner(System.in);
		
		System.out.print("Mesafeyi km t�r�nden giriniz : ");
		
		mesafe=input.nextInt();
		
		System.out.print("Ya��n�z� giriniz : ");
		yas=input.nextInt();
		
		System.out.print("Yolculuk tipini giriniz :");
		yolculukTipi=input.nextInt();//1 teky�n 2 gidi�-d�n��
		
		
		if((mesafe>0 && yas>0)&& (yolculukTipi==1 ||yolculukTipi==2)) {
			
		normalTutar=mesafe*ucretOarn�;
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
			
			gdbOran�=0.20;
		}else {
			
			gdbOran�=0;
		}
		
		yasIndirimi=normalTutar*yasIdirimOrani;
		System.out.println("Ya� indirimi :"+yasIndirimi);
		indirimliTutar=normalTutar-yasIndirimi;
		System.out.println("�ndrimli Tutar :"+indirimliTutar);
		
		gdbIndirimi=indirimliTutar*gdbOran�;
		System.out.println("Gidi� D�n�� Bilet indirimi :"+gdbIndirimi);
		
		toplamTutar=(indirimliTutar-gdbIndirimi)*yolculukTipi;
		System.out.println("Toplam Tutar :"+toplamTutar);
		
		
		}else {
			
			System.out.println("Hatal� Veri Girdiniz!"  );
		}
		
	}

}
