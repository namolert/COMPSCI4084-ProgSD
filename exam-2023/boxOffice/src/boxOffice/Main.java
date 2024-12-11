package boxOffice;

public class Main {
    public static void main(String[] args) {
        Seat s1 = new Seat('R', 77, SeatType.STANDARD);
        System.out.println(s1);

        String userInput = "3\nS D D S\nD D D\nS S S S S S";
        Venue v = new Venue(userInput);
        System.out.println(v.getSeat('A', 1));
    }
}
