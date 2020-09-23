package Memento1;

/*
 Author: Joey
 Data: 20/09/23
 Explanation: 總介紹在 ComputerMemento.java
   參考: https://ithelp.ithome.com.tw/articles/10206939
   1. ComputerMemento.java 存放現在電腦資訊 (即一筆資料)
   2. ComputerOriginator.java 產生備忘錄的類別 (可以 儲存/回存/取得資料)
   3. ComputerCareTaker.java 存放這些資訊的類別(儲存區,可 取/save)
   4. SecondActivityPresenter.java  > execMemento1 實作
 */

public class ComputerMemento {
    String system;
    String hardDisk;
    String userDoc;
    String userApp;

    public ComputerMemento(String system, String hardDisk, String userDoc, String userApp) {
        this.system = system;
        this.hardDisk = hardDisk;
        this.userDoc = userDoc;
        this.userApp = userApp;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardisk) {
        this.hardDisk = hardisk;
    }

    public String getUserDoc() {
        return userDoc;
    }

    public void setUserDoc(String userDoc) {
        this.userDoc = userDoc;
    }

    public String getUserApp() {
        return userApp;
    }

    public void setUserApp(String userApp) {
        this.userApp = userApp;
    }
}
