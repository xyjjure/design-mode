package StrategyMode;

/**
 * Created by leon on 2017/7/21.
 */
public class Hand {
    public static final int Stone = 0;
    public static final int scissors = 1;
    public static final int cloth =2;

    public static final Hand[] hand = {
            new Hand(Stone),
            new Hand(scissors),
            new Hand(cloth)
    };
    private static final String[] name = {
            "石头","剪刀","布"
    };
    private int handValue;
    private Hand(int handValue){
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue){
        return hand[handValue];
    }
    public boolean isStrongerThan(Hand h){
        return fight(h) == 1;
    }
    public boolean isWeakerThan(Hand h){
        return fight(h) == -1;
    }
    private int fight(Hand h){
        if(this == h){
            return 0;
        }else if((this.handValue+1)%3 == h.handValue){
            return 1;
        }else {
            return -1;
        }
    }

    public String toString(){
        return name[handValue];
    }

}
