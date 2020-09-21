package Proxy1;

/*
 Author: Joey
 Data: 20/09/21
 Explanation: 買房子的介面
   1. IBuyHouse.java : 買房子的介面
   2. LittleEngineer : 小小工程師,真正要買房的人
   3. EstateAgent : 房仲幫小工程師代理買房,重點在這個,需要把小小工程師的變數加入並顯示
 */

public interface IBuyHouse {
    public void findHouse();    // 找適合的房子
    public void priceTooHigh(); // 跟屋主說太貴
    public void defendPrice();  // 向屋主防禦價錢,請求降價
    public void finish();       // 成交後，簡化從付訂金到交屋的過程。
}
