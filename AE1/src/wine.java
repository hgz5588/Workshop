import java.util.Scanner;

public class wine {
	public String wineName;
	public int wineQuantity;
	public double winePrice;
	
	public void wineInformation(){
		
			Scanner s = new Scanner(System.in);
							
			System.out.println("Please enter number(-ve for returns)");
			wineQuantity = s.nextInt();
			//Enter the wine quantity
			
			System.out.println("Please enter price per bottle:");
			winePrice = s.nextDouble();	
			//Enter the per price of wine
			return;
	}
				
}
