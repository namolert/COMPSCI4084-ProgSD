package boxOffice;

public class Event {
    private Venue venue;
    private int standardTicketPrice;
    private int deluxeTicketPrice;

    public Event(Venue venue, int standardTicketPrice, int deluxeTicketPrice) {
        this.venue = venue;
        this.standardTicketPrice = standardTicketPrice;
        this.deluxeTicketPrice = deluxeTicketPrice;
    }

    public int reserveSeats(int numSeats, SeatType seatType) {
        for (char row = 'A'; row < 'A' + this.venue.getNumRows(); row++) {
            int consecutiveSeat = 0;
            int startSeatIndex = -1;

        }
        return -1;
    }

    public void returnSeat(char row, int seatNum) {

    }
}
