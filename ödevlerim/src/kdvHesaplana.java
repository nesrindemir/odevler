import java.util.Scanner;

public class kdvHesaplana{
	public static void main(String [] args) {
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Lütfen ücreti giriniz :");
	
	double  ucret,kdvliUcret,kdvsizUcret,kdv,kdvOran;
	
	ucret=input.nextDouble();
	System.out.println("kdvsiz ücret :"+ucret);

	if(ucret<=1000) {
		
		 kdvOran=0.18;
		
	}else {
		
	     kdvOran=0.08;
		
	}
	
	kdv=ucret*kdvOran;
	System.out.println("kdv :"+kdv);
	
	kdvliUcret= ucret+kdv;
	
	System.out.println("kdvli ücret :"+kdvliUcret);
	
	
	

	
}
}