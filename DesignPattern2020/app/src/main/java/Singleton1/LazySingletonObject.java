package Singleton1;

/*
 Author: Joey
 Data: 20/09/29
 Explanation: 懶散單例模式 : 在呼叫getInstance時才進行初始化
    但是這個實現方式每次都需要進行同步(synchronized)，效率會很很低。
 */

public class LazySingletonObject {
    private static LazySingletonObject instance;

    //私有的建構式讓別人不能創造
    private LazySingletonObject() {}

    //因為整個系統都要存取這個類別，很可能有多個process或thread同時存取
    //為了讓線程安全添加synchronized在多線程下確保物件唯一性
    public static synchronized LazySingletonObject getInstance() {
        if(instance == null) {
            instance = new LazySingletonObject();
        }
        return instance;
    }
}
