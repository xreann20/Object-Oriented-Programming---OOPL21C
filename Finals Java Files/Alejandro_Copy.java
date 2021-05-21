/*
12:14 pm 21/05/2021
John Russ Alejandro
*/


public class Alejandro_Copy {
	public static void main(String[] args) {
		/*
		 * I initialized up to size 10
		 * just a proof of concept that it will
		 * just print up to n parameter(5)
		 */
		int array1[]= {10,20,30,40,50,60,70,80,90,100};
		int [] array2 = new int[5];
		
		copyArray(array1,array2,5);
	}
	
	public static void printArray(int array1[], int n)
	{
		//For Loop - print from 0 to n parameter
	for(int i=0; i<n; i++)
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
