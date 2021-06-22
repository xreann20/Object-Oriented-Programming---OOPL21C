/*
12:21 pm 21/05/2021
John Russ Alejandro
*/


public class Alejandro_ReverseCopy {
	public static void main(String[] args) {
		/*
		 * Again, I initialized up to size 10
		 * just a proof of concept that it will
		 * just print up to n parameter(5)
		 */
		int array1[]= {10,20,30,40,50,60,70,80,90,100};
		int [] array2 = new int[5];
		
		copyArray(array1,array2,5);
	}
	
	public static void printArray(int array1[], int n)
	{
		/* Modified for loop, all looks like the first one
		 * but this one is modified to print from
		 * n parameter to 0, hence (i=n-1; i>=0; i--)
		 */
	for(int i=n-1; i>=0; i--)
		System.out.println(array1[i]);

	}
	
	public static void copyArray(int array1[], int array2[], int n)
	{
		for(int i=0; i<n; i++)
		{
			array2[i]=array1[i];
		}
		printArray(array2,5);
	}
}

