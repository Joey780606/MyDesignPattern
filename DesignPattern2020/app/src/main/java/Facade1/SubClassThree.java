package Facade1;

import pcp.com.designpattern.MainActivityContract;

/*
 Author: Joey
 Data: 20/09/22
 Explanation: 總介紹在 Facade.java
   SubClassThree.java : 此類別是雜亂介紹章節的某一類別
 */

public class SubClassThree {
    private MainActivityContract.View view;

    public SubClassThree(MainActivityContract.View view) {
        this.view = view;
    }
    public void MethodThree() {
        view.showLog("Message 3");
    }
}
