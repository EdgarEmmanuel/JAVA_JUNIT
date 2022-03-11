package com.example.test_java_fx.domain;

public class Money extends ValueObject{
    public int oneCentCount;
    public int tenCentCount;
    public int quarterCount;
    public int oneDollarCount;
    public int fiveDollarCount;
    public int twentyDollarCount;

    public Money(int oneCentCount, int tenCentCount, int quarterCount, int oneDollarCount, int fiveDollarCount, int twentyDollarCount) {
        if(oneCentCount < 0 || tenCentCount < 0 || quarterCount < 0 || oneDollarCount < 0 || fiveDollarCount < 0 || twentyDollarCount < 0)
            throw new ArithmeticException();
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
        int hashCode = this.oneCentCount;
        hashCode = (hashCode * 397) ^ this.tenCentCount;
        hashCode = (hashCode * 397) ^ this.quarterCount;
        hashCode = (hashCode * 397) ^ this.oneDollarCount;
        hashCode = (hashCode * 397) ^ this.fiveDollarCount;
        hashCode = (hashCode * 397) ^ this.twentyDollarCount;

        return hashCode;
    }
}
