package odev_1;
import java.util.Scanner;
public class BurcBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String burc = null;
		int month,day;
		boolean isError= false;
		
	    System.out.print("Do�du�unuz ay :");
	    month=input.nextInt();
	
	    
		  if( month>12) {
		
			  
				 System.out.println("Hatal� giri� yapt�n�z.L�tfen tekrar giri� yap�n�z! ");
				 
		  }else {
			  
	    System.out.print("Do�du�unuz g�n :");
	    day=input.nextInt();
	    

	    if(month==1) {
	    	if(day>=1 && day<=31) {
	    	
	    		if(day>=1 && day>=21) {
	    			
	    			burc="O�LAK";
	    		}else {
	    			
	    			burc="KOVA";
	    		}
	    	
	    	}else {
	    	
	    		isError=true;
	    	}

	    }
	    else if(month==2){
	    	if(day>=1 && day<=28) {
	    	
	    	    if(day>=1 && day<=19) {
	    		
	    		burc="KOVA";
	      	    }else {
	    		
	    		burc="BALIK";
	    	}
	    }else {
	    	
	    		isError=true;
	    	}

	    	
	    }else if(month==3){
	    if(day>=1 && day<=28) {
	    	
	    	if(day>=1 && day<=20) {
	    		
	    		burc="BALIK";
	    	}else {
	    		
	    		burc="KO�";
	    	}
	    	
	    }else if(month==4){
	    	
	    	if(day>=1 && day<=20) {
	    		
	    		burc="KO�";
	    	}else {
	    		
	    		burc="BO�A";
	    	} 
	    	}else {
	    	
	    		isError=true;
	    	}

	    	
	    }else if(month==5){
	    	   if(day>=1 && day<=31) {
	    	
	    	if(day>=1 && day<=21) {
	    		
	    		burc="BO�A";
	    	}else {
	    		
	    		burc="�K�ZLER";
	    	}
	    }else {
	    	
	    		isError=true;
	    	}
	    	
	    }else if(month==6){
	    	
	   if(day>=1 && day<=31) {
	    	if(day>=1 && day<=22) {
	    		
	    		burc="�K�ZLER";
	    	}else {
	    		
	    		burc="YENGE�";
	    	}
	    	
	   }else {
	    	
	    		isError=true;
	    	}
	    	
	    	
	    }else if(month==7){
	    	
	    	  if(day>=1 && day<=31) {
	    	
	    	if(day>=1 && day<=22) {
	    		
	    		burc="YENGE�";
	    	}else {
	    		
	    		burc="ASLAN";
	    	}
	    	
	    	  }else {
		    	
	    		isError=true;
	    	}
	    	
	    	
	    }else if(month==8){
	    	
	    	  if(day>=1 && day<=31) {
	    	
	    	if(day>=1 && day<=22) {
	    		
	    		burc="ASLAN";
	    	}else {
	    		
	    		burc="BA�AK";
	    	}
	    	
	    	  }else {
		    	
	    		isError=true;
	    	}
	
	    }else if(month==9){
	    	
	    	  if(day>=1 && day<=31) {
	    	
	    	if(day>=1 && day<=22) {
	    		
	    		burc="BA�AK";
	    	}else {
	    		
	    		burc="TERAZ�";
	    	}
	    	
	    	  }else {
		    	
	    		isError=true;
	    	}
	
	    }else if(month==10){
	    	
	    	  if(day>=1 && day<=31) {
	    	
	    	if(day>=1 && day<=22) {
	    		
	    		burc="TERAZ�";
	    	}else {
	    		
	    		burc="AKREP";
	    	}
	    	
	    	  }else {
		    	
	    		isError=true;
	    	}
	
	    }else if(month==11){
	    	
	    	  if(day>=1 && day<=31) {
	    	
	    	if(day>=1 && day<=21) {
	    		
	    		burc="AKREP";
	    	}else {
	    		
	    		burc="YAY";
	    	}
	    	
	    	  }else {
		    	
	    		isError=true;
	    	}
	
	    }else {
	    	
	    	  if(day>=1 && day<=31) {
	    	
	    	if(day>=1 && day<=21) {
	    		
	    		burc="YAY";
	    	}else {
	    		
	    		burc="O�LAK";
	    	}
	    	
	    	  }else {
		    	
	    		isError=true;
	    	}
	
	    }
	    
	    if(isError) {
	    	
	    	 System.out.println("Hatal� giri� yapt�n�z.L�tfen tekrar giri� yap�n�z! "); 
	    	
	    }else {
	        System.out.println("Burcunuz :"+ burc);
	    }
	    
	    
	    
		  }
		  
		  
	   

		 
	  }
		  
		  
	


}
