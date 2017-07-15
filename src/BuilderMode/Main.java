package BuilderMode;

/**
 * Created by leon on 2017/7/15.
 */
public class Main {
    public static void main(String[] args){
        if(args.length != 1){
            usage();
            System.exit(0);
        }
        if(args[0].equals("plain")){
            TextBuilder text = new TextBuilder();
            Director director = new Director(text);
            director.constract();
            String result = text.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")){
            HTMLBuilder html = new HTMLBuilder();
            Director director = new Director(html);
            director.constract();
            String fileName = html.getResult();
            System.out.println(fileName + "编写完成");
        } else {
            usage();
            System.exit(0);
        }
    }

    public static void usage(){
        System.out.println("Usage :java Main plain 编写文本文档");
        System.out.println("Usage :java Main html 编写HTML文档");
    }
}
