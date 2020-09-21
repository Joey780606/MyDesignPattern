package Adapter1;

/*
 Author: Joey
 Data: 20/09/21
 Explanation: 整體解釋在 People.java, 這隻可以把他當成第一版的程式
 */

import pcp.com.designpattern.MainActivityContract;

public class BlackMan {
    private MainActivityContract.View view; //用這個來Show log
    public String name;

    public BlackMan(String name, MainActivityContract.View view) {
        this.name = name;
        this.view = view;
    }

    public void helloEnglish() {
        view.showLog("yo~ what's up!! niga~");
    }

    public void selfIntroEnglish() {
        view.showLog("Hello, I am living in Taipei. " + " My name is " + this.name + ".");
    }
}
