import java.util.ArrayList;

public class River {

    private ArrayList<Fish> fish;

//    type = Fish variable = fish

    public River() {
        this.fish = new ArrayList<Fish>();
    }

    public int fishCount() {
        return this.fish.size();
    }

    public void addFish(Fish fish) {
        this.fish.add(fish);
    }

    public Fish removeFish() {
       return this.fish.remove(0);
    }
}
