package by.epam.tasks.aggregation.fourth.bean;

import java.util.Objects;

public class Account {
    private String id;
    private int balance;
    private boolean isOpen;

    public Account(String id, int balance, boolean isOpen) {
        this.id = id;
        this.balance = balance;
        this.isOpen = isOpen;
    }

    public String getId(){ return id; }

    public void setId(String id) { this.id = id; }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) { this.isOpen = isOpen; }

    @Override
    public int hashCode() { return Objects.hash(id,balance,isOpen);}

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return isOpen == account.isOpen &&
                balance == account.balance &&
                Objects.equals(id, account.id);
    }

    @Override
    public String toString(){
        return "Account{" +
                "id =" + id +
                ", balance =" + balance +
                ", isOpen " + isOpen +
                '}';
    }
}