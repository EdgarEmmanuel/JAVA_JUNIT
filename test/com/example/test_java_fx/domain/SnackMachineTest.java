package com.example.test_java_fx.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnackMachineTest {

    @Test
    public void return_money_should_empty_value()
    {
        SnackMachine snack = new SnackMachine();
        Money oneDollar = Money.OneDollar;

        snack.insertMoney(oneDollar);
        snack.emptyTheSnackTransaction();

        assertEquals(0, snack.moneyInTransaction.amount);
    }

    @Test
    public void insert_money_should_go_to_money_in_transaction()
    {
        SnackMachine snack = new SnackMachine();
        Money oneDollar = Money.OneDollar;

        snack.insertMoney(oneDollar);

        assertEquals(1, snack.moneyInTransaction.amount);
    }


    @Test
    public void should_insert_only_money_recognize_by_snack_machine()
    {
        SnackMachine snack = new SnackMachine();


        assertThrows(ArithmeticException.class, () -> {
            Money twoDollar = Money.operatorPlus(Money.OneDollar, Money.OneDollar);
            snack.insertMoney(twoDollar);
        });
    }

    @Test
    public void money_in_transaction_goes_to_money_inside_after_purchase()
    {
        SnackMachine snack = new SnackMachine();
        Money current = Money.operatorPlus(Money.OneDollar, Money.TwentyDollar);
        snack.insertMoney(Money.OneDollar);
        snack.insertMoney(Money.TwentyDollar);

        snack.buySnack();

        assertEquals(Money.None.amount, snack.moneyInTransaction.amount);
        assertEquals(current.amount, snack.moneyInsideSnack.amount);
    }
}