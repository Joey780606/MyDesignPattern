package Interpreter1;

/*
 Author: Joey
 Data: 20/09/29
 Website: https://ithelp.ithome.com.tw/articles/10208556
 Explanation: 總介紹在 BrowserContext.java
   1. BrowserContext.java - UML裡的Context,好像是跟interpreter外的全域資訊,在此例中沒有太多著墨. 但或許可將
      資料放在 NonterminalExpression.java, TerminalExpresssion.java 裡做別的執行
   2. AbstractExpression.java, 是一個 abstract class, 當成第3,第4項的父類別
   3. NonterminalExpression.java, 繼承第2項,顯示 "非終端的解釋器"
   4. TerminalExpression.java, 繼承第2項,顯示 "終端的解釋器"

   5. ThirdActivityPresenter.java > execInterpreter1() 來執行 Interpreter1().
 */

public class BrowserContext {
    private String text;
    public String browserText;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
