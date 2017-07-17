package BridgeMode;

/**
 * Created by leon on 2017/7/17.
 */
public class Main {
    public static void main(String[] args){
        Display d1 = new Display(new StringDisplayImpl("hello,china"));
        Display d2 = new CountDisplay(new StringDisplayImpl("hello,world"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello,hello"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay();
    }
}
