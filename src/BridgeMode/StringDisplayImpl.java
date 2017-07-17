package BridgeMode;

/**
 * Created by leon on 2017/7/17.
 */
public class StringDisplayImpl implements DisplayImpl{
    private String string;
    private int width;

    public StringDisplayImpl(String string){
        this.string = string;
        this.width = string.getBytes().length;
    }

    public void rawOpen(){
        printLine();
    }

    public void rawPrint(){
        System.out.println("|" + string + "|");
    }

    public void rawClose(){
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for(int i=0;i<this.width;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
