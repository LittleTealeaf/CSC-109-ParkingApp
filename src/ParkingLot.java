public enum ParkingLot {
	// I don't actually know the actual size, we're just going to guess here
    NORTH_LOT(250),SOUTH_LOT(150),WHITTNEY_LOT(175);
    
    public final int totalParkingSpots;
	
	ParkingLot(int value){
		totalParkingSpots = value;
	}
	
}
