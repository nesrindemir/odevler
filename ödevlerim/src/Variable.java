import java.util.Scanner;

public class Variable{

public static void main(String [] args) {
	
	Scanner input = new Scanner(System.in);
	
	int mat,fiz,kim,tar,müz;
	  System.out.println("Matematik puanýnýzý giriniz : ");
	  mat = input.nextInt();
	  System.out.println("Fizik puanýnýzý giriniz : ");
	  fiz = input.nextInt();
	  System.out.println("Kimya puanýnýzý giriniz : ");
	  kim = input.nextInt();
	  System.out.println("Tarih puanýnýzý giriniz : ");
	  tar = input.nextInt();
	  System.out.println("Müzik puanýnýzý giriniz : ");
	  müz = input.nextInt();
	 

	  int toplam = (mat+fiz +kim+tar+müz);
	  double sonuc=toplam/5.0;
	  
	  System.out.println("ortalamanýz : "+sonuc);
	  if (sonuc>60) {

	  System.out.println("sýnýfý geçtiniz");

	  }else
		  
		  System.out.println("kaldýnýz");
	
	
}	
}

