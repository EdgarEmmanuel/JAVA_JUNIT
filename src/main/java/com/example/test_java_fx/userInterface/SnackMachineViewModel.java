package com.example.test_java_fx.userInterface;

import com.example.test_java_fx.domain.Money;
import com.example.test_java_fx.domain.SnackMachine;

public class SnackMachineViewModel {
    private SnackMachine snackMachine;
    public String moneyInTransaction;


    public SnackMachineViewModel(SnackMachine snackMachine)
    {
        this.moneyInTransaction = Double.toString(snackMachine.moneyInTransaction.amount);
        this.snackMachine = snackMachine;
    }


    public void insertCent()
    {
        this.snackMachine.insertMoney(Money.OneCent);

        this.moneyInTransaction = Double.toString(snackMachine.moneyInTransaction.amount);
    }
}
