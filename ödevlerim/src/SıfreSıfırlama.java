package odev_1;
import java.util.Scanner;

public class S�freS�f�rlama {

	public static void main(String[] args) {
     String username,password,hataliPassword;
     
     Scanner input= new Scanner(System.in);
     
     System.out.print("Kullan�c� ad�n�z: ");
      username=input.nextLine();
      
      System.out.print("�ifreniz: ");
      password=input.nextLine();
      
     if(username.equals("patika")&&password.equals("java123")) {
    	 System.out.println("Giri� yapt�n�z!");
    	 
     }else {
    		 System.out.println("Bilgileriniz yanl��!");
    		 System.out.println("�ifrenizi s�f�rlamak istiyorsan�z 1'e ��k�� yapmakistiyorsan�z 2'ye bas�n�z.");
    	String yeniSifre;
    	int cevap;
    	
    	cevap=input.nextInt();
    	System.out.println("Yeni �ifrenizi giriniz:");
    	yeniSifre=input.nextLine();
    	
    	hataliPassword =input.nextLine();
    			
    	 if(cevap==1) {
    		 if(password.equals(yeniSifre)||hataliPassword.equals(yeniSifre)) {
    			 System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
    		 }else {
    			 
    			 System.out.println("�ifre olu�turuldu");
    		 }
    		 
    		 
    		 
    	 }
    	 }
    	 
    	 
    	 
    	 
    	 
     }
		
		
		

	}


