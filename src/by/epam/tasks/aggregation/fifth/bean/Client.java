
package by.epam.tasks.aggregation.fifth.bean;

import java.util.Objects;

public class Client{
    
    private String clientName;
        
    public Client(String clientName){
        this.clientName=clientName;
    } 
     
    public void setClientName(String clientName){
        this.clientName=clientName;
    }

    public String getClientName(){
        return clientName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(clientName, client.clientName);
    }

    @Override
    public String toString(){
        return "Client{" +
                "clientName" + clientName +
                '}';
    }
}
