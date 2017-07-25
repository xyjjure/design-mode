package ChainOfResponsibilityMode;

/**
 * Created by leon on 2017/7/25.
 */
public class Main {
    public static void main(String[] args){
        Support a = new NoSupport("a");
        Support b = new LimitSupport("b",100);
        Support c = new SpecialSupport("c",429);
        Support d = new LimitSupport("d",200);
        Support e = new OddSupport("e");
        Support f = new LimitSupport("f",300);

        a.setNext(b).setNext(c).setNext(d).setNext(e).setNext(f);

        for(int i=0;i<500;i+=33){
            a.support(new Trouble(i));
        }
    }
}
