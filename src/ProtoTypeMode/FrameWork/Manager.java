package ProtoTypeMode.FrameWork;

import java.util.*;
/**
 * Created by Administrator on 2017/7/12.
 */
public class Manager {
    private HashMap<String,Product> showcase = new HashMap();
    public void register(String name,Product proto){
        showcase.put(name,proto);
    }
    public Product create(String name){
        Product p = showcase.get(name);
        return p.createClone();
    }

}
