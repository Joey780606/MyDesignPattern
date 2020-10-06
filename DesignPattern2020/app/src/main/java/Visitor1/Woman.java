package Visitor1;

import pcp.com.designpattern.ThirdActivityContract;

/*
 Author: Joey
 Data: 20/09/29
 Explanation: 整體解釋在 Weather.java
   6. Woman.java - 繼承 Visit.java - 設定 Visit.java 相關的二個 function, 跟Temperature 和 AirQuality的
      關連, 可依 class關心的是什麼,來對各Visit設定不同的處理, 像女生比較關心空氣品質,就對空氣品質做較多的處理
 */

public class Woman implements VisitI {
    ThirdActivityContract.View view;

    public Woman(ThirdActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void visit(AirQuality airQuality) {
        //女生比較關心空氣品質
        view.showLog("關心一下：" + airQuality.getAirQGraph());
    }

    @Override
    public void visit(Temperature temperature) {
        view.showLog("稍微看一下溫度：" + temperature.temperature);
    }
}
