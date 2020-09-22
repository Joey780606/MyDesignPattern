package Prototype1;

/*
 Author: Joey
 Data: 20/09/22
 Explanation:
   1. 主說明在 Prototype.java , Sensor.java 是繼承 Prototype.java, 並 Override clone
 */

public class Sensor extends Prototype {
    // 這時不會主動跳出要叫你顯示 clone的 @override,有可能是因為 Prototype 是 class, 不是 interface, 也不是 implement interface的情況
    // 所以不會主動跳出,而是有需要時可以自己擴增 (有點像 Activity要自行 @override onResume() 的樣子)
    private int ID;

    private String name;
    private String nickname;

    private String version;
    private String wifiID;
    private String wifiPass;

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getWifiID() {
        return wifiID;
    }

    public void setWifiID(String wifiID) {
        this.wifiID = wifiID;
    }

    public String getWifiPass() {
        return wifiPass;
    }

    public void setWifiPass(String wifiPass) {
        this.wifiPass = wifiPass;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Sensor)super.clone();   //這裡有加上 (Sensor)
    }
}
