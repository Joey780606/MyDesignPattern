package AbstractFactory1;

/*
 Author: Joey
 Data: 20/09/29
 Website: https://ithelp.ithome.com.tw/articles/10208955
 Explanation: 整體解釋在 Audi.java
   BMWSUV.java - BMW 的 SUV,繼承 BMW
 */

public class BMWSUV extends BMW { //繼承 BMW, 只要修改 Type 就好了
    public BMWSUV() {
        super();
        setType("SUV");
    }
}
