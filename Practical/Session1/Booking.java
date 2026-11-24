class Booking {

    private int bookingId;
    private String status;
    private int startTime;
    private int endTime;

    Booking(
            int bookingId,
            int startTime,
            int endTime) {

        if (bookingId <= 0) {
            throw new IllegalArgumentException(
                    "Invalid Booking ID");
        }

        if (endTime <= startTime) {
            throw new IllegalArgumentException(
                    "End time must be greater");
        }

        this.bookingId = bookingId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = "CREATED";
    }

    void confirmBooking() {

        if (!status.equals("CREATED")) {
            throw new IllegalStateException();
        }

        status = "CONFIRMED";
    }

    void activateBooking() {

        if (!status.equals("CONFIRMED")) {
            throw new IllegalStateException();
        }

        status = "ACTIVE";
    }

    void completeBooking() {

        if (!status.equals("ACTIVE")) {
            throw new IllegalStateException();
        }

        status = "COMPLETED";
    }

    void displayStatus() {

        System.out.println("Booking ID: " + bookingId);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {

        Booking b1 = new Booking(501, 10, 12);

        b1.confirmBooking();
        b1.activateBooking();
        b1.completeBooking();

        b1.displayStatus();
    }
}