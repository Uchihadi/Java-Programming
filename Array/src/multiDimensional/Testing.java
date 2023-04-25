package multiDimensional;

public class Testing {
	public static void main (String[] args) {
		//Here, the row size is 7, and the column size is 2
		//The 0th index stores the Max temperature and 1st index stores the Min temperature
		int[][] dayWiseTemperature = new int[7][2];    
		dayWiseTemperature[0][0]=29; // Initialization 
		dayWiseTemperature[0][1]=21;
		
		System.out.print(dayWiseTemperature[6][1]);
		
		//and so on
		//Another way of creating and initializing 2D array 
		int[][] dayWiseTemperature2 = new int[][]  {{29,21},
				{24,23},
				{26,22},
				{28,23},
				{29,24},
				{23,20},
				{29,21}};
		
		System.out.print(dayWiseTemperature2[6][1]);

	}
}
