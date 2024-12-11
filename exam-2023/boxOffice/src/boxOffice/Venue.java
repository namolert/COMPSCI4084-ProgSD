package boxOffice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Venue {
    private List<List<Seat>> seatList;
    private int rowCount;

    public Venue(String userInput) {
        this.seatList = new ArrayList<>();
        String[] rowArray = userInput.split("\n");
        this.rowCount = Integer.parseInt(rowArray[0]);
        String[] subRowArray = Arrays.copyOfRange(rowArray, 1, rowArray.length);
        int n = 0;
        for (String rowEach : subRowArray) {
            String[] rowEachArray = rowEach.split(" ");
            List<Seat> seatListEach = new ArrayList<Seat>();
            char rowAlpha = (char) (n + 'A');
            SeatType seatTypeEach = SeatType.STANDARD;
            for (int i = 0; i < rowEachArray.length; i++) {
                if (rowEachArray[i].equals("D")) {
                    seatTypeEach = SeatType.DELUXE;
                }
                Seat s = new Seat(rowAlpha, i + 1, seatTypeEach);
                seatListEach.add(s);
            }
            this.seatList.add(seatListEach);
            n++;
        }
    }

    public int getRowCount() {
        return this.rowCount;
    }

    public List<List<Seat>> getSeatList() {
        return this.seatList;
    }

    public Seat getSeat(char row, int seatNum) {
        if (row < 'A' || row > 'Z') {
            throw new IllegalArgumentException("Row out of range");
        }
        if (seatNum <= 0) {
            throw new IllegalArgumentException("Seat number out of range");
        }
        return this.seatList.get(row - 'A').get(seatNum - 1);
    }

    public void printDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String result = "";
        for (List<Seat> rowEachList : this.seatList) {
            String re = "";
            for (Seat s : rowEachList) {
                re = re + s + ", ";
            }
            result = result + re + "\n";
        }
        return result;
    }
}
