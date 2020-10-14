package Strategy2;

//折價策略的介面
public abstract class IDiscountStrategy {
    double discount;

    private IDiscountStrategy() {}  //這應該是故意用private,不讓人家使用預設建構子

    public IDiscountStrategy(double discount) {
        this.discount = discount;
    }

    abstract public double getValue(double value);
}
