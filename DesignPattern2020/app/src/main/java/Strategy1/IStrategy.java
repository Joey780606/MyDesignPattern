package Strategy1;

/*
 Author: Joey
 Data: 20/09/08
 Explanation:
   1. IStrategy.java : 策略,不用實體class,而是用interface,以便各式各樣的擴充
   2. add.java, minus.java, multiply.java, divide.java 加減乘除,使用 IStrategy.java 來擴充更多策略
   3. Calculator.java : 用一class裝這個算法,用簡單的工廠模式封裝一下
   4. MainActivityPresenter.java > execStrategy1 是執行策略模式一的方法
 */
public interface IStrategy {
    public int calculate(int a, int b);
}
