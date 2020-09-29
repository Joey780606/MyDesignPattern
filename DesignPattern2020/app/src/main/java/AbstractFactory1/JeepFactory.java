package AbstractFactory1;

/*
 Author: Joey
 Data: 20/09/29
 Website: https://ithelp.ithome.com.tw/articles/10208955
 Explanation: 整體解釋在 Audi.java
   JeepFactory.java - Jeep的工廠, 繼承 AbstractFactory (new 子類別,但return 的是父類別)
 */

public class JeepFactory extends AbstractFactory {
    @Override
    public Audi createAudi() {
        return new AudiJeep();
    }

    @Override
    public BMW createBMW() {
        return new BMWJeep();
    }
}
