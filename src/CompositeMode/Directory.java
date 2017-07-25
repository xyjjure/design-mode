package CompositeMode;

import VisitorMode.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by leon on 2017/7/24.
 */
public class Directory extends Entry {
    private String name;
    private ArrayList directory = new ArrayList();

    public Directory(String name ){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getSize(){
        int size = 0;
        Iterator it = directory.iterator();
        while(it.hasNext()){
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry){
        directory.add(entry);
        return this;
    }

    public Iterator iterator(){
        return directory.iterator();
    }

    protected void printList(String prefix){
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while(it.hasNext()){
            Entry entry = (Entry)it.next();
            entry.printList(prefix + "/" +name);
        }
    }

    public void accept(Visitor v){
        v.visit(this);
    }
}
