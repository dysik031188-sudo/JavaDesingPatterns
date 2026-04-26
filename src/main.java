
interface PaymentStrategy {
    void pay(int amount);
}


class CreditCard implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Оплата картой: " + amount);
    }
}


class PayPal implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Оплата через PayPal: " + amount);
    }
}


class ShoppingCart {
    void finishOrder(PaymentStrategy strategy, int sum) {
        strategy.pay(sum);
    }
}

