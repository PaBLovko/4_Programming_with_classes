package by.epam.tasks.classes.eighth;

import java.util.ArrayList;
import java.util.Comparator;

public class CustomerList {
    private final ArrayList<Customer> customerArrayList;

    public CustomerList(ArrayList<Customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }

    void sortName(){
        customerArrayList.sort(Comparator.comparing(Customer::getLastName));
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    ArrayList<Customer> getCustomerByCreditCardRange(int min, int max){
        ArrayList<Customer> list = new ArrayList<>();
        for (Customer customer : customerArrayList) {
            if (customer.getCreditCardNumber().compareTo(min) > 0
                    && customer.getCreditCardNumber().compareTo(max) < 0) {
                list.add(customer);
            }
        }
        return list;
    }

    void add (String lastName, String firstName, String patronymic, String address, Integer cardNumber, int bankAccountNumber){
        customerArrayList.add(new Customer(lastName, firstName, patronymic, address, cardNumber, bankAccountNumber));
    }
}
