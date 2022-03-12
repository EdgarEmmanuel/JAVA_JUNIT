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

    @ParameterizedTest
    @MethodSource("amounts")
    public void amount_is_calculated_correctly(
            double oneCentCount,
            double tenCentCount,
            double quarterCount,
            double oneDollarCount,
            double fiveDollarCount,
            double twentyDollarCount,
            double amount
    ){
        Money money = new Money(oneCentCount,tenCentCount,quarterCount,oneDollarCount,fiveDollarCount,twentyDollarCount);

        assertEquals(amount, money.amount);
    }

    static Double[][] amounts() {
        Double[][] value = new Double[][]{
                {0.0,0.0,0.0,0.0,0.0,0.0,0.0},
                {1.0,2.0,0.0,0.0,0.0,0.0,0.21000000000000002},
                {1.1,0.0,3.5,0.0,0.0,0.0,0.886},
                {0.0,0.0,0.0,4.5,2.5,0.0,17.0},
                {0.0,0.0,0.0,0.0,5.0,0.0,25.0},
                {0.0,100.0,0.0,0.0,50.0,6.0,380.0}
        };
        return value;
    }

    @Test
    public void subtraction_of_two_moneys_work_fine()
    {
        Money money = new Money(10,2,33,40,15,16);
        Money money_two = new Money(1,0,30,4,5,6);

        Money sum = Money.substractOperator(money , money_two);

        assertEquals(9, sum.oneCentCount);
        assertEquals(2, sum.tenCentCount);
        assertEquals(3, sum.quarterCount);
        assertEquals(36, sum.oneDollarCount);
        assertEquals(10, sum.fiveDollarCount);
        assertEquals(10, sum.twentyDollarCount);
    }


    @Test
    public void subtraction_throw_exception_when_there_is_no_amount()
    {
        Money money = new Money(0,1,0,0,0,0);
        Money money_two = new Money(1,0,0,0,0,0);


        assertThrows(ArithmeticException.class, () -> {
            Money sum = Money.substractOperator(money , money_two);
        });
    }
}