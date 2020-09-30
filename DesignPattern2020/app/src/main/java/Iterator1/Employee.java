package Iterator1;

/*
 Author: Joey
 Data: 20/09/25
 Explanation: 總介紹在 Employee.java
   1. Employee.java - 一名員工的基本資料
   2. Aggregate.java - 介面,裡面是建立Iterator的function, 回傳 Iterator
   3. CompanyA.java - A公司,裡面有多名員工,先建一個List放公司的員工, 因為此類 implements Aggregate, 所以經由new CompanyAIterator(this) 來把 CompanyA
     與 Iterator做結合
     這是 UML 裡的 Concrete aggregate, (aggregate有聚合)的意思,這Employee就是需聚合的物件 (公司員工等)
   4. Iterator.java -  介面,從頭到尾跑一遍,基本的介面
   5. CompanyAIterator.java - Concrete iterator
 */

public class Employee {
    String name;
    String title;

    public Employee(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
}
