import java.util.Random;

public class ParkingAPI {

	public ParkingAPI() {

	}

	public int getOpenSpots(ParkingLot parkingLot) {
		Random random = new Random(parkingLot.ordinal());
		return random.nextInt(110);
	}
	
	public int getFilledSpots(ParkingLot parkingLot) {
		Random random = new Random(parkingLot.ordinal());
		return random.nextInt(110);
	}

	public ParkingLot availableParkingLots(ParkingLot one, ParkingLot two) {
		int availableLotOne = getOpenSpots(one) - getFilledSpots(one);
		int availableLotTwo = getOpenSpots(two) - getFilledSpots(two);
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
