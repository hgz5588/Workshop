import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AssEx1 {

	public static String addUnit(double money) {
		// Create a method of adding GBP, converting the double to the string
		String withUints;
		if (money >= 0) {

			withUints = ("￡" + String.format("%.2f", money));
		} else {
			withUints = ("-￡" + String.format("%.2f", money * -1));
		}
		return withUints;
		// Return the output variable of String

	}

	public static void main(String[] args) throws Throwable {

		customerAccount a1 = new customerAccount();
		a1.customerInformation();
		// Call the customerAccount object
		double initialBalance = a1.customerBalance;
		// Set the initialBalance

		System.out.println("Welcome " + a1.customerName + ". Your balance is " + addUnit(initialBalance) + ".\n");
		// Display the customer account information and only once

		FileWriter fw = null;

		try {
			fw = new FileWriter("statement.txt", true);
			fw.write("Customer name: " + a1.customerName + " ,Initial balance: " + addUnit(initialBalance) + "\n");
			// Write file and display account information in the first line and only once

		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

				wine w1 = new wine();
				// Call the wine object

				Scanner s = new Scanner(System.in);

				for (;;) {
					// Loop until wineName equals null
					System.out.println("Please enter wine name");
					w1.wineName = s.nextLine();
					// Enter the name of the wine

					if (!w1.wineName.equals("")) {
						// Determine if the input is not the null

						w1.wineInformation();
						// Call the method of wine object

						if (w1.wineQuantity >= 0) {
							a1.customerBalance += w1.wineQuantity * w1.winePrice;

							System.out.println(
									a1.customerName + ". Your balance is " + addUnit(a1.customerBalance) + ".\n");
						} else {
							a1.customerBalance += 0.8 * w1.wineQuantity * w1.winePrice;

							System.out.println(
									a1.customerName + ". Your balance is " + addUnit(a1.customerBalance) + ".\n");
						}
						// Determine positive and negative values and update the current account
						// information

						try {
							fw = new FileWriter("statement.txt", true);

							fw.write("Wine name: " + w1.wineName + " ,Wine cost: " + addUnit(w1.winePrice)
									+ " ,Wine quantity: " + w1.wineQuantity + " ,transaction cost: "
									+ addUnit(w1.winePrice * w1.wineQuantity) + " ,new balance: "
									+ addUnit(a1.customerBalance) + "\n");
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						} finally {
							if (fw != null) {
								try {
									fw.close();
								} catch (IOException e) {
									e.printStackTrace();
								}
							}

						}
						// Write wine information in file
					} else {
						break;
						// Jump out of the loop if the input is empty
					}

				}

			}

		}
	}
}
