import java.util.Random;

public class ParkingAPI {

	public ParkingAPI() {

	}

	public int getOpenSpots(ParkingLot parkingLot) {
		Random random = new Random(parkingLot.ordinal());
		return random.nextInt(110);
	}

	public int getPredictedOpenSpots(ParkingLot parkingLot) {
		Random random = new Random(parkingLot.ordinal() + 100);

		return random.nextInt(parkingLot.totalParkingSpots);
	}
	
	public int getFilledSpots(ParkingLot parkingLot) {
		int numberOfSpots = parkingLot.totalParkingSpots;
		int spots =  numberOfSpots - getOpenSpots(parkingLot);
		return spots;
	}

	public int getPredictedClosedSpots(ParkingLot parkingLot) {
		return parkingLot.totalParkingSpots - getPredictedOpenSpots(parkingLot);
	}

	public ParkingLot availableParkingLots(ParkingLot one, ParkingLot two) {
		int availableLotOne = getFilledSpots(one);
		int availableLotTwo =  getFilledSpots(two);
		if (availableLotOne > availableLotTwo) {
			return one;
		} else if (availableLotOne < availableLotTwo) {
			return two;
		} else {
			System.out.println("Both lots are full..");
			return null;
		}
	}
}
