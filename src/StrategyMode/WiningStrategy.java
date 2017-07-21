package StrategyMode;

import java.util.Random;

/**
 * Created by leon on 2017/7/21.
 */
public class WiningStrategy implements Strategy{
    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WiningStrategy(int seed){
        random = new Random(seed);
    }
    public Hand nextHand(){
        if(!won){
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    public void study(boolean win){
        won = win;
    }
}
