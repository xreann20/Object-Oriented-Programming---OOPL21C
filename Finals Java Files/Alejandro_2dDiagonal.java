/*
6:22 pm 21/05/2021
John Russ Alejandro
*/


public class Alejandro_2dDiagonal {
	public static void main(String[] args) {
		int array_2d[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		System.out.println("Assuming the matrix is like this:");
		System.out.println("1\t2\t3\t4\t5\n6\t7\t8\t9\t10\n11\t12\t13\t14\t15\n16\t17\t18\t19\t20\n21\t22\t23\t24\t25");
		System.out.println("\nThe main diaganol would be :");
		//Call Method
		diagonalsOnArray(array_2d);
	}
	
	public static void diagonalsOnArray(int array_2d[][])
	{
		for(int row=0; row<array_2d.length; row++)
		{
			for(int col=0; col<array_2d[0].length; col++)
			{
				//If statement for the matrix diagonal
				if(row==col)
				{
					System.out.println(array_2d[row][col]);
				}
			}
		}
	}

}