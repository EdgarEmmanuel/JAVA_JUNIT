package com.example.test_java_fx.userInterface;

import com.example.test_java_fx.domain.Money;
import com.example.test_java_fx.domain.SnackMachine;

public class SnackMachineViewModel {
    private SnackMachine snackMachine;
    public String moneyInTransaction;


    public SnackMachineViewModel(SnackMachine snackMachine)
    {
        this.setMoneyInTransaction(snackMachine.moneyInTransaction.amount);
        this.snackMachine = snackMachine;
    }


    public void insertCent()
    {
        this.snackMachine.insertMoney(Money.OneCent);

        this.setMoneyInTransaction(snackMachine.moneyInTransaction.amount);
    }


    public void insertTenCent()
    {
        this.snackMachine.insertMoney(Money.TenCent);

        this.setMoneyInTransaction(snackMachine.moneyInTransaction.amount);
    }


    public void setMoneyInTransaction(double money){
        this.moneyInTransaction = Double.toString(money);
    }
}
