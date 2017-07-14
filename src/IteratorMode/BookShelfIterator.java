package IteratorMode;

/**
 * Created by Administrator on 2017/7/10.
 */
public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
    }
    public boolean hasNext(){
        if(index < bookShelf.getLength())
            return true;
        else
            return false;
    }
    public Object next(){
        Book book = this.bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
