package CompositeMode;


/**
 * Created by leon on 2017/7/24.
 */
public class Main {
    public static void main(String[] args){
        try{
            System.out.println("Making root entries...");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tempDir = new Directory("temp");
            Directory userDir = new Directory("user");
            rootDir.add(binDir);
            rootDir.add(tempDir);
            rootDir.add(userDir);
            binDir.add(new File("vi",10000));
            binDir.add(new File("latex",20000));
            rootDir.printList();

            System.out.println(" ");
            System.out.println("Making user entries...");
            Directory gakki = new Directory("gakki");
            Directory xyjjure = new Directory("xyjjure");
            Directory tokiyo = new Directory("tokiyo");
            userDir.add(gakki);
            userDir.add(xyjjure);
            userDir.add(tokiyo);
            gakki.add(new File("diary.html",100));
            gakki.add(new File("composite.java",200));
            xyjjure.add(new File("memo.tex",300));
            tokiyo.add(new File("game.doc",400));
            tokiyo.add(new File("junk.email",500));
            rootDir.printList();
        }catch(FileTreatmentException e){
            e.printStackTrace();
        }
    }
}
