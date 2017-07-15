package BuilderMode;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by leon on 2017/7/15.
 */
public class HTMLBuilder extends Builder {
    private String fileName;
    private PrintWriter printWriter;

    public void makeTitle(String title){
        this.fileName = title + ".html";
        try{
            printWriter = new PrintWriter(new FileWriter(fileName));
        }catch (IOException e){
            e.printStackTrace();
        }
        printWriter.println("<html><head><title>" + title + "</title></head><body>");
        printWriter.println("<h1>" + title +"</h1>");
    }

    public void makeString(String str){
        printWriter.println("<p>" + str +"</p>");
    }

    public void makeItems(String[] items){
        printWriter.println("<ul>");
        for(int i=0;i<items.length;i++){
            printWriter.println("<li>" + items[i] + "</li>");
        }
        printWriter.println("</ul>");
    }

    public void close(){
        printWriter.println("</body></html>");
        printWriter.close();
    }

    public String getResult(){
        return fileName;
    }
}
