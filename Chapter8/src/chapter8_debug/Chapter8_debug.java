/*
 * David Garrett
 * Chapter 8, Lab 2 Debug
 * 11-4-22
 */

package chapter8_debug;

// Program prints the values of a multidimensional array in a matrix format
// Also prints the largest value in the multidimensional array along with its
// row and column index value

public class Chapter8_debug
{
	public static void main(String[] args)
	{
		int[][] data = {{2,1,0},{8,4,3},{6,7,4}};
		int[] largestItemIndexes;
		
		printMatrix(data);
		
		// In the method signature, the formal parameter is a multidimensional array of integers rather than an integer. 
		// Previously with the row and column index specified, the program tried to pass an integer. Removing the brackets
		// will allow the whole array to be passed
		largestItemIndexes = findLargestIndexes(data); //removed [0][0] from data
		
		// Changed "is %f and" to "is %d and" 
		// An exception occurs previously because %f specifies for a floating-point number when data array was initialized as 
		// a multidimensional array of integers. The data type of the values must match the format specifiers.
		System.out.printf("\nThe largest value in the two dimensional array is %d and it is located at row index %d and column index %d.",
				data[largestItemIndexes[0]][largestItemIndexes[1]],
				largestItemIndexes[0],
				largestItemIndexes[1]);
	}
	
	/**
	 * This method takes as a parameter a two dimensional array of any number of ints.
	 * It determines what the largest value is in the array then returns a
	 * two element single dimensional array that represents the row and column index of the 
	 * largest value's position in the array.
	 * 
	 * @param array The two dimensional array or any number of ints.
	 * @return The two element single single dimensional array providing the row and column index of the largest value in the array. 
	 * largest value's position in the array.
	 */
	public static int[] findLargestIndexes(int[][] array)
	{
		int[] largestIndex = new int[2]; 
		int largestValue;
		
		// Initialize the first value in the array as the starting largest value
		largestValue = array[0][0];
		
		// Loop through the rows
		for(int row = 0;row < array.length;++row)
		{
			// Loop through the columns
			for(int column = 0;column < array[row].length;++column)
			{
				// Determine if the current cell is larger than largestValue
				if(array[row][column] > largestValue)
				{
					// If the current cell is largest set largestValue to the value found at the current row and column 
					
					// Switched column and row to match the if statement. Now, the largestValue variable will be initialized
					// to the correct value if a new largest value if found.
					largestValue = array[row][column];
					largestIndex[0] = row;
					largestIndex[1] = column;
				}
			}
		}
		
		return largestIndex;
	}
	
	public static void printMatrix(int[][] matrixToPrint)
	{
		// Loop through the rows
		for(int row = 0;row < matrixToPrint.length;++row)
		{
			// Loop through the columns
			for(int column = 0;column < matrixToPrint[row].length;++column)
			{
				// Print each cell
				System.out.print(matrixToPrint[row][column] + " ");
			}
			// Start the next row on a new line
			System.out.println();
		}
	}
}
