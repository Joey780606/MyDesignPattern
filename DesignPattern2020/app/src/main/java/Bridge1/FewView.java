package Bridge1;

/*
 Author: Joey
 Data: 20/09/26
 Explanation: 總介紹在 View.java
   FewView.java - 是只顯示部分資訊頁面, 繼承 View, 因 View 跟 resources.java 有關連,所以可以直接對 resources 下指令
 */

public class FewView extends View {
    @Override
    public void show() {
        resources.photo();
        resources.snippet();
    }
}
