package AbstractFactory1;

/*
 Author: Joey
 Data: 20/09/29
 Website: https://ithelp.ithome.com.tw/articles/10208955
 Explanation: 整體解釋在 Audi.java
   AbstractFactory.java - 抽象工廠,是一個 abstract class (以此類別與 Audi & BMW 產生依賴)
 */

public abstract class AbstractFactory {
    public abstract Audi createAudi();
    public abstract BMW createBMW();
}
