package Memento1;

import java.util.ArrayList;
import java.util.List;

/*
 Author: Joey
 Data: 20/09/23
 Explanation: 總介紹在 ComputerMemento.java
   參考: https://ithelp.ithome.com.tw/articles/10206939
   1. ComputerCareTaker 存放這些資訊的類別(儲存區,可 取/save)
 */

public class ComputerCareTaker {
    // 最多備份15筆
    private static final int MAX = 15;

    public List<ComputerMemento> saves = new ArrayList<>();

    // 獲取電腦資訊
    public ComputerMemento getSave(int index) {
        if(index > saves.size() - 1)    //若 index 大於最大值,就取最後一個
            index = saves.size() - 1;

        return saves.get(index);
    }

    // 把電腦資訊加到 List 裡
    public void saveMemento(ComputerMemento memento) {
        if(saves.size() > MAX) {
            saves.remove(0);
        }
        saves.add(memento);
    }

}
