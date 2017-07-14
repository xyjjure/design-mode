package AdapterMode;

/**
 * Created by Administrator on 2017/7/10.
 */
public class Main {
    public static void main(String[] args){
        Print p = new PrintBanner("hello");
        p.printStrong();
        p.printWeak();
    }
}
