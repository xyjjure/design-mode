package FactoryMethodMode.FrameWork;

/**
 * Created by Administrator on 2017/7/11.
 */
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product p);
}
