package Visitor1;

/*
 Author: Joey
 Data: 20/09/29
 Explanation: 整體解釋在 Weather.java
   VisitI.java - interface, 裡面有二個多型的函式,帶的參數不一樣, 這個interface會和 AirQuality & Temperature 產生關聯
      (我後來改成 VisitI,比較清楚)
 */

public interface VisitI {
    public void visit(AirQuality airQuality);
    public void visit(Temperature temperature);
}
