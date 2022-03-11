package com.example.test_java_fx.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import javax.management.OperationsException;
import java.awt.dnd.InvalidDnDOperationException;
import java.lang.reflect.Executable;
import java.util.stream.IntStream;

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


    @Test
    public void two_money_should_be_equal(){
        Money money = new Money(1,2,3,4,5,6);
        Money money_two = new Money(1,2,3,4,5,6);

        assertEquals(money, money_two);
        assertTrue(money.equalsCore(money_two));
    }

    @Test
    public void two_money_should_not_be_equal_when_different_values(){
        Money money = new Money(1,2,3,4,5,10);
        Money money_two = new Money(1,2,3,4,5,6);

        assertNotEquals(money, money_two);
        assertFalse(money.equalsCore(money_two));
    }

    @ParameterizedTest
    @MethodSource("range")
    void testWithRangeMethodSource(int oneCentCount,
                                   int tenCentCount,
                                   int quarterCount,
                                   int oneDollarCount,
                                   int fiveDollarCount,
                                   int twentyDollarCount) {
        assertThrows(ArithmeticException.class, () -> {
            new Money(oneCentCount,tenCentCount,quarterCount,oneDollarCount,fiveDollarCount,twentyDollarCount);
        });
    }

    static Integer[][] range() {
        Integer[][] value = new Integer[][]{
                {-1,0,0,0,0,0},
                {0,-2,0,0,0,0},
                {0,0,-3,0,0,0},
                {0,0,0,-4,0,0},
                {0,0,0,0,-5,0},
                {0,0,0,0,0,-6}
        };
        return value;
    }
}