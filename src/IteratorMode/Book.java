package IteratorMode;

/**
 * Created by Administrator on 2017/7/10.
 */
public class Book {
    private String name;
    public Book(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void putName(String name){
        this.name = name;
    }
}
