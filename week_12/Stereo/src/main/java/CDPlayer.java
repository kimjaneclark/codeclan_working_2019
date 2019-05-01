public class CDPlayer extends Component implements iPlay{

    private int noOfCDDecks;

    public CDPlayer(String make, String model, int noOfCDDecks) {
        super(make, model);
        this.noOfCDDecks = noOfCDDecks;

    }

    public int getNoOfCDDecks() {
        return noOfCDDecks;
    }

    public String play(){
        return "Hit Play";
    }
}
