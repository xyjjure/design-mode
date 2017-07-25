package FacadeMode.Pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by leon on 2017/7/25.
 */
public class PageMaker {
    private PageMaker(){

    }
    public static void makeWelcomPage(String mailAddr,String fileName){
        try{
            Properties mailprop = DataBase.getProperties("maildata.txt");
            String userName = mailprop.getProperty(mailAddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title("welcome to "+userName+"'s page");
            writer.paragraph(userName +"欢迎来到"+userName+"的主页");
            writer.paragraph("等着你的回复哦");
            writer.mailTo(mailAddr,userName);
            writer.close();
            System.out.println(fileName+" is created for "+mailAddr+"("+userName+")");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
