package AbstractFactory1;

/*
 Author: Joey
 Data: 20/09/29
 Website: https://ithelp.ithome.com.tw/articles/10208955
 Explanation: 整體解釋在 Audi.java
   AudiJeep.java - Audi 的 Jeep,繼承 Audi
 */

public class AudiJeep extends Audi {
    public AudiJeep() {
        super();
        setType("Jeep");
    }
}
