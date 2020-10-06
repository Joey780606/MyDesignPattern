package Singleton1;

/*
 Author: Joey
 Data: 20/09/29
 Explanation: 靜態內部類實現
   可以確保線程安全，保證物件唯一性，並且延遲實例化，所以推薦使用。
  */


public class StaticInnerClass {
    private StaticInnerClass() {
    }

    public static StaticInnerClass getInstance() {
        return StaticInnerClassHolder.instance;
    }

    // 靜態的內部類別
    private static class StaticInnerClassHolder {
        private static StaticInnerClass instance = new StaticInnerClass();
    }
}
