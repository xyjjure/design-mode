package IteratorMode;

/**
 * Created by Administrator on 2017/7/10.
 */
public class BookShelf implements Aggregate{
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxSize){
        this.books = new Book[maxSize];
    }
    public Book getBookAt(int num){
        return books[num];
    }
    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }
    public int getLength(){
        return last;
    }
    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}
