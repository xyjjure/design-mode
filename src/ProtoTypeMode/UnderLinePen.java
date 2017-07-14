package ProtoTypeMode;

import ProtoTypeMode.FrameWork.Product;

/**
 * Created by Administrator on 2017/7/12.
 */
public class UnderLinePen implements Product{
    private char decoChar;
    public UnderLinePen(char decoChar){
        this.decoChar = decoChar;
    }
    public void use(String s){
        int length = s.getBytes().length;

        System.out.println("\""+s+"\"");
        for(int i = 0;i<length+2;i++){
            System.out.print(decoChar);
        }
        System.out.println();
    }
    public Product createClone(){
        Product p = null;
        try{
            p = (Product)clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}
