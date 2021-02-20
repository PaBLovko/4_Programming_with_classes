package by.epam.tasks.classes.ninth;

/*
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод  toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *    Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 *    Найти и вывести:
 *    a) список книг заданного автора;
 *    b) список книг, выпущенных заданным издательством;
 *    c) список книг, выпущенных после заданного года.
 */

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        BookList bookList = new BookList(new ArrayList<>());
        bookList.add("Горе от ума", "Грибоедов", "Вика",
                1824, 1000, 123, "ручками");
        bookList.add("Молодые супруги", "Грибоедов", "Павел",
                1814, 900, 100, "ручками");
        bookList.add("Евгенин Онегин", "Пушкин", "Вика",
                1833, 1200, 200, "ручками");
        bookList.add("Капитанская дочка", "Пушкин", "Павел",
                1841, 500, 123, "ручками");
        bookList.add("Сказка о рыбаке и рыбке", "Пушкин", "Вика",
                1833, 300, 33, "ручками");

        for(Book customer :bookList.getBookByGivenAuthor("Грибоедов"))
            System.out.println(customer.getTitle());
        System.out.println();
        for(Book customer :bookList.getBookByGivenPublishingHouse("Вика"))
            System.out.println(customer.getTitle());
        System.out.println();
        for(Book customer :bookList.getBookByGivenYear(1833))
            System.out.println(customer.getTitle());
    }
}
