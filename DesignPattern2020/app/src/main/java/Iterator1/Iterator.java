package Iterator1;

/*
 Author: Joey
 Data: 20/09/25
 Explanation: 總介紹在 Employee.java
   Iterator.java - 從頭到尾跑一遍,基本的介面
 */

public interface Iterator {
    public Object First();
    public Object Next();
    public boolean IsDone();
    public Object CurrentItem();
}
