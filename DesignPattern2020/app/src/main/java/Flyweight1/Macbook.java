package Flyweight1;

import androidx.annotation.NonNull;
import pcp.com.designpattern.SecondActivityContract;

/*
 Author: Joey
 Data: 20/09/23
 Explanation: 總介紹在 Macbook.java
   1. Monitor.java : 共有的資料,每台 Macbook 都有螢幕
   2. MacbookFactory.java : 工廠模式的應用，用來建立並管理Flyweight物件，如果物件不存在則建立，存在則返回已建立的物件
     HashMap的使用,很重要
   3. CustomSetting.java - 儲存一些使用者設定的類別,像 Macbook 可選較低等級,也可以選較高等級,同樣也可以自由選擇cpu, hd, memory的等級
   4. Macbook.java - 主要class,建立各種型態的 Macbook
        有 enum的做法,很重要
   5. SecondActivityPresenter > void execFlyweight1() 真正執行
 */

public class Macbook extends Monitor {
    SecondActivityContract.View view = null;

    // 很酷的做法,沒用過,要學
    public enum Spec {
        LOW ( CustomSetting.LOW ) , HIGH ( CustomSetting.HIGH );
        // CustomSetting.LOW 就會去 new CustomSetting("LOW") 的 CustomSetting 參數

        CustomSetting customSetting;
        Spec(CustomSetting customSetting) {  //建構子?
            this.customSetting = customSetting;
        }

        public CustomSetting getCustomSetting() {
            return customSetting;
        }
    }

    private CustomSetting customSetting;

    // 二種建構者
    public Macbook(Spec spec, SecondActivityContract.View view) {
        this.customSetting = spec.getCustomSetting();
        this.view = view;
    }

    public Macbook(CustomSetting customSetting, SecondActivityContract.View view) {
        this.customSetting = customSetting;
        this.view = view;
    }

    public void setCustomSetting(CustomSetting customSetting) {
        this.customSetting = customSetting;
    }

    @NonNull
    @Override
    public String toString() {
        return "CustomSetting = { " + "\n" +
                "cpu = " + customSetting.getCpu() + "\n" +
                "memory = " + customSetting.getMemory() + "\n" +
                "storage = " + customSetting.getStorage() + "\n" +
                "monitor = " + getMonitor() + "\n" +
                "}";
    }
}
