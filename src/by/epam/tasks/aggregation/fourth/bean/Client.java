package by.epam.tasks.aggregation.fourth.bean;

import java.util.ArrayList;
import java.util.Objects;

public class Client {

    private String passportId;
    private ArrayList<Account> accounts;

    public Client(String passportID, ArrayList<Account> accounts) {
        this.passportId = passportID;
        this.accounts = accounts;
    }

    public String getPassportID() {
        return passportId;
    }

    public void setPassportID(String passportID) {
        this.passportId = passportID;
    }

    public ArrayList<Account> getAccounts(){ return accounts; }

    public void setAccounts(ArrayList<Account> accounts) { this.accounts = accounts; }

    @Override
    public int hashCode() { return Objects.hash(passportId,accounts); }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(passportId, client.passportId) &&
                Objects.equals(accounts, client.accounts);
    }

    @Override
    public String toString() {
        return "Client{" +
                "passportId=" + passportId +
                ", accounts=" + accounts +
                '}';
    }
}