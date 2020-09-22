package Facade1;

import pcp.com.designpattern.MainActivityContract;

/*
 Author: Joey
 Data: 20/09/22
 Explanation: 總介紹在 Facade.java
   ClassOne.java : 此類別是雜亂介紹章節的某一類別
 */

public class ClassOne {
    private MainActivityContract.View view;

    public ClassOne(MainActivityContract.View view) {
        this.view = view;
    }
    public void MethodFour() {
        view.showLog("Message 4");
    }
}
