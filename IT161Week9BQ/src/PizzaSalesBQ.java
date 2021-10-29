import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Assignment: PizzaSalesBQ
 * 
 * Abstract: This program tests on arrays and the creation of Javadoc comments.
 * It allows the user to input the number of pizza sales in a day, then the
 * dollar amount for each sale. The program also allows the user to input the
 * number of employees working at the pizza shop in a day. The program outputs
 * the total sales for the day, the higest sale, the lowest sale, the average
 * sales amount, the total employee commission, and the commission per employee.
 * 
 * Course Info: IT 161 - 001, Java 1, Spring 2021, March 19, 2021
 * 
 * @author Brad Quinton
 * @version 1.0
 * 
 */
public class PizzaSalesBQ {

	/**
	 * Method main
	 * 
	 * @param args - not used
	 */
	
	public static void main(String[] args) {
		// Declare variables and array.
		double adblSales[];
		double dblTotal = 0;
		double dblMaximum = 0;
		double dblMinimum = 0;
		double dblAverage = 0;
		double adblEmployees[];
		double dblTotalCommission = 0;
		double dblPerEmployeeCommission = 0;

		// This calls the SaleArray method.
		adblSales = SaleArray();

		// This calls the PopulateSaleArray method.
		adblSales = PopulateSaleArray(adblSales);

		// This calls the TotalSales method and the PrintAverageOfArray method.
		dblTotal = TotalSales(adblSales);
		PrintAverageOfArray(adblSales, dblTotal);

		// This calls the MaximumSale method and the PrintMaximumSale method.
		dblMaximum = MaximumSale(adblSales);
		PrintMaximumSale(adblSales, dblMaximum);

		// This calls the MinimumSale method and the PrintMinimumSale method.
		dblMinimum = MinimumSale(adblSales);
		PrintMinimumSale(adblSales, dblMinimum);

		// This calls the AverageSales method and the PrintAverageSales method.
		dblAverage = AverageSales(adblSales, dblTotal);
		PrintAverageSales(adblSales, dblAverage);
		
		// This calls the EmployeeArray method.
		adblEmployees = EmployeeArray();
		
		// This calls the CalculateCommission Method and PrintTotalCommission method.
		dblTotalCommission = CalculateCommission(dblTotal);
		PrintTotalCommission(dblTotalCommission);

		// This calls the CalculatePerEmployeeCommission method and
		// PrintPerEmployeeCommission method.
		dblPerEmployeeCommission = CalculatePerEmployeeCommission(adblEmployees, dblTotalCommission);
		PrintPerEmployeeCommission(dblPerEmployeeCommission);

	}

	/**
	 * Method PrintTotalSales
	 * 
	 * Abstract: This prints the total sales amount for the day.
	 * 
	 * @param adblSales - sales array
	 * @param dblTotal - sales total
	 * 
	 */
	public static void PrintAverageOfArray(double[] adblSales, double dblTotal) {
		System.out.printf("Total sales for the day: $%.2f", dblTotal);
		System.out.print("\n");
	}

	/**
	 * Method PrintMaximumSale
	 * 
	 * Abstract: This prints the maximum sale for the day.
	 * 
	 * @param adblSales - sales array
	 * @param dblMaximum - maximum sale
	 * 
	 */
	public static void PrintMaximumSale(double[] adblSales, double dblMaximum) {
		System.out.printf("Highest sale for the day: $%.2f", dblMaximum);
		System.out.print("\n");
	}

	/**
	 * Method PrintMinimumSale
	 * 
	 * Abstract: This prints the minimum sale for the day.
	 * 
	 * @param adblSales - sales array
	 * @param dblMinimum - minimum sale
	 * 
	 */
	public static void PrintMinimumSale(double[] adblSales, double dblMinimum) {
		System.out.printf("Lowest sale for the day: $%.2f", dblMinimum);
		System.out.print("\n");
	}

	/**
	 * Method PrintAverageSales
	 * 
	 * Abstract: This prints the average sales for the day.
	 * 
	 * @param adblSales - sales array
	 * @param dblAverage - average total sales
	 * 
	 */
	public static void PrintAverageSales(double[] adblSales, double dblAverage) {
		System.out.printf("Average sale amount for the day: $%.2f", dblAverage);
		System.out.print("\n");
		System.out.print("\n");
	}

	/**
	 * Method PrintTotalCommission
	 * 
	 * Abstract: This prints the total employee commission for the day.
	 * 
	 * @param dblTotalCommission - total employee commission
	 * 
	 */
	public static void PrintTotalCommission(double dblTotalCommission) {
		System.out.printf("Total employee commission is: $%.2f", dblTotalCommission);
		System.out.print("\n");
	}

	/**
	 * Method PrintPerEmployeeCommission
	 * 
	 * Abstract: This prints the per employee commission.
	 * 
	 * @param dblPerEmployeeCommission - commission per employee
	 * 
	 */
	public static void PrintPerEmployeeCommission(double dblPerEmployeeCommission) {
		System.out.printf("Per employee commission amount: $%.2f", dblPerEmployeeCommission);
		System.out.print("\n");
	}

	/**
	 * Method SaleArray
	 * 
	 * Abstract: This creates the sale array, which will store each sale amount.
	 * 
	 * @return adblSales - sales array
	 */
	public static double[] SaleArray() {
		// Declare variable and array.
		int intNumberOfSales = 0;
		double adblSales[];

		// This do/while loop validates user input to make sure it's greater than 0.
		// The program prompts the user to enter the number of sales for the day.
		do {
			System.out.print("Enter a positive total number of sales for the day: \n");
			intNumberOfSales = ReadIntegerFromUser();

		} while (intNumberOfSales <= 0);

		// This allocates space for the array.
		adblSales = new double[intNumberOfSales];

		// This returns the sales array.
		return adblSales;
	}

	/**
	 * Method PopulateSaleArray
	 * 
	 * Abstract: This populates the sale array with each user-inputted sale amount.
	 * 
	 * @param adblSales - sales array
	 * 
	 * @return adblSales - sales array
	 */
	public static double[] PopulateSaleArray(double[] adblSales) {
		// Declare variables.
		int intIndex = 0;

		// This for loop reads input from the user (i.e., each sale amount)
		// and populates the array with the input.
		for (intIndex = 0; intIndex < adblSales.length; intIndex += 1) {
			System.out.println("Enter ticket # amount " + (intIndex + 1) + ": ");
			adblSales[intIndex] = ReadFloatFromUser();
		}

		// This returns the sale array.
		return adblSales;
	}

	/**
	 * Method TotalSales
	 * 
	 * Abstract: This calculates the total sales.
	 * 
	 * @param adblSales - sales array
	 * 
	 * @return dblTotal - total sales
	 */
	public static double TotalSales(double[] adblSales) {
		// Declare variables.
		int intIndex = 0;
		double dblTotal = 0;

		// This for loop cycles through the sale array and adds each sale,
		// summing to a final total sale and storing that total in dblTotal.
		for (intIndex = 0; intIndex < adblSales.length; intIndex += 1) {
			dblTotal += adblSales[intIndex];
		}

		return dblTotal;
	}

	/**
	 * Method MaximumSale
	 * 
	 * Abstract: This finds the maximum value in the sale array.
	 * 
	 * @param adblSales - sales array
	 * 
	 * @return dblMaximum - maximum sale
	 */
	public static double MaximumSale(double[] adblSales) {
		// Declare variables.
		double dblMaximum = 0;
		int intIndex = 0;

		// This sets the maximum sale amount to the value in the first
		// position of the sale array.
		dblMaximum = adblSales[0];

		// This for loop cycles through the sale array until a maximum value
		// is found. Once the maximum value is found, and loop finishes,
		// the maximum value is stored in dblMaximum.
		for (intIndex = 0; intIndex < adblSales.length; intIndex += 1) {
			if (dblMaximum < adblSales[intIndex]) {
				dblMaximum = adblSales[intIndex];
			}
		}

		// This returns the maximum sale value in the array.
		return dblMaximum;
	}

	/**
	 * Method MinimumSale
	 * 
	 * Abstract: This finds the minimum value in the sale array.
	 * 
	 * @param adblSales - sales array
	 * 
	 * @return dblMinimum - minimum sale
	 */
	public static double MinimumSale(double[] adblSales) {
		// Declare variables.
		double dblMinimum = 0;
		int intIndex = 0;

		// This sets the minimum sale amount to the value in the first
		// position of the sale array.
		dblMinimum = adblSales[0];

		// This for loop cycles through the sale array until a minimum value
		// is found. Once the minimum value is found, and loop finishes,
		// the minimum value is stored in dblMinimum.
		for (intIndex = 0; intIndex < adblSales.length; intIndex += 1) {
			if (dblMinimum > adblSales[intIndex]) {
				dblMinimum = adblSales[intIndex];
			}
		}

		// This returns the minimum sale value in the array.
		return dblMinimum;
	}

	/**
	 * Method AverageSales
	 * 
	 * Abstract: This finds the average sales for the day.
	 * 
	 * @param adblSales - sales array
	 * @param dblTotal - total sales
	 * 
	 * @return dblMinimum - minimum sale
	 */
	public static double AverageSales(double[] adblSales, double dblTotal) {
		// Declare variable.
		double dblAverage = 0;

		// This calculates the average of the daily sales.
		dblAverage = dblTotal / adblSales.length;

		// This returns the average of the daily sales.
		return dblAverage;
	}

	/**
	 * Method EmployeeArray
	 * 
	 * Abstract: This creates the employee array, which will store the number of
	 * employees.
	 * 
	 * @return adblEmployees - employees array
	 */
	public static double[] EmployeeArray() {
		// Declare variable and array.
		int intNumberOfEmployees = 0;
		double adblEmployees[];

		// This do/while loop validates user input to make sure it's greater than 0.
		// The program prompts the user to enter the number of employees.
		do {
			System.out.print("Enter a positive number of employees: \n");
			intNumberOfEmployees = ReadIntegerFromUser();

		} while (intNumberOfEmployees <= 0);

		// This allocates space for the array.
		adblEmployees = new double[intNumberOfEmployees];

		// This returns the employee array.
		return adblEmployees;
	}

	/**
	 * Method CalculateCommission
	 * 
	 * Abstract: This calculates the total employee commission.
	 * 
	 * @param dblTotal - total sales
	 * 
	 * @return dblTotalCommission - total commission on sales
	 */
	public static double CalculateCommission(double dblTotal) {
		// Declare variable and constant.
		double dblTotalCommission = 0;
		final double dblCOMMISSION_RATE = 0.02;

		// This calculates the total employee commission.
		dblTotalCommission = dblTotal * dblCOMMISSION_RATE;

		// This returns the total employee commission.
		return dblTotalCommission;
	}

	/**
	 * Method CalculatePerEmployeeCommission
	 * 
	 * Abstract: This calculates the commission per employee.
	 * 
	 * @param adblEmployees - sales array
	 * @param dblTotalCommission - total commission on sales
	 * 
	 * @return dblPerEmployeeCommission - commission per employee
	 */
	public static double CalculatePerEmployeeCommission(double[] adblEmployees, double dblTotalCommission) {
		// Declare variable and array.
		double dblPerEmployeeCommission = 0;

		// This calculates the per employee commission.
		dblPerEmployeeCommission = dblTotalCommission / adblEmployees.length;

		// This returns the per employee commission.
		return dblPerEmployeeCommission;
	}

	/**
	 * Method ReadIntegerFromUser
	 * 
	 * Abstract: Read an integer from the user.
	 * 
	 * @return intValue - user-inputted value
	 */
	public static int ReadIntegerFromUser() {

		int intValue = 0;

		try {
			String strBuffer = "";

			// Input stream
			BufferedReader burInput = new BufferedReader(new InputStreamReader(System.in));

			// Read a line from the user
			strBuffer = burInput.readLine();

			// Convert from string to integer
			intValue = Integer.parseInt(strBuffer);
		} catch (Exception excError) {
			System.out.println(excError.toString());
		}

		// Return integer value
		return intValue;
	}

	/**
	 * Method ReadFloatFromUser
	 * 
	 * Abstract: Read a float from the user.
	 * 
	 * @return user-inputted value
	 */
	public static float ReadFloatFromUser() {

		float sngValue = 0;

		try {
			String strBuffer = "";

			// Input stream
			BufferedReader burInput = new BufferedReader(new InputStreamReader(System.in));

			// Read a line from the user
			strBuffer = burInput.readLine();

			// Convert from string to float
			sngValue = Float.parseFloat(strBuffer);
		} catch (Exception excError) {
			System.out.println(excError.toString());
		}

		// Return float value
		return sngValue;
	}

}
