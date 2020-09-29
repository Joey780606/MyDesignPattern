package AbstractFactory1;

/*
 Author: Joey
 Data: 20/09/29
 Website: https://ithelp.ithome.com.tw/articles/10208955
 Explanation: 整體解釋在 Audi.java
   AudiSUV.java - Audi 的 SUV,繼承 Audi
 */
public class AudiSUV extends Audi { //繼承 Audi, 只要修改 Type 就好了
    public AudiSUV() {
        super();
        setType("SUV");
    }
}
