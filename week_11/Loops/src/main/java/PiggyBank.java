import java.util.ArrayList;

public class PiggyBank {

    private ArrayList<Integer> coins;

    public PiggyBank() {
        this.coins = new ArrayList<Integer>();
    }





    public int countCoins() {
        return this.coins.size();
    }

    public void deposit(int amount) {
        this.coins.add(amount);
    }

    public int total() {
        int total = 0;
//        for(int i = 0;i < countCoins(); i++){
//            total += this.coins.get(i);
//        }
        for (int coin : this.coins){
            total += coin;
        }
        return total;
    }
}
