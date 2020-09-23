package State1;

/*
 Author: Joey
 Data: 20/09/23
 Explanation: 總介紹在 State.java
   參考: https://ithelp.ithome.com.tw/articles/10206608
   1. State.java 算是基本的template, 公制,英制都由此 abstract class再延伸出來
   2. Metric.java 是公制處理,由 State.java abstract class再拓展出來,公制很單純,不用轉換
   3. British.java 是英制處理,由 State.java abstract class再拓展出來,英制需要把公制的資料做一轉換
   4. MetricSystem.java 這應是 UML 裡的 Context,提供參數讓使用者決定要用 Metric 或 British
 */

public abstract class State {
    // 顯示的數值
    abstract public String tempToDisplay(Double temperature);
    abstract public String vibToDisplay(Double vibration);

    // 儲存的數值
    abstract public String tempToSave(Double temperature);
    abstract public String vibToSave(Double vibration);

    // 精準到小數點下兩位
    public static String twoDecPlaces(Double value) {   //注意是 static
        return String.format("%.2f", value);
    }

    public static String saveFrom(Double value) {
        return String.format("%f", value);
    }
}
