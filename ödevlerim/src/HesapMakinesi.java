package odev_1;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in); 
		 int n1,n2;
		 System.out.println("Birinci sayiyi giriniz :");
		 n1=input.nextInt();
		 System.out.println("�kinci sayiyi giriniz :");
		 n2=input.nextInt();
		 
	    
	 
	 System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
	  System.out.println("se�iniz :");
	  
	  int secim;
	     secim= input.nextInt();
	  
	  switch (secim) {
	  
	  case 1:
		  System.out.println("Toplam sonucu:"+(n1+n2));
		  break;
	  case 2:
		  System.out.println("��karma sonucu:"+(n1-n2));
		  break;
	  case 3 :
		  System.out.println("�arpma sonucu:"+(n1*n2));
		  break;
		  
	  case 4 :
	  {
		 if(n2!=0) {
		 
		  System.out.println("B�lme sonucu :"+(n1/n2));
	
		 }else {
	   
			   System.out.println ("Bir sayi s�f�ra b�l�nemez.!");
	
		 }
		 break; 
	  }
		  
	   
	  default:
		  
		 System.out.println ("hatal� se�im yapt�n�z.L�tfen yeniden deneyiniz!");
		 break;
	  }  
	  
	  }


	}


