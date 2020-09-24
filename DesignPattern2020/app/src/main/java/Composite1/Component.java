package Composite1;

import java.util.ArrayList;
import java.util.List;

import pcp.com.designpattern.SecondActivityContract;

/*
 Author: Joey
 Data: 20/09/24
 Explanation: 總介紹在 Component.java
   Component - 公司和公司下的子公司和部門共同介面
   Composite - 可以有子元件的Composite, 同時可以針對子元件增加多個方法
   Leaf - 不能有子元件的 Leaf, 同時可以針對子元件增加多個方法
   SecondActivityPresenter > void execComposite1() 真正執行
   這個是大公司底下有子公司,還有最小的部分,大家的架構都相同,當有要傳送指令,或做一些動作時,可以通知到所有較下層的單位
 */

public abstract class Component {   // 算是一個樣板,所以用 abstract
    SecondActivityContract.View view;
    String name;
    List<Component> componentList = new ArrayList<>();

    public Component(String name, SecondActivityContract.View view) {
        this.name = name;
        this.view = view;
    }

    public void add(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        componentList.remove(component);
    }

    public void display(int depth) {
        String sShowLine = "";
        for(int i = 0; i < depth; i++) {
            //view.showLog("-");
            sShowLine += "-";
        }
        view.showLog(sShowLine);

        view.showLog(this.name);

        for(Component c: componentList) {
            c.display(depth + 2);
        }
    }

    public void command(String command) {
        view.showLog(this.name + " " + command);
        for (Component c: componentList) {
            c.command(command);
        }
    }
}
