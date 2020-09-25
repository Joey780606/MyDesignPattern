package pcp.com.designpattern;

public class FourthActivityContract {
    public interface View {
        void init();
        void showLog(String info);
    }

    interface Presenter {
        void init();
    }
}
