public class RecordDeck extends Component implements iPlay {



    private int playSpeed;

    public RecordDeck(String make, String model, int playSpeed) {
        super(make, model);
        this.playSpeed = playSpeed;

    }

    public int getPlaySpeed() {
        return playSpeed;
    }

    public String play(){
        return "Hit Play";
    }
}
