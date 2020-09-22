package Prototype1;

/*
 Author: Joey
 Data: 20/09/22
 Explanation:
   1. Website: https://ithelp.ithome.com.tw/articles/10205989
   2. Prototype.java - 介面，包含一個clone的function，可由此函數式從一個物件建立另一個物件。
   3. Sensor.java - 繼承 Prototype.java, 並 Override clone
   4. MainActivityPresenter.java > public void execPrototype1() , 真正運作,先建立第0台,然後複製5000台,再修改每台的ID

   也學習: Java clone的使用
 */

public abstract class Prototype implements Cloneable{
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
