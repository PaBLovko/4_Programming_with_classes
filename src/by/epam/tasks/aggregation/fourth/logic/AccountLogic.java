package by.epam.tasks.aggregation.fourth.logic;

import by.epam.tasks.aggregation.fourth.bean.Account;

public class AccountLogic {
    public Boolean blockAccount (Account account) {
        if (account.getIsOpen()) {
            account.setIsOpen(false);
        }
        return true;
    }
}
