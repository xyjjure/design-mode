package VisitorMode;

import CompositeMode.Directory;
import CompositeMode.Entry;
import CompositeMode.File;
import java.util.Iterator;

/**
 * Created by leon on 2017/7/25.
 */
public class ListVisitor extends Visitor {
    private String currentDir = "";
    public void visit(File file){
        System.out.println(currentDir + "/" + file);
    }

    public void visit(Directory directory){
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while(it.hasNext()){
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
