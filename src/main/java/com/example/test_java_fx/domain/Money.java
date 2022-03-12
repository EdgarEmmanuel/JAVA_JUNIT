package com.example.test_java_fx.domain;

public class Money extends ValueObject{
    public double oneCentCount;
    public double tenCentCount;
    public double quarterCount;
    public double oneDollarCount;
    public double fiveDollarCount;
    public double twentyDollarCount;
    public double amount;

    public void setTwentyDollarCount(double twentyDollarCount) {
        this.twentyDollarCount = twentyDollarCount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void Amount(double oneCentCount, double tenCentCount, double quarterCount, double oneDollarCount, double fiveDollarCount, double twentyDollarCount)
    {
        this.amount = oneCentCount + tenCentCount + quarterCount + oneDollarCount + fiveDollarCount + twentyDollarCount;
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

    public void setOneCentCount(double oneCentCount) {
        this.oneCentCount = oneCentCount;
    }

    public double getTenCentCount() {
        return tenCentCount;
    }

    public void setTenCentCount(double tenCentCount) {
        this.tenCentCount = tenCentCount;
    }

    public double getQuarterCount() {
        return quarterCount;
    }

    public void setQuarterCount(double quarterCount) {
        this.quarterCount = quarterCount;
    }

    public double getOneDollarCount() {
        return oneDollarCount;
    }

    public void setOneDollarCount(double oneDollarCount) {
        this.oneDollarCount = oneDollarCount;
    }

    public double getFiveDollarCount() {
        return fiveDollarCount;
    }

    public void setFiveDollarCount(double fiveDollarCount) {
        this.fiveDollarCount = fiveDollarCount;
    }

    public double getTwentyDollarCount() {
        return twentyDollarCount;
    }

    public void setTwentyDollarCount(int twentyDollarCount) {
        this.twentyDollarCount = twentyDollarCount;
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
