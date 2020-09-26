package Mediator1;

import pcp.com.designpattern.ThirdActivityContract;

/*
 Author: Joey
 Data: 20/09/26
 Explanation: 總介紹在 Company.java
   Programmer.java  - 是員工的一部分,所以 extends CoWorker
 */

public class Programmer extends CoWorker {
    public Programmer(String name, ThirdActivityContract.View view) {
        super(name, view);
    }

    @Override
    public void work() {
        this.view.showLog(this.name +  "寫程式");
    }

}
