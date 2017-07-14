package ProtoTypeMode;

import ProtoTypeMode.FrameWork.Manager;
import ProtoTypeMode.FrameWork.Product;

/**
 * Created by Administrator on 2017/7/12.
 */
public class Main {
    public static void main(String[] args){
        Manager m = new Manager();

        UnderLinePen upen = new UnderLinePen('~');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('#');
        m.register("one",upen);
        m.register("two",mBox);
        m.register("three",sBox);

        Product p1 = m.create("one");
        Product p2 = m.create("two");
        Product p3 = m.create("three");
        p1.use("hello one");
        p2.use("hello two");
        p3.use("hello three");
    }
}
