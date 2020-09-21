package Adapter1;

/*
 Author: Joey
 Data: 20/09/21
 Explanation:
   1. BlackMan.java, 這隻可以把他當成第一版的程式
   2. People.java, 可把他當第二版,因為發現第一版少了 getName(), 所以就改設計一個Adapter.
 */

import pcp.com.designpattern.MainActivityContract;

public abstract class People {
    protected MainActivityContract.View view; //用這個來Show log
    String name;

    public People(String name, MainActivityContract.View view) {
        this.name = name;
        this.view = view;
    }

    public abstract void hello();
    public abstract void selfIntro();

    public String getName() {
        return name;
    }
}
