package TemplateMethodMode;

/**
 * Created by Administrator on 2017/7/10.
 */
public class StringDisplay extends Display{
    private String string;
    private int width;
    public StringDisplay(String string){
        this.string = string;
        this.width = string.getBytes().length;
    }
    public void open(){
        printLine();
    }
    public void close(){
        printLine();
    }
    public void print(){
        System.out.println("|"+string+"|");
    }
    private void printLine(){
        System.out.print("+");
        for(int i=0;i<width;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
