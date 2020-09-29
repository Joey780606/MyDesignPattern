package Visitor1;

/*
 Author: Joey
 Data: 20/09/29
 Explanation: 整體解釋在 Weather.java
   1. Weather.java - abstract class, 基底的class, temperature, airQuality 跟 class 有組合關係
   2. Temperature.java - 繼承 Weather.java, 多一 getTempGraph function.
   3. AirQuality.java - 繼承 Weather.java, 多一 getAirQGraph function.
   4. Visit.java - interface, 裡面有二個多型的函式,帶的參數不一樣, 這個interface會和 AirQuality & Temperature 產生關聯
   5. Man.java - 繼承 Visit.java - 設定 Visit.java 相關的二個 function, 跟Temperature 和 AirQuality的關
      連, 可依 class關心的是什麼,來對各Visit設定不同的處理, 像男生比較關心溫度,就對溫度做較多的處理
   6. Woman.java - 繼承 Visit.java - 設定 Visit.java 相關的二個 function, 跟Temperature 和 AirQuality的
      關連, 可依 class關心的是什麼,來對各Visit設定不同的處理, 像女生比較關心空氣品質,就對空氣品質做較多的處理

   ThirdActivityPresenter.java > execVisitor1 執行
 */

public abstract class Weather {
    double temperature;
    double airQuality;

    public Weather() {
        temperature = Math.random() * 30;
        airQuality = Math.random() * 300;
    }

    public abstract void accept(Visit visit);
}
