package AbstractFactory1;

/*
 Author: Joey
 Data: 20/09/29
 Website: https://ithelp.ithome.com.tw/articles/10208955
 Explanation: 整體解釋在 Audi.java
   1. Audi.java - 使用 abstract class
     (Why?
       a. 好像是繼承他的子類別,並不一定要走super(),而是可以只走自己的路?
       b. 使用abstract,才可以做像 "new 子類別,但return 的是父類別" ?  ex: JeepFactory.java)
   2. AudiSUV.java - Audi 的 SUV,繼承 Audi
   3. AudiJeep.java - Audi 的 Jeep,繼承 Audi

   4. BMW.java - 使用 abstract class (Why?), 跟 Audi.java幾乎一樣
   5. BMWSUV.java - BMW 的 SUV,繼承 BMW
   6. BMWJeep.java - BMW 的 Jeep,繼承 BMW

   7. AbstractFactory.java - 抽象工廠,是一個 abstract class (以此類別與 Audi & BMW 產生依賴)
   8. JeepFactory.java - Jeep的工廠, 繼承 AbstractFactory (new 子類別,但return 的是父類別)
   9. SUVFactory.java - SUV的工廠, 繼承 AbstractFactory (new 子類別,但return 的是父類別)

   ThirdActivityPresenter.java > presenter.execAbstractFactory1
 */

public abstract class Audi {    // abstract class
    private String brand;   //這固定會是 Audi
    private String type;

    public Audi() {
        this.brand = "Audi";
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }
}
