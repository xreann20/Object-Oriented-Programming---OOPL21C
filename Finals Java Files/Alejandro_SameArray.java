/*
12:29 pm 21/05/2021
John Russ Alejandro
*/


public class Alejandro_SameArray {
	public static void main(String[] args) {
		/*
		 * Again, I initialized both arrays A and B
		 * up to size 10 just a proof of concept that 
		 * it will just print up to n parameter(5)
		 */
		int A[]= {10,20,30,40,50,60,70,80,90,100};
		int B[]= {10,11,30,33,50,66,70,88,90,111};
		
		verifyArray(A,B,5);
	}
	
	public static void verifyArray(int A[], int B[], int n)
	{
		for(int i=0; i<n; i++)
		{
			/*
			 * For 0 to n parameter, and if array A[i]=B[i]
			 * print 1 else print 0, added index for reference
			 */
			if(A[i]==B[i])
			{
				System.out.println("index[" + i + "] = 1");
				
			}
			else
			{
				System.out.println("index[" + i + "] = 0");
			}
		}
	}
}

