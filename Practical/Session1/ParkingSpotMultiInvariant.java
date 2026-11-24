class ParkingSpotMultiInvariant {

    private int spotId;
    private String location;
    private boolean available;
    private String vehicleNumber;

    ParkingSpotMultiInvariant(
            int spotId,
            String location) {

        if (spotId <= 0) {
            throw new IllegalArgumentException(
                    "Invalid Spot ID");
        }

        this.spotId = spotId;
        this.location = location;
        this.available = false;
    }

    void parkVehicle(String vehicleNumber) {

        if (!available) {
            throw new IllegalStateException(
                    "Already occupied");
        }

        if (vehicleNumber == null ||
                vehicleNumber.isBlank()) {

            throw new IllegalArgumentException(
                    "Vehicle number required");
        }

        this.vehicleNumber = vehicleNumber;
        this.available = false;
    }

    void displayDetails() {

        System.out.println("Spot ID: " + spotId);
        System.out.println("Location: " + location);
        System.out.println("Available: " + available);
        System.out.println("Vehicle: " + vehicleNumber);
    }

    public static void main(String[] args) {

        ParkingSpotMultiInvariant p1 =
                new ParkingSpotMultiInvariant(
                        101,
                        "Hyderabad");

        p1.parkVehicle("TS09AB1234");

        p1.displayDetails();
    }
}