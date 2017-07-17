package BridgeMode;

/**
 * Created by leon on 2017/7/17.
 */
public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl impl){
        super(impl);
    }

    public void multiDisplay(){
        open();
        for(int i=0;i<5;i++){
            print();
        }
        close();
    }
}
