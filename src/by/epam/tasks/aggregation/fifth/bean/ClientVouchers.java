 package by.epam.tasks.aggregation.fifth.bean;

import java.util.List;
import java.util.Objects;

 public class ClientVouchers{
    
    private List<Client> clients;
    private List<Tour> tours;
    
    public ClientVouchers(List<Client> clients, List<Tour> tours){
        this.clients=clients;
        this.tours=tours;   
    }
    
    public List<Client> getClient(){
        return clients;
    }
    public void setClient(List<Client> clients){
        this.clients=clients;
    }
    
    public List<Tour> getTour(){
        return tours;
    }
    public void setTour(List<Tour> tours){
        this.tours=tours;
    }
    
    @Override
    public int hashCode() { return Objects.hash(clients,tours); }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientVouchers that = (ClientVouchers) o;
        return Objects.equals(clients, that.clients) &&
                Objects.equals(tours, that.tours);
    }

    @Override
    public String toString(){
        StringBuilder clientDescription=new StringBuilder(clients.get(0).toString());
        if(!tours.isEmpty()){
            clientDescription.append("\n"+clients.get(0).getClientName()+"s tours:");
            for(Tour tour:tours){
                clientDescription.append(new StringBuilder(tour.toString()));
            }
        }
        return new String(clientDescription);
    }    
}
