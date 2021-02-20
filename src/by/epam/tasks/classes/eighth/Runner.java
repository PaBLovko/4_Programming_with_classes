package by.epam.tasks.classes.eighth;

/*
 * Создать класс Customer, спецификация которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод  toString(). Создать второй класс,
 * агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *
 *    Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки,
 *    номер банковского счета.
 *    Найти и вывести:
 *    a) список покупателей в алфавитном порядке;
 *    b) список покупателей, у которых номер кредитной карточки находится
 *    в заданном интервале.
 */

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        CustomerList customerList = new CustomerList(new ArrayList<>());
        customerList.add("Петров", "Вика", "Вика",
                "Гомель", 10, 123);
        customerList.add("Кайот", "Анжела", "Аркедьевна",
                "Минск", 11, 234);
        customerList.add("Сидоров", "Петров", "Сергеевич",
                "Брест", 12, 345);
        customerList.add("Волков", "Игорь", "Варшков",
                "Витебск", 13, 111);
        customerList.add("Романов", "Кайот", "Петрович",
                "Могилев", 14, 567);

        customerList.sortName();
        for(Customer customer: customerList.getCustomerArrayList())
            System.out.println(customer.getLastName());
        System.out.println();
        for(Customer customer :customerList.getCustomerByCreditCardRange(11, 13))
            System.out.println(customer.getLastName());
    }
}
