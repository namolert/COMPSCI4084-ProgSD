package brick;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class WishList {
    private List<BrickSet> brickList;

    public WishList() {
        this.brickList = new ArrayList<>();
    }

    public Collection<BrickSet> getSets() {
        this.brickList.sort(Comparator.comparingInt(brickList -> brickList.getNumber()));
        return this.brickList;
    }

    public boolean addSet(BrickSet set) {
        if (!brickList.contains(set)) {
            brickList.add(set);
            return true;
        }
        return false;
    }

    public boolean removeSet(BrickSet set) {
        if (brickList.contains(set)) {
            brickList.remove(set);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "";
        for (BrickSet b : this.brickList) {
            s = s + b.getName() + ", ";
        }
        return s;
    }
}
