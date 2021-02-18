package strategy_ex1.strategies;


public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
