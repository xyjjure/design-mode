package ObserverMode;

import java.util.Random;

/**
 * Created by leon on 2017/7/28.
 */
public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;
    public int getNumber(){
        return this.number;
    }

    public void execute(){
        for(int i=0;i<20;i++){
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
