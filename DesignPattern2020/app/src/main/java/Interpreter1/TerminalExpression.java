package Interpreter1;

import pcp.com.designpattern.ThirdActivityContract;

/*
 Author: Joey
 Data: 20/09/29
 Website: https://ithelp.ithome.com.tw/articles/10208556
 Explanation: 總介紹在 BrowserContext.java
   TerminalExpression.java, 繼承第2項,顯示 "終端的解釋器"
 */

public class TerminalExpression extends AbstractExpression{
    ThirdActivityContract.View view;

    public TerminalExpression(ThirdActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void interpret(BrowserContext context) {
        view.showLog("終端的解釋器");

    }
}
