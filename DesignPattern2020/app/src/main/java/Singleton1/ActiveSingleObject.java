package Singleton1;

/*
 Author: Joey
 Data: 20/09/29
 Explanation: 積極單例模式 : 在宣告靜態物件的時候就已經初始化
 */

public class ActiveSingleObject {

    //創建 ActiveSingleObject 的一個對象
    private static ActiveSingleObject instance = new ActiveSingleObject();

    //讓構造函數為 private，這樣該類就不會被實例化
    private ActiveSingleObject() {

    }

    //獲取唯一可用的對象
    public static ActiveSingleObject getInstance() {
        return instance;
    }
}
