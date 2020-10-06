package Visitor1;

import pcp.com.designpattern.ThirdActivityContract;

/*
 Author: Joey
 Data: 20/09/29
 Explanation: 整體解釋在 Weather.java
   Man.java - 繼承 Visit.java - 設定 Visit.java 相關的二個 function, 跟Temperature 和 AirQuality的關
      連, 可依 class關心的是什麼,來對各Visit設定不同的處理, 像男生比較關心溫度,就對溫度做較多的處理
 */
public class Man implements VisitI {
    ThirdActivityContract.View view;

    public Man(ThirdActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void visit(AirQuality airQuality) {
        view.showLog("稍微看一下空氣品質：" + airQuality.airQuality);
    }

    @Override
    public void visit(Temperature temperature) {
        //假設男生比較關心溫度
        view.showLog("關心一下：" + temperature.getTempGraph());
    }
}
