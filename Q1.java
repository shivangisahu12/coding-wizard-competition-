package coding_wizard;
import java.util.*;
public class Q1 {
	boolean findtriplets(int A[], int arr_size, int sum) 
	{  

		for (int i = 0; i < arr_size - 2; i++) 
		{ 
			
			for (int j = i + 1; j < arr_size - 1; j++)
			{ 

				for (int k = j + 1; k < arr_size; k++) 
				{ 
					if (A[i] + A[j] + A[k] == sum)
					{ 
						System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]); 
						return true; 
					} 
				} 
			} 
		}

			return false; 
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 triplet = new Q1(); 
		int A[] = { 1,2,3,4,5}; 
	     int sum = 9;
		int arr_size = A.length; 

		triplet.findtriplets(A, arr_size, sum); 

	}

}
