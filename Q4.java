package coding_wizard;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		 int p = n / 2, t = 1; 
		  
	        for (int i = 1; i <= n; i++) { 
	  
	            for (int j = 1; j <= p; j++) 
	                System.out.print(" "); 
	            int count = t / 2 + 1; 
	            for (int k = 1; k <= t; k++) { 
	                System.out.print(count); 
	                if (k <= t / 2) 
	                    count--; 
	                else
	                    count++; 
	            } 
	            System.out.println(); 
	            if (i <= n / 2) { 
	                p = p - 1; 
	                t = t + 2; 
	            } 
	  
	            else { 
	                p = p + 1; 
	                t = t - 2; 
	            } 
	        }
	}

}
