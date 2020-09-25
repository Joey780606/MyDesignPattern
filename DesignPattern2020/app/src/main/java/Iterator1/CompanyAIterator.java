package Iterator1;

/*
 Author: Joey
 Data: 20/09/25
 Explanation: 總介紹在 Employee.java
   CompanyAIterator.java - Iterator介面的實作
 */

public class CompanyAIterator implements Iterator {

    private CompanyA companyA;
    private int current = 0;

    public CompanyAIterator(CompanyA companyA) {
        this.companyA = companyA;
    }

    @Override
    public Object First() {
        return companyA.employees.get(current);  //回傳值是用Object的型態,了解&學習
    }

    @Override
    public Object Next() {
        Object ret = null;  //回傳值是用Object的型態,了解&學習
        current++;
        if(current < companyA.employees.size()) {
            ret = companyA.employees.get(current);
        }
        return ret;
    }

    @Override
    public boolean IsDone() {
        return current >= companyA.employees.size() ? true : false;
    }

    @Override
    public Object CurrentItem() {
        return companyA.employees.get(current);
    }
}
