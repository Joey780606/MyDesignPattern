package Facade1;

import pcp.com.designpattern.MainActivityContract;

/*
 Author: Joey
 Data: 20/09/22
 Explanation: 總介紹在 Facade.java
   這會把雜亂無章的類別,依實際需要做整理後,用另幾個function再組成較有意義的function
   MainActivityPresenter.java > execFacade1() 這個會來實作此 Pattern
 */

public class Facade {
    private MainActivityContract.View view;
    SubClassOne one;
    SubClassTwo two;
    SubClassThree three;
    ClassOne four;

    public Facade(MainActivityContract.View view) {
        this.view = view;
        one = new SubClassOne(view);
        two = new SubClassTwo(view);
        three = new SubClassThree(view);
        four = new ClassOne(view);
    }

    public void MethodA() {
        four.MethodFour();
        one.MethodOne();
    }

    public void MethodB() {
        two.MethodTwo();
        three.MethodThree();
    }
}
