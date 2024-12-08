package boxOffice;

public class Main {
    public static void main(String[] args) {
        Seat s = new Seat('P', 11, SeatType.STANDARD);
        System.out.println(s.getRow());

        Venue v = new Venue("3\n" + //
                "S D D S\n" + //
                "D D D\n" + //
                "S S S S S S");
        v.printDetails();

    }
}
