package Bridge1;

/*
 Author: Joey
 Data: 20/09/26
 Explanation: 總介紹在
   Bag.java - 跟 Book 一樣, 實作 Resources interface
 */

import pcp.com.designpattern.SecondActivityContract;

public class Bag implements Resources {
    SecondActivityContract.View view;

    public Bag(SecondActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void photo() {
        view.showLog("書本的照片");
    }

    @Override
    public void snippet() {
        view.showLog("書本的簡短說明");
    }

    @Override
    public void describe() {
        view.showLog("書本詳細說明");
    }
}
