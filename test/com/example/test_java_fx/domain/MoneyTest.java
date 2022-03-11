package com.example.test_java_fx.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void sum_of_two_money_produce_exact_result()
    {
        Money money = new Money(1,2,3,4,5,6);
        Money money_two = new Money(1,2,3,4,5,6);

        Money sum = Money.operatorPlus(money, money_two);

        assertEquals(2, sum.oneCentCount);
        assertEquals(4, sum.tenCentCount);
        assertEquals(6, sum.quarterCount);
        assertEquals(8, sum.oneDollarCount);
        assertEquals(10, sum.fiveDollarCount);
        assertEquals(12, sum.twentyDollarCount);
    }
}