package State1;

/*
 Author: Joey
 Data: 20/09/23
 Explanation: 總介紹在 State.java
   1. Metric.java 是公制處理,由 State.java abstract class再拓展出來,公制很單純,不用轉換
 */

import pcp.com.designpattern.SecondActivityContract;

public class Metric extends State {
    SecondActivityContract.View view;

    public Metric(SecondActivityContract.View view) {
        this.view = view;
    }

    @Override
    public String tempToDisplay(Double temperature) { //溫度
        view.showLog("顯示公制溫度");
        return twoDecPlaces(temperature);
    }

    @Override
    public String vibToDisplay(Double vibration) { // 震動
        view.showLog("顯示公制震動");
        return twoDecPlaces(vibration);
    }

    @Override
    public String tempToSave(Double temperature) {
        view.showLog("儲存公制溫度");
        return saveFrom(temperature);
    }

    @Override
    public String vibToSave(Double vibration) {
        view.showLog("儲存公制震動");
        return saveFrom(vibration);
    }
}
