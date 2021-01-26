package com.toby;

public class MortgageCalculator {
  public final static byte MONTHS_IN_YEAR = 12;
  public final static byte PERCENT = 100;

  private int principal;
  private float annualInterestRate;
  private byte years;

  public MortgageCalculator(int principal, float annualInterestRate, byte years) {
    this.principal = principal;
    this.annualInterestRate = annualInterestRate;
    this.years = years;
  }

  public double calculatRemainingBalance(int numberOfPaymentMade) {
    short numberOfPayment = getNumberOfPayments();
    float monthInterestRate = getMonthInterest();
    double remaningBalance = principal * (Math.pow(1 + monthInterestRate, numberOfPayment) - Math
        .pow(1 + monthInterestRate, numberOfPaymentMade)) / (Math
        .pow(1 + monthInterestRate, numberOfPayment) - 1);
    return remaningBalance;
  }


  public double calculatMortgage() {
    short numberOfPayment = getNumberOfPayments();
    float monthInterestRate = getMonthInterest();

    double mortgage = principal * (monthInterestRate * Math
        .pow(1 + monthInterestRate, numberOfPayment)) / (Math
        .pow(1 + monthInterestRate, numberOfPayment) - 1);
    return mortgage;
  }

  private short getNumberOfPayments() {
    return (short) (years * MONTHS_IN_YEAR);
  }

  private float getMonthInterest() {
    return annualInterestRate / PERCENT / MONTHS_IN_YEAR;
  }

  public byte getYears() {
    return years;
  }
}
