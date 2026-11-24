class ParkingSpotSingleInvariant {

    private int spotId;

    ParkingSpotSingleInvariant(int spotId) {

        if (spotId <= 0) {
            throw new IllegalArgumentException(
                    "Spot ID must be positive");
        }

        this.spotId = spotId;
    }

    void displayDetails() {
        System.out.println("Spot ID: " + spotId);
    }

    public static void main(String[] args) {

        ParkingSpotSingleInvariant p1 =
                new ParkingSpotSingleInvariant(-101);

        p1.displayDetails();
    }
}