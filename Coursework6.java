import java.util.*;
class Coursework6{
	
	public static void HomePage(){
	
		System.out.println("\t\t\t\t\t\t __  ______  ________ ________");
		System.out.println("\t\t\t\t\t\t|  \\/      \\|        |        \\");
		System.out.println("\t\t\t\t\t\t \\$|  $$$$$$| $$$$$$$$\\$$$$$$$$");
		System.out.println("\t\t\t\t\t\t|  | $$   \\$| $$__      | $$");
		System.out.println("\t\t\t\t\t\t| $| $$     | $$  \\     | $$");
		System.out.println("\t\t\t\t\t\t| $| $$   __| $$$$$     | $$");
		System.out.println("\t\t\t\t\t\t| $| $$__/  | $$_____   | $$");
		System.out.println("\t\t\t\t\t\t| $$\\$$    $| $$     \\  | $$");
		System.out.println("\t\t\t\t\t\t \\$$ \\$$$$$$ \\$$$$$$$$   \\$$");
		
		System.out.println("\n\n  _______             _   _      _____              _         _____   _    _   _                   _______    ____    _____");
		System.out.println(" |__   __|    /\\     \\ \\ / /    / ____|     /\\     | |       / ____| | |  | | | |          /\\     |__   __|  / __ \\  |  __ \\ ");
		System.out.println("    | |      /  \\     \\ V /    | |         /  \\    | |      | |      | |  | | | |         /  \\       | |    | |  | | | |__) |");
		System.out.println("    | |     / /\\ \\     > <     | |        / /\\ \\   | |      | |      | |  | | | |        / /\\ \\      | |    | |  | | |  _  /");
		System.out.println("    | |    / ____ \\   / . \\    | |____   / ____ \\  | |____  | |____  | |__| | | |____   / ____ \\     | |    | |__| | | | \\ \\ ");
		System.out.println("    |_|   /_/    \\_\\ /_/ \\_\\    \\_____| /_/    \\_\\ |______|  \\_____|  \\____/  |______| /_/    \\_\\    |_|     \\____/  |_|  \\_\\ ");
		
		System.out.println("\n\n==================================================================================================================================");
		System.out.println("\n\n\n\t[1] Withholding Tax\n");
		System.out.println("\t[2] Payable Tax\n");
		System.out.println("\t[3] Income Tax\n");
		System.out.println("\t[4] Social Security Contribution Levy (SSCL) Tax\n");
		System.out.println("\t[5] Leasing Payment\n");
		System.out.println("\t[6] Exit\n");
		
	}
	
	public static void WithHolding(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n+---------------------------------------------------------------+");
		System.out.println("|                        WITHHOLDING TAX                        |");
		System.out.println("+---------------------------------------------------------------+");
		
		System.out.println("\n\t[1] Rent Tax\n");
		System.out.println("\t[2] Bank Interest Tax\n");
		System.out.println("\t[3] Dividend Tax\n");
		System.out.println("\t[4] Exit\n");
		
		while (true){
			try{
				System.out.print("\nEnter an option to continue -> ");
				int option = input.nextInt();
			}catch (Exception e){
				System.out.println("\nInvalid option.");
				input.next();
			}
		}
	}
	
	public static String ReEnter(){
		Scanner input = new Scanner(System.in);
		String WantReEnter = null;
		System.out.println("\n\tInvalid input....");
		
		while (WantReEnter.equals("y") || WantReEnter.equals("n")){
			System.out.print("Do you want to enter the correct value again (Y/N) : ");
			WantReEnter = input.next().toLowerCase();
		}
		return WantReEnter;
	}
	
	public static void RentTax(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n+---------------------------------------------------------------+");
		System.out.println("|                               RENT TAX                        |");
		System.out.println("+---------------------------------------------------------------+\n");
		
		while (true){
			double tax = 0;
			try{
				System.out.print("Enter your rent      : ");
				double rent = input.nextDouble();
				if (rent > 0){
					if (rent <= 100000){
						System.out.println("\nYou don't have to pay Rent Tax...");
					}else{
						tax += rent * 0.1;
						System.out.println("\nYou have to pay Rent Tax    : " + tax);
					}
				}else{
					ReEnter();
					if (WantReEnter.equals("y")){
						RentTax();
					}else{
						break;
					}
				}
			}catch (Exception e){
				ReEnter();
				if (WantReEnter.equals("y")){
					RentTax();
				}else{
					break;
				}
			}
		}
		
	}
	
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		HomePage();
		
		while (true){
			try{
				System.out.print("\nEnter an option to continue -> ");
				int option = input.nextInt();
				
				switch (option){
					case 1:
						WithHolding();
						break;
					default:
						System.out.println("Invalid option.");
				}
			}catch (Exception e){
				System.out.println("\nInvalid input.Please re-enter your option.");
				input.next();
			}
		}
	}
}
