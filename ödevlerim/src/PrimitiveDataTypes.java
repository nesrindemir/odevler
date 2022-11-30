package odev_1;
import java.util.Scanner;
import java.math.*;
public class PrimitiveDataTypes {


		 public static void main(String []argh)
		    {

		        Scanner input = new Scanner(System.in);
		        int value=input.nextInt();

		        for(int i=0;i<value;i++)
		        {

		            try
		            {
		                long x=input.nextLong();
		                System.out.println(x+" can be fitted in:");
		                if(x>=-128 && x<=127)System.out.println("* byte");
		                else if(x>=-32.768  && x<=32.767 )System.out.println("* short");
		                else if(x>=Math.pow(-2,31) && x<=Math.pow(2,31)-1 )System.out.println("* int");
		                else if(x>=Math.pow(-2,64) && x<=Math.pow(2,64)-1 )System.out.println("* long");
		            }
		            catch(Exception e)
		            {
		                System.out.println(input.next()+" can't be fitted anywhere.");
		            }

		        }
		    }
		}



