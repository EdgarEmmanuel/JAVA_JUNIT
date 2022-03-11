package com.example.test_java_fx.domain;

public class Money {
    public int oneCentCount;
    public int tenCentCount;
    public int quarterCount;
    public int oneDollarCount;
    public int fiveDollarCount;
    public int twentyDollarCount;

    public Money(int oneCentCount, int tenCentCount, int quarterCount, int oneDollarCount, int fiveDollarCount, int twentyDollarCount) {
        this.oneCentCount = oneCentCount;
        this.tenCentCount = tenCentCount;
        this.quarterCount = quarterCount;
        this.oneDollarCount = oneDollarCount;
        this.fiveDollarCount = fiveDollarCount;
        this.twentyDollarCount = twentyDollarCount;
    }


    public static Money operatorPlus(Money moneyOne, Money moneyTwo){
        Money sum = new Money(
                moneyOne.oneCentCount + moneyTwo.oneCentCount,
                moneyOne.tenCentCount + moneyTwo.tenCentCount,
                moneyOne.quarterCount + moneyTwo.quarterCount,
                moneyOne.oneDollarCount + moneyTwo.oneDollarCount,
                moneyOne.fiveDollarCount + moneyTwo.fiveDollarCount,
                moneyOne.twentyDollarCount + moneyTwo.twentyDollarCount
        );

        return sum;
    }

    public int getOneCentCount() {
        return oneCentCount;
    }

    public void setOneCentCount(int oneCentCount) {
        this.oneCentCount = oneCentCount;
    }

    public int getTenCentCount() {
        return tenCentCount;
    }

    public void setTenCentCount(int tenCentCount) {
        this.tenCentCount = tenCentCount;
    }

    public int getQuarterCount() {
        return quarterCount;
    }

    public void setQuarterCount(int quarterCount) {
        this.quarterCount = quarterCount;
    }

    public int getOneDollarCount() {
        return oneDollarCount;
    }

    public void setOneDollarCount(int oneDollarCount) {
        this.oneDollarCount = oneDollarCount;
    }

    public int getFiveDollarCount() {
        return fiveDollarCount;
    }

    public void setFiveDollarCount(int fiveDollarCount) {
        this.fiveDollarCount = fiveDollarCount;
    }

    public int getTwentyDollarCount() {
        return twentyDollarCount;
    }

    public void setTwentyDollarCount(int twentyDollarCount) {
        this.twentyDollarCount = twentyDollarCount;
    }
}
