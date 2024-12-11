package boxOffice;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private Venue venue;
    private int standardPrice;
    private int deluxePrice;

    public Event(Venue venue, int standardPrice, int deluxePrice) {
        this.venue = venue;
        this.standardPrice = standardPrice;
        this.deluxePrice = deluxePrice;
    }

    public int reserveSeats(int numSeats, SeatType seatType) {
        for (List<Seat> row : this.venue.getSeatList()) {
            int consecutiveSeats = 0;
            List<Seat> selectedSeats = new ArrayList<>();
            for (Seat seat : row) {
                if (seat.getSeatType() == seatType && seat.getAvailability()) {
                    consecutiveSeats++;
                    selectedSeats.add(seat);
                    if (consecutiveSeats == numSeats) {
                        for (Seat s : selectedSeats) {
                            s.setAvailability(false);
                        }
                        int price = (seatType == SeatType.STANDARD)
                                ? standardPrice * numSeats
                                : deluxePrice * numSeats;
                        return price;
                    }
                } else {
                    consecutiveSeats = 0;
                    selectedSeats.clear();
                }
            }
        }
        return -1;
    }

    public void returnSeat(char row, int seatNum) {
        try {
            Seat seat = venue.getSeat(row, seatNum);
            if (!seat.getAvailability()) {
                seat.setAvailability(true);
            } else {
                throw new IllegalArgumentException("Seat is already available.");
            }
        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid row or seat number.", e);
        }
    }

    @Override
    public String toString() {
        return venue.toString();
    }
}
