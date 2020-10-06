package Visitor1;

/*
 Author: Joey
 Data: 20/09/29
 Explanation: 整體解釋在 Weather.java
   AirQuality.java - 繼承 Weather.java, 多一 getAirQGraph function.
 */

public class AirQuality extends Weather {
    public AirQuality() {
        super();    // 用父類別的
    }

    public String getAirQGraph() {
        return "空氣品質趨勢圖";
    }

    @Override
    public void accept(VisitI visit) {
        visit.visit(this);
    }
}
