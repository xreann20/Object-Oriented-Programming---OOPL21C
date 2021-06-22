/*
7:04 pm 21/05/2021
John Russ Alejandro
*/


public class Alejandro_Matrix {
	public static void main(String[] args) {
		/*
		 * Use this Array sample for easier computation
		 * I added commented lines below for proof of
		 * concept
		 */
		int A[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int B[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		/*
		 * Uncomment the lines below and comment Array A
		 * and Array B above for testing the code :)
		 */
		//int A[][]= {{3,2,77,4,5},{6,7,8,9,10},{51,12,13,16,15},{16,87,18,19,20},{21,22,23,24,25}};
		//int B[][]= {{1,2,23,4,5},{6,74,82,10,33},{31,22,13,14,15},{16,65,18,31,24},{21,27,23,24,25}};
		int C[][]= new int[5][5];
		System.out.println("Assuming Array A is:");
		for(int row=0; row<A.length; row++)
		{
			for(int col=0; col<A[0].length; col++)
			{
				if(col%5==0)
				{
					System.out.print("\n");
				}
				System.out.print(A[row][col] + "\t");
			}
		}
		System.out.println("\n\nand Array B is:");
		for(int row=0; row<B.length; row++)
		{
			for(int col=0; col<B[0].length; col++)
			{
				if(col%5==0)
				{
					System.out.print("\n");
				}
				System.out.print(B[row][col] + "\t");
			}
		}
		System.out.println("\n\nArray C would look like this:");
		addArrayAandArrayB(A,B,C);
	}
	
	public static void addArrayAandArrayB (int ArrayA[][], int ArrayB[][], int ArrayC[][])
	{
		for(int row=0; row<ArrayA.length; row++)
		{
			for(int col=0; col<ArrayA[0].length; col++)
			{
				ArrayC[row][col]=ArrayA[row][col]+ArrayB[row][col];
				if(col%5==0)
				{
					System.out.print("\n");
				}
				System.out.print(ArrayC[row][col] + "\t");
			}
		}
	}
}
