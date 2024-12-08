package BinPacking;

import java.util.ArrayList;
import java.util.List;

public class Bin {
    public int capacity;
    public List<Integer> weights;

    public Bin(int capacity) {
        this.capacity = capacity;
        this.weights = new ArrayList<Integer>();
    }

    public void store(int weight) throws IllegalArgumentException {
        this.weights.add(weight);
    }

    public int getSpace() {
        int totalWeight = 0;
        for (int eachWeight : weights) {
            totalWeight += eachWeight;
        }
        return capacity - totalWeight;
    }
}
