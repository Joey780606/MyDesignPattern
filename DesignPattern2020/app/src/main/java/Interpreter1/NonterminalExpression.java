package Interpreter1;

import pcp.com.designpattern.ThirdActivityContract;

/*
 Author: Joey
 Data: 20/09/29
 Website: https://ithelp.ithome.com.tw/articles/10208556
 Explanation: 總介紹在 BrowserContext.java
   1. NonterminalExpression.java, 繼承第2項,顯示 "非終端的解釋器"
 */

public class NonterminalExpression extends AbstractExpression {
    ThirdActivityContract.View view;

    public NonterminalExpression(ThirdActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void interpret(BrowserContext context) {
        view.showLog("非終端的解釋器");
    }
}
