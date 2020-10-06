package Singleton1;

/*
 Author: Joey
 Data: 20/09/29
 Explanation: 雙重鎖單例模式 : 在宣告靜態物件的時候就已經初始化
   判斷兩次看起來有點奇怪，但其實這樣做是有原因的。 (這感覺是對第一次的 if(instance == null) 講的)
   instance = new Singleton();

   這句程式碼會被編譯成多條組合指令，大致上他做了三件事：
   1. 給Singleton的實例分配記憶體；
   2. 呼叫Singleton的建構函數，初始化成員欄位；
   3. 將instance物件指向分配的記憶體空間(此時instance不是null)。

   但是由於Java編譯器允許失序執行，所以 2. 和 3. 的順序是無法保證的，有可能 1-2-3 也有可能 1-3-2 。
   如果在 3. 執行完畢、2. 還沒執行之前，切換到線程Ｂ，那instance已經不是null，此時Ｂ取走instance再使用就會出錯。
 */

public class DoubleCheckLock {
    public static DoubleCheckLock instance;

    private DoubleCheckLock() {}

    public static DoubleCheckLock getInstance() {
        // 第一層判斷為了避免不必要的同步,請參上方
        if(instance == null) {
            synchronized (DoubleCheckLock.class) {  //對 class 進行 synchronized

                if(instance == null) {
                    instance = new DoubleCheckLock();
                }
            }
        }
        return instance;
    }

}
