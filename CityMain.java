package smartcity;

import java.util.Scanner;


public class CityMain extends CityApp {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("=======================================================================================================================");
		System.out.println("==============================================Welcome to Smart City====================================================");
		System.out.println("=======================================================================================================================");
		String ch;
		CityApp app=new CityApp();
		do
		{
		
		System.out.println("\t\t 1)viewAllCityInfo.\r\n"
				+ "\t\t 2)viewCityInfoByName.\r\n"
				+ "\t\t 3)displayCityShoppingMalls.\r\n"
				+ "\t\t 4)displayCityHotels.\r\n"
				+ "\t\t 5)displayCityTranspotation.\r\n"
				+ "\t\t 6)displayCityAirTicketBooking.\r\n");
		System.out.println("===============================================================================================================================================================");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		
		case 1:	app.viewAllCityInfo();
				break;
		case 2:	app.viewCityInfoByName();
		break;
		
		case 3:	app.displayCityShoppingMalls();
		break;
		
		case 4:	app.displayCityHotels();
		break;
		
		case 5:	app.displayCityTranspotation();
		break;
		
		case 6:	app.displayCityAirTicketBooking();
		break;
		
		
		
	    default:System.out.println("Wrong choice!!"); 		   
		
	    
	    
		}
		
		System.out.println("Do you want to continue? (Y-Yes / N-No)");
		 ch=sc.next();
		}
		while(ch.equalsIgnoreCase("Y")||ch.equalsIgnoreCase("y"));
		System.out.println("===============================================================================================================================================================");

		System.out.println("Bye....");
	
		System.out.println("=================================================================================================================================================================");


	}

}