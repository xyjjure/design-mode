package TemplateMethodMode;

/**
 * Created by Administrator on 2017/7/10.
 */
public class CharDisplay extends Display{
    private char ch;
    public CharDisplay(char ch){
        this.ch = ch;
    }
    public void open(){
        System.out.print("<<");
    }
    public void close(){
        System.out.println(">>");
    }
    public void print(){
        System.out.print(ch);
    }
}
