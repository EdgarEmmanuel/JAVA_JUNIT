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
}