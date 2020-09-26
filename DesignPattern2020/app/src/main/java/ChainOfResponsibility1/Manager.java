package ChainOfResponsibility1;

/*
 Author: Joey
 Data: 20/09/26
 Explanation: 總介紹在 Handler.java
   Manager.java - 繼承 Handler, 中間管理者,建構時會設定他不能處理時,要給誰處理(new CEO),並針對狀況做處理,若不是自己該負責的事,就往下個可能可處理的人處理
 */

import pcp.com.designpattern.ThirdActivityContract;

public class Manager extends Handler {
    ThirdActivityContract.View view;

    public Manager(ThirdActivityContract.View view) {
//        為了方便在這邊設定上級是誰
//        可以轉換到客戶端設定
        setSuccessor(new CEO(view));    //這意思是指目前的職位若無法處理時,再傳給更大的職位處理 (這裡是直接 new 一個 CEO )
        this.view = view;
    }

    @Override
    public void handleRequest(Trouble trouble) {
        view.showLog("=== Manager 處理 ===");
        if(trouble.getMoney() > 1000) {
            view.showLog("Manager : " + trouble.getName() + "有點頭大,要跟上級裁示。" );
            successor.handleRequest(trouble);
        } else {
            view.showLog("Manager : " + trouble.getName() + "是小問題，不用擔心。" );
        }

    }
}
