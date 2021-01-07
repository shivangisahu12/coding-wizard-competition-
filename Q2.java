package coding_wizard;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter the first String : ");
	         String s1 = sc.nextLine();
	        
	        System.out.println("Enter the second String : ");
	        String s2 = sc.nextLine();
	        
	        char [] c1 = s1.toCharArray();
	        char [] c2 = s2.toCharArray();
	       
	        
	            for(int j=0;j<c2.length;j++) {
	                for(int i=0;i<c1.length;i++) {

	                if(c1[i] == c2[j]) {
	                    c1[i] = 0;
	                }    
	                }
	            }

	            System.out.println("After removing the characters of second string from first string :");

	            for(int i=0;i<c1.length;i++) {
	                System.out.print(c1[i]); 
	            }
	}
}


