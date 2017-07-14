package SingletonMode;

/**
 * Created by Administrator on 2017/7/10.
 */
public class Singleton {
    private Singleton(){
        System.out.println("生成了实例");
    }
    private static class SingleFactory{
        private static Singleton singleton = new Singleton();
    }
    public static Singleton getInstance(){
        return SingleFactory.singleton;
    }
}
