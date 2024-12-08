package brick;

public class Main {
    public static void main(String[] args) {
        BrickSet b = new BrickSet(1, "Barbies", "Princess", 10, 9.34);
        System.out.println(b);

        WishList myList = new WishList();
        myList.addSet(b);
        System.out.println(myList);
    }
}
