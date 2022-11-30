package odev_1;
import java.util.Scanner;
public class ArtikYilHesabi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input= new Scanner(System.in);
      
      int yil;
      System.out.print("Bir yýl giriniz:");
      yil=input.nextInt();
      
      int artikyilHesapla;
      
      artikyilHesapla=(yil %4);
      
  
     
       
       if(artikyilHesapla==0) {
    	   
    	     
    	   
    	if(yil%100==0){
    		
    		if(yil%400==0) {
    			
    			  System.out.println(yil + " bir artýk yýldýr !");	
    			
    		}else {
    		
    		  System.out.println(yil + " bir artýk yýl deðildir !");
    	   }
        
    	}	
      
       }else {
      
    	  
    	  System.out.println(yil + " bir artýk yýl deðildir !");
    	  
       } 
      
	}

}
