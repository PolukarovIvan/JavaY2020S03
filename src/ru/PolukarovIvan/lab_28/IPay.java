package ru.PolukarovIvan.lab_28;

public interface IPay {
    void pay(int paymentAmount) throws Exception;
    void collectPaymentDetails();
    public int getBalance();
}
