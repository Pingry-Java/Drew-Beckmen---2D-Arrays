/**
 * This class contains different methods that pertain to 2D arrays
 * @author Drew Beckmen
 * @version 1.0
 */
public class PracticeProblems
{
	/**
	 * Main method that calls upon methods to build 2D arrays and print them
	 * @param args Command line input
	 */
	public static void main(String[] args)
	{
		int[][] grid1 = buildSquare(); 
		int [][] grid2 = buildSquare(8); 
		
		System.out.println("Here is the 4 x 4 array: ");
		printArray(grid1); 
		System.out.println("Here is the 8 x 8 array: ");
		printArray(grid2); 
		
	}
	
	/**
	 * Problem 1: 4 x 4 square
	 * This method calls upon the other buildSquare method that can take in any dimensions and build the 2D array
	 * @return A 2D int array that contains 4 arrays each with length 4
	 */
	public static int[][] buildSquare()
	{
		int[][] grid = buildSquare(4);
		return grid;  
		
		//Using other function rather than rewriting code
		/*int[][] grid = new int[4][4];
		int counter = 1; 
		for (int row = 0; row < 4; row++)
		{
			for (int column = 0; column < 4; column++)
			{
				grid[row][column] = counter; 
				counter++;
			}
		}*/
	}
	
	/**
	 * Problem 2 (overload) 
	 * This method has the same name as previous method but will be used if the parameter sideLength is passed in (overload)
	 * Will create a 2D array that is built with dimensions n x n, where n is the inputted side length
	 * @param sideLength The number of rows and columns in the 2D array
	 * @return The 2D int array populated with values according to inputted dimensions. 
	 */
	public static int[][] buildSquare(int sideLength)
	{
		int[][] grid = new int[sideLength][sideLength];
		int counter = 1; 
		for (int row = 0; row < grid.length; row++)
		{
			for (int column = 0; column < grid[row].length; column++)
			{
				grid[row][column] = counter; 
				counter++;
			}
		}
		return grid; 
	}
	
	/**
	 * Problem 3: Print it nicely
	 * This method takes in a 2D int array and prints it out in a nicely formatted grid/chart
	 * @param a The 2D int array that will be printed
	 */
	public static void printArray(int[][] a)
	{ 
		System.out.println(" " + helperMethod(a.length)); 
		for (int row = 0; row < a.length; row++)
		{
			System.out.print("|"); 
			for (int column = 0; column < a[row].length; column++)
			{
				//Test for length of item for formatting is correct
				if (a[row][column] < 10)
					System.out.print(a[row][column] + " |"); 
				else
					System.out.print(a[row][column] + "|"); 
			}
			System.out.println(); 
			System.out.println(" " + helperMethod(a.length)); 	
		}	
	}
	
	/**
	 * A helper method to printArray that will create a string according to given length
	 * @param length The number of times the characters have to be added to the string
	 * @return A String that contains specific characters repeated number of times. 
	 */
	public static String helperMethod(int length)
	{
		String answer = new String(); 
		for (int i = 0; i < length; i++)
			answer += "---"; 
		return answer; 
	}
}