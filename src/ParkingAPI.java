import java.util.Random;

public class ParkingAPI {

	public ParkingAPI() {

	}

	public int getOpenSpots(ParkingLot parkingLot) {
		Random random = new Random(parkingLot.ordinal());
		return random.nextInt(110);
	}
	
	public int getFilledSpots(ParkingLot parkingLot) {
		
		int spots =  ParkingLot - getFilledSpots(parkingLot);
		return spots;
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
