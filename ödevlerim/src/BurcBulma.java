package odev_1;
import java.util.Scanner;
public class BurcBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String burc = null;
		int month,day;
		boolean isError= false;
		
	    System.out.print("Doğduğunuz ay :");
	    month=input.nextInt();
	
	    
		  if( month>12) {
		
			  
				 System.out.println("Hatalı giriş yaptınız.Lütfen tekrar giriş yapınız! ");
				 
		  }else {
			  
	    System.out.print("Doğduğunuz gün :");
	    day=input.nextInt();
	    

	    if(month==1) {
	    	if(day>=1 && day<=31) {
	    	
	    		if(day>=1 && day>=21) {
	    			
	    			burc="OĞLAK";
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
	    		
	    		burc="KOÇ";
	    	}
	    	
	    }else if(month==4){
	    	
	    	if(day>=1 && day<=20) {
	    		
	    		burc="KOÇ";
	    	}else {
	    		
	    		burc="BOĞA";
	    	} 
	    	}else {
	    	
	    		isError=true;
	    	}

	    	
	    }else if(month==5){
	    	   if(day>=1 && day<=31) {
	    	
	    	if(day>=1 && day<=21) {
	    		
	    		burc="BOĞA";
	    	}else {
	    		
	    		burc="İKİZLER";
	    	}
	    }else {
	    	
	    		isError=true;
	    	}
	    	
	    }else if(month==6){
	    	
	   if(day>=1 && day<=31) {
	    	if(day>=1 && day<=22) {
	    		
	    		burc="İKİZLER";
	    	}else {
	    		
	    		burc="YENGEÇ";
	    	}
	    	
	   }else {
	    	
	    		isError=true;
	    	}
	    	
	    	
	    }else if(month==7){
	    	
	    	  if(day>=1 && day<=31) {
	    	
	    	if(day>=1 && day<=22) {
	    		
	    		burc="YENGEÇ";
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
	    		
	    		burc="BAŞAK";
	    	}
	    	
	    	  }else {
		    	
	    		isError=true;
	    	}
	
	    }else if(month==9){
	    	
	    	  if(day>=1 && day<=31) {
	    	
	    	if(day>=1 && day<=22) {
	    		
	    		burc="BAŞAK";
	    	}else {
	    		
	    		burc="TERAZİ";
	    	}
	    	
	    	  }else {
		    	
	    		isError=true;
	    	}
	
	    }else if(month==10){
	    	
	    	  if(day>=1 && day<=31) {
	    	
	    	if(day>=1 && day<=22) {
	    		
	    		burc="TERAZİ";
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
	    		
	    		burc="OĞLAK";
	    	}
	    	
	    	  }else {
		    	
	    		isError=true;
	    	}
	
	    }
	    
	    if(isError) {
	    	
	    	 System.out.println("Hatalı giriş yaptınız.Lütfen tekrar giriş yapınız! "); 
	    	
	    }else {
	        System.out.println("Burcunuz :"+ burc);
	    }
	    
	    
	    
		  }
		  
		  
	   

		 
	  }
		  
		  
	


}
