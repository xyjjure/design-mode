package ProtoTypeMode;

import ProtoTypeMode.FrameWork.Product;

/**
 * Created by Administrator on 2017/7/12.
 */
public class MessageBox implements Product{
    private char decoChar;
    public MessageBox(char decoChar){
        this.decoChar = decoChar;
    }
    public void use(String s){
        int length = s.getBytes().length;

        for(int i =0;i<length+4;i++){
            System.out.print(decoChar);
        }
        System.out.println();
        System.out.println(decoChar+" "+s+" "+decoChar);
        for(int i =0;i<length+4;i++){
            System.out.print(decoChar);
        }
        System.out.println();
    }
    public Product createClone(){
        Product p = null;
        try{
            p = (Product)clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }

}
