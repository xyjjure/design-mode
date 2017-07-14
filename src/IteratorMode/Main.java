package IteratorMode;

/**
 * Created by Administrator on 2017/7/10.
 */
public class Main {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("hero"));
        bookShelf.appendBook((new Book("time")));
        bookShelf.appendBook(new Book("Harry Potter"));
        bookShelf.appendBook(new Book("White Walk"));
        Iterator iterator = bookShelf.iterator();
        while(iterator.hasNext()){
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }

    }
}
