package pcp.com.designpattern;

public class MainActivityContract {
    public interface View {
        void init();
        void showLog(String info);
    }

    interface Presenter {
        void init();
        void execStrategy1();
        void execBuilder1();
        void execAdapter1();
    }
}
