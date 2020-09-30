package Iterator1;

/*
 Author: Joey
 Data: 20/09/25
 Explanation: 總介紹在 Employee.java
   CompanyA.java - A公司,裡面有多名員工,先建一個List放公司的員工, 因為此類 implements Aggregate, 所以經由new CompanyAIterator(this) 來把 CompanyA
     與 Iterator做結合
     這是 UML 裡的 Concrete aggregate, (aggregate有聚合)的意思,這Employee就是需聚合的物件 (公司員工等)
 */

import java.util.ArrayList;
import java.util.List;

public class CompanyA implements Aggregate {    //Concrete aggregate, (aggregate有聚合)的意思,這可能指要聚合的物件(像公司的員工等)
    List<Employee> employees = new ArrayList<>();   //CompanyA 與 Employee有關聯(Association)關係

    public CompanyA() {
        //為了方便先預先放入員工
        employees.add(new Employee("小萱","業務"));
        employees.add(new Employee("小尉","工程師"));
        employees.add(new Employee("小陞","程序猿"));
        employees.add(new Employee("阿偉","專案管理"));
        employees.add(new Employee("小詩","吉祥物"));
        employees.add(new Employee("阿農","分析兼司機"));
    }

    @Override
    public Iterator CreateIterator() {
        return new CompanyAIterator(this);
    }
}
