package AbstractFactory1;

/*
 Author: Joey
 Data: 20/09/29
 Website: https://ithelp.ithome.com.tw/articles/10208955
 Explanation: 整體解釋在 Audi.java
   BMWJeep.java - BMW 的 Jeep,繼承 BMW
 */

public class BMWJeep extends BMW {
    public BMWJeep() {
        super();
        setType("Jeep");
    }
}
