package Mediator1;

import pcp.com.designpattern.ThirdActivityContract;

/*
 Author: Joey
 Data: 20/09/26
 Explanation: 總介紹在 Company.java
   PM.java - 是員工的一部分,所以 extends CoWorker, 也可加想加的 function (ex: bossHelp.java)
 */

public class PM extends CoWorker {
    public PM(String name, ThirdActivityContract.View view) {
        super(name, view);    //使用 CoWorker.java 的建構子
    }

    @Override
    public void work() {
        view.showLog(this.name + "做PM工作");  //重要: 此類別沒宣告 view, 而是直接用父類別的 view
    }

    public void bossHelp(CoWorker coWorker) {   // 這是PM class新增的 function
        this.boss.giveWork(coWorker);
    }
}
