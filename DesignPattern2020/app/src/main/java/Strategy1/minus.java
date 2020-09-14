package Strategy1;

/*
 Author: Joey
 Data: 20/09/08
 Explanation: 整體解釋在 IStrategy.java, 這是策略的實作之一,減法
 */
public class minus implements IStrategy {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
