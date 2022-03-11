package com.example.test_java_fx.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void test()
    {
        Money money = new Money(1,2,3,4,5,6);
        Money money_two = new Money(1,2,3,4,5,6);

        Money sum = Money.operatorPlus(money, money_two);

        assertEquals(2, sum.oneCentCount);
    }
}