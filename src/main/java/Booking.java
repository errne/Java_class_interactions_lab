public class Booking {
    private Bedroom bed;
    private int nights;
    private Guest guest;

    public Booking(Bedroom bed, int nights, Guest guest) {
        this.bed = bed;
        this.nights = nights;
        this.guest = guest;
    }

    public Bedroom getBed() {
        return bed;
    }

    public Guest getGuest() {
        return guest;
    }

    public int getNights() {
        return nights;
    }

    public int getBill() {
        return nights*bed.getRate();
    }
}
