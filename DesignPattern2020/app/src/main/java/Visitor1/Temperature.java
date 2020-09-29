package Visitor1;

/*
 Author: Joey
 Data: 20/09/29
 Explanation: 整體解釋在 Weather.java
   Temperature.java - 繼承 Weather.java, 多一 getTempGraph function.
 */

public class Temperature extends Weather {
    public Temperature() {
        super();    //使用 Weather 內的建構子
    }

    public String getTempGraph() {
        return "溫度趨勢圖";
    }

    @Override
    public void accept(Visit visit) {
        visit.visit(this);
    }
}
