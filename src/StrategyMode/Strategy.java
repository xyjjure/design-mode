package StrategyMode;

/**
 * Created by leon on 2017/7/21.
 */
public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
