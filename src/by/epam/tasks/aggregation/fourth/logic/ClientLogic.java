package by.epam.tasks.aggregation.fourth.logic;

import by.epam.tasks.aggregation.fourth.bean.Account;
import by.epam.tasks.aggregation.fourth.bean.Client;

import java.util.Collections;
import java.util.Comparator;

public class ClientLogic {

    public Client sortAscendingBalance(Client client) {
        Collections.sort(client.getAccounts(), Comparator.comparing(Account::getId));
        return client;
    }

    public Account findAccount(Client client, String id) {
        for (Account account : client.getAccounts()) {
            if (account.getId().equals(id)) {
                return account;
            }
        }
        return null;
    }

    public int negativeAccounts(Client client) {
        int negativeBalance = 0;
        for (Account account : client.getAccounts()) {
            if (account.getBalance() < 0 && account.getIsOpen()) {
                negativeBalance += account.getBalance();
            }
        }
        return negativeBalance;
    }

    public int positiveAccounts(Client client){
        int positiveBalance = 0;
        for (Account account : client.getAccounts()) {
            if (account.getBalance() > 0 && account.getIsOpen()) {
                positiveBalance += account.getBalance();
            }
        }
        return positiveBalance;
    }

    public int AllAccounts(Client client){
        return (positiveAccounts(client) + negativeAccounts(client));

    }
}
