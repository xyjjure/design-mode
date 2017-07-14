package FactoryMethodMode;

import FactoryMethodMode.FrameWork.Factory;
import FactoryMethodMode.FrameWork.Product;
import FactoryMethodMode.IdCard.idCardFactory;

/**
 * Created by Administrator on 2017/7/11.
 */
public class Main {
    public static void main(String[] args){
        Factory factory = new idCardFactory();
        Product card1 = factory.create("xxx");
        Product card2 = factory.create("yyy");
        Product card3 = factory.create("zzz");
        card1.use();
        card2.use();
        card3.use();
    }
}
