package boxOffice;

public class Seat {

    // TODO complete this class according to the specification
    private char row;
    private int seatNumber;
    private SeatType seatType;
    private boolean availability;

    public Seat(char row, int seatNumber, SeatType seatType) {
        if (row < 'A' || row > 'Z') {
            throw new IllegalArgumentException("Row out of range");
        }
        if (seatNumber <= 0) {
            throw new IllegalArgumentException("Seat number out of range");
        }
        this.row = row;
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.availability = true;
    }

    public char getRow() {
        return this.row;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public SeatType getSeatType() {
        return this.seatType;
    }

    public boolean getAvailability() {
        return this.availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Row: " + this.row + "\nSeat Number: " + this.seatNumber + "\nSeat Type: " + this.seatType
                + "\nAvailability: " + this.availability;
    }
}