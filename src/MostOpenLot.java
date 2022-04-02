import java.util.Scanner;

public class MostOpenLot {

	public static void main(String[] args) {
		ParkingAPI parkingAPI = new ParkingAPI();
		
		Scanner input = new Scanner(System.in);
		String response = "";
		boolean chosen = false;
		System.out. println("Hello, would you like to see the parking lot with the most current open spaces or predicted open spaces?"
				+ "\nPlease enter current or predicted");
		
		while(!chosen) {
			response = input.nextLine();
			if (response.equalsIgnoreCase("current")) {
				System.out.println("The parking lot with the most empty spaces is " + 
						parkingAPI.availableParkingLots(
						parkingAPI.availableParkingLots(ParkingLot.WHITTNEY_LOT, ParkingLot.NORTH_LOT), 
						ParkingLot.SOUTH_LOT));
				chosen = true;
			}
			else if (response.equalsIgnoreCase("predicted")) {
				System.out.println("The parking lot with the most predicted empty spaces is " + 
						parkingAPI.predictedOpenSpots(
						parkingAPI.predictedOpenSpots(ParkingLot.NORTH_LOT,ParkingLot.SOUTH_LOT), 
						ParkingLot.WHITTNEY_LOT)
						);
				chosen = true;
			}
			else {
				System.out.println("Inavlid response please try again");
			}
		}
		
		

		
	}
}
