import java.util.Scanner;

public class Variable{

public static void main(String [] args) {
	
	Scanner input = new Scanner(System.in);
	
	int mat,fiz,kim,tar,muz;
	  System.out.println("Matematik puan�n�z� giriniz : ");
	  mat = input.nextInt();
	  System.out.println("Fizik puan�n�z� giriniz : ");
	  fiz = input.nextInt();
	  System.out.println("Kimya puan�n�z� giriniz : ");
	  kim = input.nextInt();
	  System.out.println("Tarih puan�n�z� giriniz : ");
	  tar = input.nextInt();
	  System.out.println("M�zik puan�n�z� giriniz : ");
	  muz = input.nextInt();
	 

	  int toplam = (mat+fiz +kim+tar+m�z);
	  double sonuc=toplam/5.0;
	  
	  System.out.println("ortalaman�z : "+sonuc);
	  if (sonuc>60) {

	  System.out.println("s�n�f� ge�tiniz");

	  }else
		  
		  System.out.println("kald�n�z");
	
	
}	
}

