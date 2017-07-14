package TemplateMethodMode;

/**
 * Created by Administrator on 2017/7/10.
 */
public class Main {
    public static void main(String[] args){
        Display d1 = new CharDisplay('x');
        Display d2 = new StringDisplay("life is hard");
        d1.display();
        d2.display();
    }
}
