package Flyweight1;

import androidx.annotation.NonNull;

/*
 Author: Joey
 Data: 20/09/23
 Explanation: 總介紹在 Macbook.java
   CustomSetting - 儲存一些使用者設定的類別,像 Macbook 可選較低等級,也可以選較高等級,同樣也可以自由選擇cpu, hd, memory的等級
 */

public class CustomSetting {
    //儲存一些使用者設定的類別

    public static CustomSetting LOW = new CustomSetting("LOW"); //從文件來看是要 static
    public static CustomSetting HIGH = new CustomSetting("HIGH");

    private String cpu;
    private int memory;
    private int storage;

    public CustomSetting() {}

    private CustomSetting(String set) {
        switch (set) {
            case "LOW":
                // 一些低階設定
                cpu = "i5";
                memory = 8;
                storage = 256;
                break;
            case "HIGH":
                // 一些高階設定
                cpu = "i7";
                memory = 16;
                storage = 256;
                break;
        }
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    // 這是 Object 就有的method,可按 Code > Override methods ... 就可加入
    @NonNull
    @Override
    public String toString() {
        return "CustomSetting = { " + "\n" +
                "cpu = " + this.getCpu() + "\n" +
                "memory = " + this.getMemory() + "\n" +
                "storage = " + this.getStorage() + "\n" +
                "}";
    }
}
