package pcp.com.designpattern;

public class ThirdActivityContract {
    public interface View {
        void init();
        void showLog(String info);
    }

    interface Presenter {
        void init();
        void execChainResponsibility1();
        void execMediator1();
        void execInterpreter1();
        void execVisitor1();
        void execAbstractFactory1();
        void execSingleton1();
    }
}
