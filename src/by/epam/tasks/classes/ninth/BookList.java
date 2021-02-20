package by.epam.tasks.classes.ninth;

import java.util.ArrayList;

public class BookList {
    private final ArrayList<Book> bookArrayList;

    public BookList(ArrayList<Book> bookArrayList) {
        this.bookArrayList = bookArrayList;
    }

    public ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }

    void add(String title, String authors, String publishingHouse, int yearOfPublication,
             int numberOfPages, float price, String typeOfCover) {
        bookArrayList.add(new Book(title, authors, publishingHouse,
                yearOfPublication, numberOfPages, price, typeOfCover));
    }

    ArrayList<Book> getBookByGivenAuthor(String author){
        ArrayList<Book> list = new ArrayList<>();
        for (Book book : bookArrayList)
            if (book.getAuthors().equals(author)) list.add(book);
        return list;
    }

    ArrayList<Book> getBookByGivenPublishingHouse(String publishingHouse){
        ArrayList<Book> list = new ArrayList<>();
        for (Book book : bookArrayList)
            if (book.getPublishingHouse().equals(publishingHouse)) list.add(book);
        return list;
    }

    ArrayList<Book> getBookByGivenYear(int year){
        ArrayList<Book> list = new ArrayList<>();
        for (Book book : bookArrayList)
            if (book.getYearOfPublication().compareTo(year)>0) list.add(book);
        return list;
    }
}
