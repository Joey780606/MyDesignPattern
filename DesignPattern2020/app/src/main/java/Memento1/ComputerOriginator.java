package Memento1;

/*
 Author: Joey
 Data: 20/09/23
 Explanation: 總介紹在 ComputerMemento.java
   ComputerOriginator.java 產生備忘錄的類別 (可以 儲存/回存/取得資料)
 */

public class ComputerOriginator {
    private String system = "macOS";
    private String hardDisk = "ssd";
    private String userDoc = "desk";
    private String userApp = "pages,numbers...";

    public ComputerMemento save(){
        return new ComputerMemento(system,hardDisk,userDoc,userApp);
    }

    public void restore(ComputerMemento memento){
        this.hardDisk = memento.getHardDisk();
        this.system = memento.getSystem();
        this.userApp = memento.getUserApp();
        this.userDoc = memento.getUserDoc();
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

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
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
