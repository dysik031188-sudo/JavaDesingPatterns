interface Coffee { double getCost(); }

class SimpleCoffee implements Coffee {
    public double getCost() { return 50; }
}

class MilkDecorator implements Coffee {
    private Coffee coffee;
    public MilkDecorator(Coffee coffee) { this.coffee = coffee; }
    public double getCost() { return coffee.getCost() + 20; }
}
