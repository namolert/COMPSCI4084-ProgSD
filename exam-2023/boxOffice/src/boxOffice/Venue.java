package boxOffice;

import java.util.ArrayList;
import java.util.List;

public class Venue {
    private List<List<Seat>> seats;
    private int numRows = 0;

    public Venue(String seatConfig) {
        seats = new ArrayList<>();
        String[] lines = seatConfig.split("\n");
        this.numRows = Integer.parseInt(lines[0]);

        for (int i = 1; i < lines.length; i++) {
            char rowLetter = (char) ('A' + i - 1); // Calculate the row letter
            String[] seatTypes = lines[i].split(" "); // Split the seat types by space
            List<Seat> rowSeats = new ArrayList<>();

            // Create a Seat object for each seat in the row
            for (int j = 0; j < seatTypes.length; j++) {
                SeatType seatType;
                if (seatTypes[j].equals("S")) {
                    seatType = SeatType.STANDARD;
                } else if (seatTypes[j].equals("D")) {
                    seatType = SeatType.DELUXE;
                } else {
                    throw new IllegalArgumentException("Invalid seat type: " + seatTypes[j]);
                }
                rowSeats.add(new Seat(rowLetter, j + 1, seatType));
            }
            seats.add(rowSeats);
        }
    }

    public Seat getSeat(char row, int seatNum) {
        int rowIndex = row - 'A';
        if (rowIndex < 0 || rowIndex >= seats.size()) {
            throw new IllegalArgumentException("Invalid row: " + row);
        }

        List<Seat> rowSeats = seats.get(rowIndex);
        if (seatNum < 1 || seatNum > rowSeats.size()) {
            throw new IllegalArgumentException("Invalid seat number: " + seatNum);
        }

        return rowSeats.get(seatNum - 1);
    }

    public void printDetails() {
        for (int i = 0; i < seats.size(); i++) {
            char rowLetter = (char) ('A' + i);
            List<Seat> rowSeats = seats.get(i);
            System.out.print("Row " + rowLetter + ": ");
            for (Seat seat : rowSeats) {
                System.out.print(seat.getSeatType() + " ");
            }
            System.out.println();
        }
    }

    public int getNumRows() {
        return this.numRows;
    }
}
