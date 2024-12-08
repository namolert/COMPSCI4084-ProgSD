package boxOffice;

public class Seat {

    // TODO complete this class according to the specification
    private char row;
    private int seatNum;
    private SeatType seatType;
    private boolean availability;

    public Seat(char row, int seatNum, SeatType seatType) {
        // TODO complete this method
        if (row < 'A' || row > 'Z') {
            throw new IllegalArgumentException("Row must be a capital letter from A to Z.");
        }
        if (seatNum <= 0) {
            throw new IllegalArgumentException("Seat number must be a positive integer.");
        }

        this.row = row;
        this.seatNum = seatNum;
        this.seatType = seatType;
        this.availability = false;
    }

    public void setRow(char row) {
        this.row = row;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public char getRow() {
        return this.row;
    }

    public int getSeatNum() {
        return this.seatNum;
    }

    public SeatType getSeatType() {
        return this.seatType;
    }

    public boolean getAvailability() {
        return this.availability;
    }

    // Override toString() to display seat information
    @Override
    public String toString() {
        return "Seat: " + row + seatNum + " (" + seatType + "), Available: " + availability;
    }

}