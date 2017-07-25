package DecoratorMode;

/**
 * Created by leon on 2017/7/24.
 */
public class SideBorder extends Border{
    private char borderChar;

    public SideBorder(Display display,char ch){
        super(display);
        this.borderChar = ch;
    }

    public int getColumns(){
        return display.getColumns() + 2;
    }

    public int getRows(){
        return display.getRows();
    }

    public String getRowText(int row){
        return borderChar + display.getRowText(row) + borderChar;
    }
}
