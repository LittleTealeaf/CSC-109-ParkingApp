
public class MostOpenLot {

	public static void main(String[] args) {
		ParkingAPI parkingAPI = new ParkingAPI();
		
		
		System.out.println(
		parkingAPI.availableParkingLots(
				parkingAPI.availableParkingLots(ParkingLot.WHITTNEY_LOT, ParkingLot.NORTH_LOT), 
				ParkingLot.SOUTH_LOT));
		
		System.out.println(parkingAPI.predictedOpenSpots(
				parkingAPI.predictedOpenSpots(ParkingLot.NORTH_LOT,ParkingLot.SOUTH_LOT), 
				ParkingLot.WHITTNEY_LOT)
				);
		
	}
}
