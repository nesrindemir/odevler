package odev_1;
import java.util.Scanner;

public class SýfreSýfýrlama {

	public static void main(String[] args) {
     String username,password,hataliPassword;
     
     Scanner input= new Scanner(System.in);
     
     System.out.print("Kullanýcý adýnýz: ");
      username=input.nextLine();
      
      System.out.print("Þifreniz: ");
      password=input.nextLine();
      
     if(username.equals("patika")&&password.equals("java123")) {
    	 System.out.println("Giriþ yaptýnýz!");
    	 
     }else {
    		 System.out.println("Bilgileriniz yanlýþ!");
    		 System.out.println("þifrenizi sýfýrlamak istiyorsanýz 1'e çýkýþ yapmakistiyorsanýz 2'ye basýnýz.");
    	String yeniSifre;
    	int cevap;
    	
    	cevap=input.nextInt();
    	System.out.println("Yeni þifrenizi giriniz:");
    	yeniSifre=input.nextLine();
    	
    	hataliPassword =input.nextLine();
    			
    	 if(cevap==1) {
    		 if(password.equals(yeniSifre)||hataliPassword.equals(yeniSifre)) {
    			 System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
    		 }else {
    			 
    			 System.out.println("Þifre oluþturuldu");
    		 }
    		 
    		 
    		 
    	 }
    	 }
    	 
    	 
    	 
    	 
    	 
     }
		
		
		

	}


