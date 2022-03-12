package com.example.test_java_fx.domain;

public class Money extends ValueObject{
    public double oneCentCount;
    public double tenCentCount;
    public double quarterCount;
    public double oneDollarCount;
    public double fiveDollarCount;
    public double twentyDollarCount;
    public double amount;

    public void Amount(double oneCentCount, double tenCentCount, double quarterCount, double oneDollarCount, double fiveDollarCount, double twentyDollarCount)
    {
        this.amount = (oneCentCount * 0.01 )+ (tenCentCount*0.10) + (quarterCount*0.25) + oneDollarCount + fiveDollarCount*5 + twentyDollarCount*20;
    }

    public Money(double oneCentCount, double tenCentCount, double quarterCount, double oneDollarCount, double fiveDollarCount, double twentyDollarCount) {
        if(oneCentCount < 0 || tenCentCount < 0 || quarterCount < 0 || oneDollarCount < 0 || fiveDollarCount < 0 || twentyDollarCount < 0)
            throw new ArithmeticException();
        this.oneCentCount = oneCentCount;
        this.tenCentCount = tenCentCount;
        this.quarterCount = quarterCount;
        this.oneDollarCount = oneDollarCount;
        this.fiveDollarCount = fiveDollarCount;
        this.twentyDollarCount = twentyDollarCount;

        this.Amount(oneCentCount,tenCentCount,quarterCount,oneDollarCount,fiveDollarCount,twentyDollarCount);
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

    public double getOneCentCount() {
        return oneCentCount;
    }

    public double getTenCentCount() {
        return tenCentCount;
    }


    public double getQuarterCount() {
        return quarterCount;
    }


    public double getOneDollarCount() {
        return oneDollarCount;
    }


    public double getFiveDollarCount() {
        return fiveDollarCount;
    }

    public double getTwentyDollarCount() {
        return twentyDollarCount;
    }


    @Override
    public boolean equalsCore(ValueObject o) {
        Money second = (Money)o;
        return this.oneCentCount == second.oneCentCount &&
        this.tenCentCount == second.tenCentCount &&
                this.quarterCount == second.quarterCount &&
                this.oneDollarCount == second.oneDollarCount &&
                this.fiveDollarCount == second.fiveDollarCount &&
                this.twentyDollarCount == second.twentyDollarCount;
    }

    @Override
    public int hashCodeCore() {
        int hashCode = (int)this.oneCentCount;
        hashCode = (hashCode * 397) ^ (int)this.tenCentCount;
        hashCode = (hashCode * 397) ^ (int)this.quarterCount;
        hashCode = (hashCode * 397) ^ (int)this.oneDollarCount;
        hashCode = (hashCode * 397) ^ (int)this.fiveDollarCount;
        hashCode = (hashCode * 397) ^ (int)this.twentyDollarCount;

        return hashCode;
    }
}
