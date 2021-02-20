
package by.epam.tasks.aggregation.fifth.runner;

/*
*  Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
* */

import by.epam.tasks.aggregation.fifth.bean.Client;
import by.epam.tasks.aggregation.fifth.bean.ClientVouchers;
import by.epam.tasks.aggregation.fifth.bean.Tour;
import by.epam.tasks.aggregation.fifth.logic.TourBooking;

import java.util.List;
import java.util.ArrayList;

public class Runner {
    
    public static void main(String[] args) throws RuntimeException{    
        List<Tour> tour1=new ArrayList<>();
        List<Tour> tour2=new ArrayList<>();
        
        List<Client> client1=new ArrayList<>();
        List<Client> client2=new ArrayList<>();
        
        TourBooking booking=new TourBooking();
        
        ClientVouchers v1= new ClientVouchers(client1,tour1);
        booking.chooseClient(v1.getClient(),"ann");
        booking.chooseTour(v1.getTour(),"shopping","vacation");
        System.out.println(v1);
        
        ClientVouchers v2=new ClientVouchers(client2,tour2);
        booking.chooseClient(v2.getClient(),"tom");
        booking.chooseTour(v2.getTour(),"cruise","therapy");
        System.out.println(v2);
        
        booking.sortTourByCost(v2);
        System.out.println(v2); 
    }
    
}
