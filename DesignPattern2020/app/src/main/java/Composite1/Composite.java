package Composite1;

import pcp.com.designpattern.SecondActivityContract;

/*
 Author: Joey
 Data: 20/09/24
 Explanation: 總介紹在 Component.java
   Composite - 可以有子元件的Composite, 同時可以針對子元件增加多個方法
 */

public class Composite extends Component {
    public Composite(String name, SecondActivityContract.View view) {
        super(name, view);
    }
}
