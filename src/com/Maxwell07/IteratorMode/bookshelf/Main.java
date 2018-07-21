package com.Maxwell07.IteratorMode.bookshelf;

public class Main {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("三国演义"));
        bookShelf.appendBook(new Book("水浒传"));
        bookShelf.appendBook(new Book("西游记"));
        bookShelf.appendBook(new Book("红楼梦"));
        Iterator iterator = new BookShelfIterator(bookShelf);
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("书架上有一本:"+book.getName());
        }
    }
}
