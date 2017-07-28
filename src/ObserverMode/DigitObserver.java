package ObserverMode;

/**
 * Created by leon on 2017/7/28.
 */
public class DigitObserver implements Observer {
    public void update(NumberGenerator numberGenerator){
        System.out.println("DigitObserver:"+numberGenerator.getNumber());

        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
        }
    }
}
