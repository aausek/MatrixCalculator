package model;

/**
 * Class that models a matrix calculator.
 * @author No author!
 */
public class MatrixCalculator 
{      
	/**
	 * Matrix of integer (non decimal) numbers
	 */
	private long[][] numbers; 

	/**
	 * <b>Description: </b> Constructor method of the class<br>
	 * <b>Pre: </b> Does not apply<br>
	 * <b>Post: </b> An instance of type Calculator has been created.<br>
	 *
	 */
	public MatrixCalculator()
	{
		//We won't initialize the matrix yet. We will let the user to be able to do so.
		numbers = null;
	}

	//---------------------------------
	// Methods
	// --------------------------------


	/**
	 * <b>Description: </b> Method that initializes the slots in the matrix.<br>
	 * <b>Pre: </b> The matrix of numbers has been initialized.<br>
	 * <b>Post: </b> All slots in the matrix have been initialized with random numbers.<br>
	 * @param pDimension dimension (# rows and # columns) of the matrix. pDimension >=0.
	 */
	public void initializeSlots(short pDimension) throws Exception
	{
		if(pDimension <= 0)
		{
			throw new Exception("Input a positive number");
		}

		//We initialize our matrix of numbers!
		numbers = new long[pDimension][pDimension];

		short min = 1;
		short max = 500;

		for (short i = 0; i < numbers.length; i++) 
		{
			for (int j = 0; j < numbers.length; j++) 
			{
				numbers[i][j] = (long)(Math.random()*(max-min+1) - min);
			}
		}
	}

	/**
	 * <b>Description: </b> Method that responds with a text of the numbers in the matrix.<br>
	 * <b>Pre: </b> The matrix of numbers has been initialized.<br>
	 * <b>Post: </b> Does not apply.<br>
	 * @return a text of the numbers in the matrix.
	 */
	public String displayNumbers()
	{
		String message = "";

		for (short i = 0; i < numbers.length; i++) 
		{
			String row = "";
			for (int j = 0; j < numbers.length; j++) 
			{
				row += numbers[i][j] + "\t";
			}
			message += row+"\n";
		}

		return message;
	}

	/**
	 * <b>Description: </b> Method that returns the longest number of the matrix.<br>
	 * <b>Pre: </b> The matrix of numbers has been initialized.<br>
	 * <b>Post: </b> Does not apply.<br>
	 * @return the longest number of the matrix. 
	 */
	public long getLongestNumber()
	{
		long max = 0;

		if(numbers.length != 0) {

			for (short i = 0; i < numbers.length; i++) {

				for (int j = 0; j < numbers.length; j++) {

					if(numbers[i][j] > max) {

						max = numbers[i][j];
					}
				}
			}
		}
		return max;
	}


	/**
	 * <b>Description: </b> Method that returns how many even numbers are in the matrix.<br>
	 * <b>Pre: </b> The matrix of numbers has been initialized.<br>
	 * <b>Post: </b> Does not apply.<br>
	 * @return the count of even numbers in the matrix. 
	 */
	public short countEvenNumbers()
	{
		short evenCount = 0;

		if(numbers.length != 0) {

			for (int i = 0; i < numbers.length; i++) {

				for (int j = 0; j < numbers.length; j++) {

					if(numbers[i][j] % 2 == 0) {

						evenCount++;
					}
				}
			}
		}
		return evenCount;
	}

	/**
	 * <b>Description: </b> Method that returns counts how many numbers are greater or equal to a number input as parameter.<br>
	 * <b>Pre: </b> The matrix of numbers has been initialized.<br>
	 * <b>Post: </b> Does not apply.<br>
	 * @throws Exception when the input number is equal or less than 0. Message should be: "The input number needs to be greater than 0".
	 * @return the count of numbers greater or equal than the input number.
	 */
	public short countGreaterNumbers(long pNumber) throws Exception
	{
		short evenCount = 0;

		if(pNumber <= 0)
		{
			throw new Exception("Input a positive number");
		}
		
		if(numbers.length != 0 && pNumber <= 0) {

			for (int i = 0; i < numbers.length; i++) {

				for (int j = 0; j < numbers.length; j++) {

					long num = numbers[i][j];

					if(num % 2 == 0 && num >= pNumber) {

						evenCount++;
					}
				}
			}
		}
		return evenCount;
	}


	/**
	 * <b>Description: </b> Method that returns the average of all the numbers of the matrix.<br>
	 * <b>Pre: </b> The matrix of numbers has been initialized.<br>
	 * <b>Post: </b> Does not apply.<br>
	 * @return the average of all the numbers of the matrix. 
	 */
	public float getNumbersAverage()
	{
		float average = 0;
		long num = 0;
		short denom = 0;

		if(numbers.length != 0) {

			for (short i = 0; i < numbers.length; i++) {

				for (short j = 0; j < numbers.length; j++) {

					long a = numbers[i][j];
					num += a;
					denom++;
				}
			}
			if(denom > 0) {

				average = num / denom;
			}
		}
		return average;
	}

}













