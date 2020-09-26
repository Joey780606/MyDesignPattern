package Mediator1;

import pcp.com.designpattern.ThirdActivityContract;

/*
 Author: Joey
 Data: 20/09/26
 Explanation: 總介紹在 Company.java
   CoWorker.java - abstract class, 裡面有 boss 成員變數, 表示跟 boss有 關連(association)
        裡面還有 abstract work() 來給繼承他的 子類別 發揮
 */

public abstract class CoWorker {
    ThirdActivityContract.View view;
    String name;
    Boss boss;

    public CoWorker(String name, ThirdActivityContract.View view) {
        this.name = name;
        this.view = view;
    }

    public abstract void work();
}
