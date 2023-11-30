package smartcity;

import java.util.ArrayList;
import java.util.Scanner;




public class CityApp  {
	
	static Scanner sc=new Scanner(System.in);

		 static ArrayList<City> citylist=new ArrayList<City>();
	CityApp(){
	citylist.add(new City("Hyderabad", "Royalton,Taj Falaknuma,ITC Kohenur, Hotel Grand, Amrutha castle","MJBS,JBS,Dilshuknagar,LB Nagar, Kachiguda,Koti","Rajiv Gandhi Internatioanal Airport,Begumpet Airport","GVK, City Center, Inorbit, Sarath City Capital, Next Galleria"));
	
	citylist.add(new City("Bangalore", "Hotel City Meridian, Tulip villa By Orbit, Citrine,Prestige Residency","Kempegowda,Banashankari, APSRTC, Shivajinagar","Kempegowda,Hindustan,Mysuru,Bidar,Mangaluru","Central, Gopalan,Elements, GT World Mall,Elements, GT World, Park Square"));
	
	citylist.add(new City("Chennai","Taj Club,Radisson Blu,Peace Inn,Royal,Samudra Residency, The Park Chennai","Koyambedu,T Nagar,Central Station, Inter State Bus","Chennai International,Madurai,Puducherry","Nexus Vijaya, VR, Grand Square,Grand Square, Challa Mall"));
	
	citylist.add(new City("Pune","Hotal anvisha executive, FabHotal Gargi Deluxe, Pratikruti The Lakeview Resort","Shivaji, Pune, Pune Manapa, Shastri Nagar","Hadapsar, Pune International,New Pune International","Amanora,Seasons,The Pavillion,Westend"));
	
	citylist.add(new City("New Delhi","The Suryaa New Delhi,The Ashok, Hotel Oscar,Hotal BajRang,Hotal Star Paradise","Kendriya,Shivaji Stadium ,Malviya Nagar,Vasant Vihar","Indira Gandhi International, Delhi, Safdarjung","Pacific, Vasant Square, DLF Promenade,City Sqaure"));
	}
	public void viewAllCityInfo()
	{   		
		System.out.println("==================================================================================================");

		if(citylist.size()==0)
		{
			System.out.println("No record found!!");
		}
		
		
		for(City c:citylist)
		{
			
				System.out.println("City:"+c.getName()+"\t Hotels:"+c.getHotel()+"\t Transpotation:"+c.getTranspotation()+"\t AirTicketBooking:"+c.getAirTicketrBooking()+"\t ShoppingMalls:"+c.getShoppingMalls());
			
		}
		System.out.println("=====================================================================================================================================================================================================================");

	}
	public void viewCityInfoByName() 
	{
		System.out.println("Enter City Name:");
		String cityName=sc.nextLine();//101
	    int flag=0;
		System.out.println("=====================================================================================================================================================================================================================");

		for(City c:citylist)
		{
			if(cityName.equalsIgnoreCase( c.getName()))//101==101
			{   flag=1;
			System.out.println("City:"+c.getName()+"\t Hotels:"+c.getHotel()+"\t Transpotation:"+c.getTranspotation()+"\t AirTicketBooking:"+c.getAirTicketrBooking()+"\t ShoppingMalls:"+c.getShoppingMalls());
			}
		}
		
		if(flag==0)
			System.out.println("City does not exist!!");
		System.out.println("==================================================================================================================================================================================================================");
	
	}
	public void displayCityShoppingMalls() {
		System.out.println("Enter City Name:");
		String cityName=sc.nextLine();
		 int flag=0;
			System.out.println("=============================================================================================================================================================================================================");

			for(City c:citylist)
			{
				if(cityName.equalsIgnoreCase( c.getName()))//101==101
				{   flag=1;
				System.out.println("City:"+c.getName()+"\t ShoppingMalls:"+c.getShoppingMalls());
				}
			}
			
			if(flag==0)
				System.out.println("City does not exist!!");
			System.out.println("=============================================================================================================================================================================================================");
		
		}
	
	
	public void displayCityHotels() {
		System.out.println("Enter City Name:");
		String cityName=sc.nextLine();
		 int flag=0;
			System.out.println("=============================================================================================================================================================================================================");

			for(City c:citylist)
			{
				if(cityName.equalsIgnoreCase( c.getName()))//101==101
				{   flag=1;
				System.out.println("City:"+c.getName()+"\t Hotels:"+c.getHotel());
				}
			}
			
			if(flag==0)
				System.out.println("City does not exist!!");
			System.out.println("=============================================================================================================================================================================================================");
		
		}
	
	public void displayCityTranspotation() {
		System.out.println("Enter City Name:");
		String cityName=sc.nextLine();
		 int flag=0;
			System.out.println("=============================================================================================================================================================================================================");

			for(City c:citylist)
			{
				if(cityName.equalsIgnoreCase( c.getName()))//101==101
				{   flag=1;
				System.out.println("City:"+c.getName()+"\t Transpotation:"+c.getTranspotation());
				}
			}
			
			if(flag==0)
				System.out.println("City does not exist!!");
			System.out.println("=============================================================================================================================================================================================================");
		
		}
	
	public void displayCityAirTicketBooking() {
		System.out.println("Enter City Name:");
		String cityName=sc.nextLine();
		 int flag=0;
			System.out.println("=============================================================================================================================================================================================================");

			for(City c:citylist)
			{
				if(cityName.equalsIgnoreCase( c.getName()))//101==101
				{   flag=1;
				System.out.println("City:"+c.getName()+"\t  AirTicketBooking:"+c.getAirTicketrBooking());
				}
			}
			
			if(flag==0)
				System.out.println("City does not exist!!");
			System.out.println("=============================================================================================================================================================================================================");
		
		}
	
	
	}
	



