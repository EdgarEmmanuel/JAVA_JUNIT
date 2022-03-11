package com.example.test_java_fx.domain;

public class SnackMachine extends Entity{
    public Money moneyInsideSnack;
    public Money moneyInTransaction;


    public int oneCentCountInTransaction;
    public int tenCentCountIntTransaction;
    public int quarterCountInTransaction;
    public int oneDollarCountInTransaction;
    public int fiveDollarCountInTransaction;
    public int twentyDollarCountInTransaction;

    /**
     * this function permits the user to insert money
     * @param money
     */
    public void insertMoney(Money money){
        this.moneyInTransaction = Money.operatorPlus(moneyInTransaction, money);
    }


    /**
     * this function is invoked when the user wants to cancel his request
     */
    public void returnMoneyBack(){
        //moneyInTransaction = 0
    }


    public void buySnack(){
        this.chargeTheMoneyInSnack();

        this.emptyTheSnackTransaction();
    }


    public void chargeTheMoneyInSnack(){
        this.moneyInsideSnack = Money.operatorPlus(this.moneyInsideSnack , moneyInTransaction);
    }

    public void emptyTheSnackTransaction(){
        //moneyInTransaction = 0
    }


}
