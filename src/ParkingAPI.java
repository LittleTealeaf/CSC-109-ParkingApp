import java.util.Random;

public class ParkingAPI {

	public ParkingAPI() {

	}

	public int getOpenSpots(ParkingLot parkingLot) {
		Random random = new Random(parkingLot.ordinal());
		return random.nextInt(110);
	}

	/**
	 * Gets the future predicted open parking spots
	 * @param parkingLot The parking lot to check
	 * @return The predicted open parking spots in the lot
	 */
	public int getPredictedOpenSpots(ParkingLot parkingLot) {
		Random random = new Random(parkingLot.ordinal() + 100);
		int current = getOpenSpots(parkingLot);
		int bound = (int) (Math.min(current,parkingLot.totalParkingSpots - current) * 3 / 4);
		
		return current + random.nextInt(-bound,bound);
	}
	
	public int getFilledSpots(ParkingLot parkingLot) {
		int numberOfSpots = parkingLot.totalParkingSpots;
		int spots =  numberOfSpots - getOpenSpots(parkingLot);
		return spots;
	}

	/**
	 * Gets the future predicted closed parking spots
	 * @param parkingLot The parking lot to check
	 * @return The predicted closed parking spots in the lot
	 */
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
