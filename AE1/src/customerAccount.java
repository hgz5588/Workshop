
import java.util.Scanner;

public class customerAccount {
	
	public String customerName ;
	public double customerBalance ;
	
	
	public void customerInformation(){
		
		Scanner s = new Scanner(System.in);				
		
		System.out.println("Customer name:");
		customerName = s.nextLine();
		//Enter the account name
		
		System.out.println("Customer balance:");
		customerBalance = s.nextDouble();
		//Enter the account balance
	}
	
	
}
