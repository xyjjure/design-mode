package DecoratorMode;

/**
 * Created by leon on 2017/7/24.
 */
public class FullBorder extends Border{
    public FullBorder(Display display){
        super(display);
    }

    public int getColumns(){
        return display.getColumns() + 2;
    }

    public int getRows(){
        return display.getRows() + 2;
    }

    public String getRowText(int row){
        if(row == 0){
            return "+" + makeLine('-',display.getColumns()) + "+";
        }else if(row == display.getRows() + 1){
            return "+" + makeLine('-',display.getColumns()) + "+";
        }else{
            return "|" + display.getRowText(row-1) + "|";
        }
    }

    public String makeLine(char ch,int count){
        StringBuffer buf = new StringBuffer();
        for(int i=0;i<count;i++){
            buf.append(ch);
        }
        return buf.toString();
    }
}
