import java.util.Random;

public class ParkingAPI {


    public ParkingAPI() {

    }

    public int getOpenSpots(ParkingLot parkingLot) {
        Random random = new Random(parkingLot.ordinal());
        return random.nextInt(110);
    }
    
    
}