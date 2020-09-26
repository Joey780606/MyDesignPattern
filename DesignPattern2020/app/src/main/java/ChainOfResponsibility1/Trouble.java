package ChainOfResponsibility1;

/*
 Author: Joey
 Data: 20/09/26
 Explanation: 總介紹在 Handler.java
   4. Trouble.java - 要處理的問題
 */

public class Trouble {
    private String name;
    private int money;

    public Trouble(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }
}
