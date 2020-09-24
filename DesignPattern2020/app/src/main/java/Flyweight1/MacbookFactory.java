package Flyweight1;

import java.util.HashMap;

import pcp.com.designpattern.SecondActivityContract;

/*
 Author: Joey
 Data: 20/09/23
 Explanation: 總介紹在 Macbook.java
   MacbookFactory.java : 工廠模式的應用，用來建立並管理Flyweight物件，如果物件不存在則建立，存在則返回已建立的物件
     HashMap的使用,很重要
 */


public class MacbookFactory {
    // HashMap 很重要,要學
    SecondActivityContract.View view = null;
    private HashMap<CustomSetting, Macbook> cache = new HashMap();

    public MacbookFactory(SecondActivityContract.View view) {
        this.view = view;
    }

    public Macbook getCustomMacbook(CustomSetting key) {
        if(cache.containsKey(key)) {
            view.showLog("getCustomMacbook containsKey find");
            return cache.get(key);
        }

        view.showLog("getCustomMacbook new Macbook 001");
        Macbook macbook = new Macbook(key, view);
        cache.put(key, macbook);
        return macbook;
    }

    public Macbook getMacbook(Macbook.Spec spec) {
        if(cache.containsKey(spec.getCustomSetting())) {
            view.showLog("getMacbook containsKey find");
            return cache.get(spec.getCustomSetting());
        }

        view.showLog("getMacbook new Macbook 002");
        Macbook macbook = new Macbook(spec, view);
        cache.put(spec.getCustomSetting(), macbook);
        return macbook;
    }
}
