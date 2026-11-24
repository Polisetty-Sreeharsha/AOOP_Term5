class ParkingSpotBasic {

    int spotId;
    String location;
    boolean available;

    void displayDetails() {
        System.out.println("Spot ID: " + spotId);
        System.out.println("Location: " + location);
        System.out.println("Available: " + available);
    }

    public static void main(String[] args) {

        ParkingSpotBasic p1 = new ParkingSpotBasic();

        p1.spotId = 101;
        p1.location = "Hyderabad";
        p1.available = false;

        p1.displayDetails();
    }
}