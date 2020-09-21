package Adapter1;

/*
 Author: Joey
 Data: 20/09/21
 Explanation:
   1. BlackmanTranslator.java, 繼承 People, AS會自動亮起 燈泡,要你加入 hello() & selfIntro() 的函數
       ,這是在做黑人講的話的翻譯動作
 */

import pcp.com.designpattern.MainActivityContract;

public class BlackmanTranslator extends People {
    public BlackmanTranslator(String name, MainActivityContract.View view) {
        super(name, view);
    }

    @Override
    public void hello() {
        view.showLog(getName() + ":哩甲霸咩～真的假的！？");
    }

    @Override
    public void selfIntro() {
        view.showLog("大家好我是" + getName() + "，現在台北工作。");
    }
}
