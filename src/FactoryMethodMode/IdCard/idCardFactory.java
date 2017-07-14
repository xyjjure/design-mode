package FactoryMethodMode.IdCard;

import FactoryMethodMode.FrameWork.Factory;
import FactoryMethodMode.FrameWork.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/11.
 */
public class idCardFactory extends Factory {
    private List owners = new ArrayList<>();
    protected Product createProduct(String owner){
        return new idCard(owner);
    }
    protected void registerProduct(Product product){
        owners.add(((idCard)product).getOwner());
    }
    public List getOwners(){
        return owners;
    }
}
