package odev_1;
import java.util.Scanner;
public class ManavKasaProgrami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner (System.in);	
	
	double a_kilo,toplamTutar,armut,elma,domates,muz,patl�can;
	double e_kilo,d_kilo,m_kilo,p_kilo;
	armut=2.14;
	elma=3.67;
	domates=1.11;
	muz=0.95;
	patl�can=5;
	
	System.out.print("ARMUT KA� K�LO? :");
	a_kilo=input.nextDouble();
	System.out.print("ELMA KA� K�LO? :");
	e_kilo=input.nextDouble();
	System.out.print("DOMATES KA� K�LO? :");
	d_kilo=input.nextDouble();
	System.out.print("MUZ KA� K�LO? :");
	m_kilo=input.nextDouble();
	System.out.print("PATLICAN KA� K�LO? :");
	p_kilo=input.nextDouble();
	
	toplamTutar=(a_kilo*armut)+(elma+e_kilo)+(d_kilo*domates)+(m_kilo*muz)+(p_kilo*patl�can);
		
		System.out.println("Toplam tutar = "+toplamTutar);
		
	}

}
