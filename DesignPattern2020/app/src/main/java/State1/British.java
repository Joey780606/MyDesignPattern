package State1;

/*
 Author: Joey
 Data: 20/09/23
 Explanation: 總介紹在 State.java
   1. British.java 是英制處理,由 State.java abstract class再拓展出來,英制需要把公制的資料做一轉換
 */

import pcp.com.designpattern.SecondActivityContract;

public class British extends State {
    SecondActivityContract.View view;

    public British(SecondActivityContract.View view) {
        this.view = view;
    }

    //    公制資料顯示成英制
    @Override
    public String tempToDisplay(Double temperature) { //溫度
        view.showLog(String.format("%s:%f", "顯示英制溫度", temperature));
        return twoDecPlaces(temperature * 9 / 5 + 32);
    }

    @Override
    public String vibToDisplay(Double vibration) { // 震動
        view.showLog(String.format("%s:%f", "顯示英制震動", vibration));
        return twoDecPlaces(vibration * 25.4);
    }

    //    英制資料儲存成公制
    @Override
    public String tempToSave(Double temperature) {
        view.showLog(String.format("%s:%f", "儲存英制溫度", temperature));
        return saveFrom((temperature - 32) * 5 / 9);    //應該要和上方 tempToDisplay 處理一樣,應該是弄錯了,但就先醬
    }

    @Override
    public String vibToSave(Double vibration) {
        view.showLog(String.format("%s:%f", "儲存英制震動", vibration));
        return saveFrom(vibration / 25.4);    //應該要和上方 vibToDisplay 處理一樣,應該是弄錯了,但就先醬
    }
}
