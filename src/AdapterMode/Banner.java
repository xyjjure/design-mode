package AdapterMode;

/**
 * Created by Administrator on 2017/7/10.
 */
public class Banner {
    private String string;
    public Banner(String string){
        this.string = string;
    }
    public void showWithParen(){
        System.out.println("("+string+")");
    }
    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
