
import java.util.Scanner;
public class artikYilHesabi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input= new Scanner(System.in)
      
      int yil;
      System.out.print("Bir yıl giriniz:");
      yil=input.nextInt();
      
      int artikyilHesapla;
      
      artikyilHesapla=(yil %4);
      
  
     
       
       if(artikyilHesapla==0) {
    	   
    	     
    	   
    	if(yil%100==0){
    		
    		if(yil%400==0) {
    			
    			  System.out.println(yil + " bir artık yıldır !");	
    			
    		}else {
    		
    		  System.out.println(yil + " bir artık yıl değildir !");
    	   }
        
    	}	
      
       }else {
      
    	  
    	  System.out.println(yil + " bir artık yıl değildir !");
    	  
       } 
      
	}

}
