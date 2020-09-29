package AbstractFactory1;

/*
 Author: Joey
 Data: 20/09/29
 Website: https://ithelp.ithome.com.tw/articles/10208955
 Explanation: 整體解釋在 Audi.java
   4. BMW.java - 使用 abstract class (Why?), 跟 Audi.java幾乎一樣
 */

public abstract class BMW {
    private String brand;   //這固定會是 BMW
    private String type;

    public BMW() {
        this.brand = "BMW";
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
