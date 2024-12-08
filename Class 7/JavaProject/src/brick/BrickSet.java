package brick;

public class BrickSet {
    private int number;
    private String name;
    private String theme;
    private int numberOfPieces;
    private double retailPrice;

    public BrickSet(int number, String name, String theme, int numberOfPieces, double retailPrice) {
        this.number = number;
        this.name = name;
        this.theme = theme;
        this.numberOfPieces = numberOfPieces;
        this.retailPrice = retailPrice;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getTheme() {
        return this.theme;
    }

    public int numberOfPieces() {
        return this.numberOfPieces;
    }

    public double getRetaliPrice() {
        return this.retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    @Override
    public String toString() {
        return "Number: " + this.number + "\nName: " + this.name + "\nTheme: " + this.theme + "\nNumber of Pieces: "
                + this.numberOfPieces + "\nRetail Price: " + this.retailPrice;
    }
}
