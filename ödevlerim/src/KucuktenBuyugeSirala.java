package odev_1;
import java.util.Scanner;
public class KucuktenBuyugeSirala {

	public static void main(String[] args) {

      Scanner input  =new Scanner(System.in);
      int a,b,c;
      
      System.out.print("Birinci say�:");
      a=input.nextInt();
      
      System.out.print("�kinci say�:");
      b=input.nextInt();
      
      System.out.print("���nc� say�:");
      c=input.nextInt();
      
      if(a<b && a<c) {
    	  
    	if(b<c)  {
    		
    		System.out.println("a<b<c");
    	}else {
    		System.out.println("a<c<b");
    	}
    	   
      }else if(b<a &&b<c) {
    	  
    	  if(a<c) {
    		  
    		  System.out.println("b<a<c");
    	  }else {
    		  System.out.println("b<c<a");
    	  }
  		
      } else {
    	  if(a<b) {
    		  System.out.println("c<a<b");  
    	  }else {
    		  System.out.println("c<b<a");  
    	  }
  				
      		}
      
	}
	
}
