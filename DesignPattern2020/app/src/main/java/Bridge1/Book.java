package Bridge1;

/*
 Author: Joey
 Data: 20/09/26
 Explanation: 總介紹在
   Book.java - 跟 Bag 一樣,實作 Resources interface
 */

import pcp.com.designpattern.SecondActivityContract;

public class Book implements Resources {
    SecondActivityContract.View view;

    public Book(SecondActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void photo() {
        view.showLog("包包的照片");
    }

    @Override
    public void snippet() {
        view.showLog("包包的簡短說明");
    }

    @Override
    public void describe() {
        view.showLog("包包詳細說明");
    }
}
