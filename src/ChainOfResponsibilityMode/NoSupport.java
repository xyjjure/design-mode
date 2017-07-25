package ChainOfResponsibilityMode;

/**
 * Created by leon on 2017/7/25.
 */
public class NoSupport extends Support {
    public NoSupport(String name){
        super(name);
    }

    protected boolean resolve(Trouble trouble){
        return false;
    }
}
