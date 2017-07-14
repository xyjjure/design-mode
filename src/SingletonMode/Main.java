package SingletonMode;

/**
 * Created by Administrator on 2017/7/10.
 */
public class Main {
    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1 == s2){
            System.out.println("相同");
        }else{
            System.out.println("不同");
        }
    }
}
