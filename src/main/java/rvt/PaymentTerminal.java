package rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.5){
            double change = payment - 2.5;
            this.money += 2.5;
            this.affordableMeals++;
            return change;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.3){
            double change = payment - 4.3;
            this.money += 4.3;
            this.heartyMeals++;
            return change;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.5){
            card.takeMoney(2.5);
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.3){
            card.takeMoney(4.3);
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
        this.money += sum;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
