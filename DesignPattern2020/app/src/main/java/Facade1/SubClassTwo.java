package Facade1;

import pcp.com.designpattern.MainActivityContract;

/*
 Author: Joey
 Data: 20/09/22
 Explanation: 總介紹在 Facade.java
   SubClassTwo.java : 此類別是雜亂介紹章節的某一類別
 */

public class SubClassTwo {
    private MainActivityContract.View view;

    public SubClassTwo(MainActivityContract.View view) {
        this.view = view;
    }
    public void MethodTwo() {
        view.showLog("Message 2");
    }
}
