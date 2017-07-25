package ChainOfResponsibilityMode;

/**
 * Created by leon on 2017/7/25.
 */
public class SpecialSupport extends Support {
    private int number;

    public SpecialSupport (String name ,int number){
        super(name);
        this.number = number;
    }

    protected boolean resolve(Trouble trouble){
        if(trouble.getNumber() == number){
            return true;
        }else{
            return false;
        }
    }
}