package Composite1;

import pcp.com.designpattern.SecondActivityContract;

/*
 Author: Joey
 Data: 20/09/24
 Explanation: 總介紹在 Component.java
   Leaf - 不能有子元件的 Leaf, 同時可以針對子元件增加多個方法
 */

public class Leaf extends Composite {
    public Leaf(String name, SecondActivityContract.View view) {
        super(name, view);
    }

    @Override
    public void add(Component component) {
        view.showLog("Leaf cant add component");    // 直接複寫,而不用super的方式
    }

    @Override
    public void remove(Component component) {
        view.showLog("Leaf cant remove component");  // 直接複寫,而不用super的方式
    }

    @Override
    public void display(int depth) {
        super.display(depth);
    }
}
