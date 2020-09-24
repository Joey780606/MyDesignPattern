package Flyweight1;

/*
 Author: Joey
 Data: 20/09/23
 Explanation: 總介紹在 Macbook.java
   Monitor.java : 共有的資料,每台 Macbook 都有螢幕
 */

public class Monitor {
    private final String monitor = "Retina Display";

    public String getMonitor() {
        return monitor;
    }
}
