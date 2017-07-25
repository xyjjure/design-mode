package ChainOfResponsibilityMode;

/**
 * Created by leon on 2017/7/25.
 */
public class OddSupport extends Support {
    public OddSupport(String name){
        super(name);
    }

    protected boolean resolve(Trouble trouble){
        if(trouble.getNumber() %2 == 1){
            return true;
        }else{
            return false;
        }
    }
}
