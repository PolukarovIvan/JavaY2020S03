package ru.PolukarovIvan.lab_28;

public class Order {
    private int totalCost = 0;
    private IPay strategy;

    public void processOrder(IPay strategy) {
        this.strategy = strategy;
        strategy.collectPaymentDetails();
        }

    public void setTotalCost(int cost) throws Exception {
        this.totalCost += cost;
        if(this.totalCost > strategy.getBalance()){
            throw new Exception("Negative Balance, total: " + totalCost + ", balance: " + strategy.getBalance());
        }
    }

    public int getTotalCost() {
        return totalCost;
    }
}