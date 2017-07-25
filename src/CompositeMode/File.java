package CompositeMode;

import VisitorMode.Visitor;

/**
 * Created by leon on 2017/7/24.
 */
public class File extends Entry {
    private String name;
    private int size;

    public File(String name ,int size){
        this.name = name;
        this.size = size;
    }

    public String getName(){
        return this.name;
    }

    public int getSize(){
        return this.size;
    }

    protected void printList(String prefix){
        System.out.println(prefix + "/" + this);
    }

    public void accept(Visitor v){
        v.visit(this);
    }
}
