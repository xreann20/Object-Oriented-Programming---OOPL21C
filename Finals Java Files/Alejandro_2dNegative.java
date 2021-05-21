/*
3:18 pm 21/05/2021
John Russ Alejandro
*/


public class Alejandro_2dNegative {
	public static void main(String[] args) {
		/*
		 * Initialize 2D array with positive and negative numbers
		 * 2D Array size example is 5x3
		 */
		int array_2d[][]= {{10,-20,-3,12,-13},{8,-7,3,76,21},{31,-99,77,66,-1}};
		
		checkNegativesOnArray(array_2d);
	}
	
		public static void checkNegativesOnArray(int array_2d[][])
		{
			int neg_num=0;
			for(int row=0; row<array_2d.length; row++)
			{
				/*
				 * I used array_2d[0].length to specify the size
				 * of columns in row[0] in the 2D Array
				 */
				for(int col=0; col<array_2d[0].length; col++)
				{
					if(array_2d[row][col]<0)
					{
						neg_num=neg_num+1;
					}
				}
			}
			System.out.println("The number of negative elements in the 2D Array is " + neg_num + ".");
		}
	
}
