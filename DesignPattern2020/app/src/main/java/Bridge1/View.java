package Bridge1;

/*
 Author: Joey
 Data: 20/09/26
 Explanation: 總介紹在 View.java
   1. View.java - abstract class, 跟 Resources 有關連(Association)
   2. Resources.java - 是 interface, 算是為了顯示不同資訊而設定的框架
   3. Book.java - 跟 Bag 一樣, 實作 Resources interface, 把顯示不同資訊的框架實作
   4. Bag.java - 跟 Book 一樣, 實作 Resources interface, 把顯示不同資訊的框架實作
   5. FewView.java - 是只顯示部分資訊頁面, 繼承 View, 因 View 跟 resources.java 有關連,只要設好View控制的resources是誰,就可以直接對 resources 下指令
   6. FullView.java - 是只顯示全部資訊頁面, 繼承 View, 因 View 跟 resources.java 有關連,只要設好View控制的resources是誰,就可以直接對 resources 下指令
   7. SecondActivityPresenter.java > execBridge1 - 是實作的部分
 */

public abstract class View {
    Resources resources;

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    //    定義畫面如何擺放, 這裡不實踐, 由繼承他的類別來實踐
    public abstract void show();
}
