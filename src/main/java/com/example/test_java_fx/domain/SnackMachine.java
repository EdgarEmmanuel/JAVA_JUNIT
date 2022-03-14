package com.example.test_java_fx.domain;

public class SnackMachine extends Entity{
    public Money moneyInsideSnack;
    public Money moneyInTransaction;

    public SnackMachine(){
        this.moneyInTransaction = Money.None;
        this.moneyInsideSnack = Money.None;
    }

    /**
     * this function permits the user to insert money
     * @param money
     */
    public void insertMoney(Money money){
        this.verifyMoney(money);
        this.moneyInTransaction = Money.operatorPlus(moneyInTransaction, money);
    }

    private void verifyMoney(Money money)
    {
        if(money != Money.OneDollar && money != Money.OneCent && money != Money.FiveDollar && money != Money.QuarterCent && money != Money.TenCent && money != Money.TwentyDollar)
            throw new ArithmeticException();
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
        this.moneyInsideSnack = Money.operatorPlus(this.moneyInsideSnack , this.moneyInTransaction);
    }

    public void emptyTheSnackTransaction(){
        this.moneyInTransaction = Money.None;
    }


}
