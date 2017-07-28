package ObserverMode;

/**
 * Created by leon on 2017/7/28.
 */
public class Main {
    public static void main(String[] args){
        NumberGenerator numberGenerator =new RandomNumberGenerator();
        Observer o1 = new DigitObserver();
        Observer o2 = new GraphObserver();
        numberGenerator.addObserver(o1);
        numberGenerator.addObserver(o2);
        numberGenerator.execute();

    }
}
