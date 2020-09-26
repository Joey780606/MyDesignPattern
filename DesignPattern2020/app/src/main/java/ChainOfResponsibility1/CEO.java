package ChainOfResponsibility1;

import pcp.com.designpattern.ThirdActivityContract;

/*
 Author: Joey
 Data: 20/09/26
 Explanation: 總介紹在 Handler.java
   CEO.java - 繼承 Handler, 高階管理者, 中間管理者不能處理時,由他來處理
 */

public class CEO extends Handler {
    ThirdActivityContract.View view;

    public CEO(ThirdActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void handleRequest(Trouble trouble) {
        view.showLog("=== CEO 處理 ===");
        view.showLog("CEO : " + trouble.getName() + "是誰搞的！叫他過來。" );
    }
}
