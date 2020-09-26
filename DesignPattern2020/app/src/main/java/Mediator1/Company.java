package Mediator1;

/*
 Author: Joey
 Data: 20/09/26
 Explanation: 總介紹在 Company.java
   1. Company.java - 介面,裡面是建立 Company 相關的工作(有多項), 跟 CoWorker 有依賴(dependency)
   2. CoWorker.java - abstract class, 裡面有 boss 成員變數, 表示跟 boss有 關連(association)
        裡面還有 abstract work() 來給繼承他的 子類別 發揮
   3. Boss.java - implements Company, 處理interface 的作業
   4. PM.java - 是員工的一部分,所以 extends CoWorker, 也可加想加的 function (ex: bossHelp.java)
   5. Programmer.java  - 是員工的一部分,所以 extends CoWorker
   6. ThirdActivityPresenter.java > execMediator1() 執行程式

   從此例看起來, Company.java 是 Mediator, Boss.java 是 Concrete Mediator
 */

public interface Company {
    public void addMember(CoWorker coWorker);
    public void introduce(CoWorker coWorker);
    public void workHard();
    public void giveWork(CoWorker coWorker);
}
