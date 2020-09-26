package ChainOfResponsibility1;

/*
 Author: Joey
 Data: 20/09/26
 Explanation: 總介紹在 Handler.java
   1. Handler.java - abstract class, 操作(處理)者, handleRequest可處理遇到的問題(有帶Trouble變數,看似被定型,但實務上或許可用一String來做parsing誰處理的動作)
   2. Manager.java - 繼承 Handler, 中間管理者,建構時會設定他不能處理時,要給誰處理(new CEO),並針對狀況做處理,若不是自己該負責的事,就往下個可能可處理的人處理
   3. CEO.java - 繼承 Handler, 高階管理者, 中間管理者不能處理時,由他來處理
   4. Trouble.java - 要處理的問題
 */

import pcp.com.designpattern.ThirdActivityContract;

public abstract class Handler {
    Handler successor;  // 繼任者, 如果自己處理不來,就交給繼任者

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Trouble trouble);
}
