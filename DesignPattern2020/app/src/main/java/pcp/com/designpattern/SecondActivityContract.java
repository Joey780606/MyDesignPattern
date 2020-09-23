package pcp.com.designpattern;

public class SecondActivityContract {
    public interface View {
        void init();
        void showLog(String info);
    }

    interface Presenter {
        void init();
        void execState1();
    }
}
