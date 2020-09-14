package pcp.com.designpattern;

public class MainActivityContract {
    interface View {
        void init();
        void showLog(String info);
    }

    interface Presenter {
        void init();
        void execStrategy1();
        void execBuilder1();
    }
}
