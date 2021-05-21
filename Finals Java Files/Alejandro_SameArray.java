/*
5:40 pm 21/05/2021
John Russ Alejandro
*/


public class Alejandro_SameArray {
	public static void main(String[] args) {
		/*
		 * Again, I initialized both arrays A and B
		 * up to size 10 just a proof of concept that 
		 * it will just pass size up to n parameter(5)
		 */
		int A[]= {10,20,30,40,50,60,70,80,90,100};
		int B[]= {10,20,30,40,50,61,71,81,91,101};
		/*
		 * Method Call of verifyArray
		 */
		System.out.println(verifyArray(A,B,6));

	}
	
	public static int verifyArray(int A[], int B[], int n)
	{
		for(int i=0; i<n; i++)
			/*
			 * If A[] is not equal to B[] return 0
			 * otherwise it is equal hence, return 1
			 * PS..I could have used a variable to later
			 * assign as 1 or 0 then return it but for
			 * shorter code lines I used this method
			 */
		{
			if(A[i]!=B[i])
				return 0;
		}
		return 1;
	}
}