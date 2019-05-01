import java.util.ArrayList;

public class Bear {

    private String name;
    private ArrayList<Fish> belly;

    public Bear(String name) {
        this.name = name;
        this.belly = new ArrayList<Fish>();
    }

    public int foodcount(){
        return this.belly.size();
    }


    public void eat(Fish fish) {
        this.belly.add(fish);
    }


    public void takeFishFromRiver(River river) {
        Fish fish = river.removeFish();
        this.eat(fish);

    }
}
