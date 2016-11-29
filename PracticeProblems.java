public class PracticeProblems
{
	public static void main(String[] args)
	{
		int[][] grid1 = buildSquare(); 
		int [][] grid2 = buildSquare(8); 
		System.out.println("Here is the 4 x 4 array: ");
		printArray(grid1); 
		System.out.println("Here is the 8 x 8 array: ");
		printArray(grid2); 
		
	}
	
	//Problem 1: 4 x 4 square
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
	
	//Problem 2 (overload) 
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
	
	//Problem 3: Print it nicely
	public static void printArray(int[][] a)
	{ 
		System.out.println(" " + helperMethod(a.length)); 
		for (int row = 0; row < a.length; row++)
		{
			System.out.print("|"); 
			for (int column = 0; column < a[row].length; column++)
			{
				//Test for length of item
				if (a[row][column] < 10)
					System.out.print(a[row][column] + " |"); 
				else
					System.out.print(a[row][column] + "|"); 
			}
			System.out.println(); 
			System.out.println(" " + helperMethod(a.length)); 	
		}	
	}
	
	public static String helperMethod(int length)
	{
		String answer = new String(); 
		for (int i = 0; i < length; i++)
			answer += "---"; 
		return answer; 
	}
}