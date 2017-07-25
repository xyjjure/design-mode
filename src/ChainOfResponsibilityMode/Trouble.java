package ChainOfResponsibilityMode;

/**
 * Created by leon on 2017/7/25.
 */
public class Trouble {
    private int number;

    public Trouble(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public String toString(){
        return "[Trouble " +number+ "]";
    }
}
