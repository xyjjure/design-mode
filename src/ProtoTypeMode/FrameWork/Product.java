package ProtoTypeMode.FrameWork;

/**
 * Created by Administrator on 2017/7/12.
 */
public interface Product extends Cloneable{
    void use(String s);
    Product createClone();
}
