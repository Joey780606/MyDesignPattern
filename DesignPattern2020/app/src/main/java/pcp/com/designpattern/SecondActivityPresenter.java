package pcp.com.designpattern;

import android.content.Context;

import Adapter1.BlackMan;
import Adapter1.BlackmanTranslator;
import Adapter1.TaiwanMan;
import Builder1.MacBookSeller;
import Builder1.MacbookPro;
import Builder1.MacbookPro_2018;
import Composite1.Component;
import Composite1.Composite;
import Composite1.Leaf;
import Facade1.Facade;
import Flyweight1.CustomSetting;
import Flyweight1.Macbook;
import Flyweight1.MacbookFactory;
import Memento1.ComputerCareTaker;
import Memento1.ComputerOriginator;
import Prototype1.Sensor;
import Proxy1.EstateAgent;
import Proxy1.IBuyHouse;
import Proxy1.LittleEngineer;
import State1.British;
import State1.Metric;
import State1.MetricSystem;
import Strategy1.Calculator;

import static Strategy1.Calculator.DoType;

public class SecondActivityPresenter implements SecondActivityContract.Presenter {
    private SecondActivityContract.View view;
    Context mContext;

    public SecondActivityPresenter(Context context, SecondActivityContract.View view) {
        mContext = context;
        this.view = view;
    }

    @Override
    public void init() {
        view.init();
    }

    @Override
    public void execState1() {
        MetricSystem metricSystem = new MetricSystem(view); //建立 Context
        metricSystem.setState(new Metric(view)); //建立公制

        metricSystem.tempView(50d); //d 表示 double
        metricSystem.vibView(10d);
        metricSystem.tempSave(50d);
        metricSystem.vibSave(10d);

        metricSystem.setState(new British(view));
        metricSystem.tempView(50d); //d 表示 double
        metricSystem.vibView(10d);
        metricSystem.tempSave(50d);
        metricSystem.vibSave(10d);

    }

    @Override
    public void execMemento1() {
        ComputerCareTaker careTaker = new ComputerCareTaker();  //先建立儲存區
        ComputerOriginator originator = new ComputerOriginator(); //先建立一筆資料
        careTaker.saveMemento(originator.save());
        //originator先建立一個預設資料 macOS 的備忘錄(即ComputerMemento型態)後, careTaker再將該備忘錄(ComputerMemento型態)存入
        view.showLog(careTaker.getSave(0).getSystem());

        originator.setSystem("windows");    //將原資料系統改成 windows
        careTaker.saveMemento(originator.save());  //這裡注意, originator.save()是有新建(new)一個 ComputerMemento 的元件
        view.showLog(careTaker.getSave(1).getSystem());
    }

    @Override
    public void execFlyweight1() {
        MacbookFactory factory = new MacbookFactory(view);  //先建立工廠
        Macbook goodbook = factory.getMacbook(Macbook.Spec.HIGH);
        view.showLog(goodbook.toString());

        CustomSetting superSetting = new CustomSetting();
        superSetting.setCpu("i9");
        superSetting.setMemory(32);
        superSetting.setStorage(1024);

        Macbook superMacbook = factory.getCustomMacbook(superSetting);
        view.showLog(superMacbook.toString());

        Macbook goodbook2 = factory.getMacbook(Macbook.Spec.HIGH);
        view.showLog(goodbook2.toString());
    }

    @Override
    public void execComposite1() {
        // 先建立各部門,由大部門見到小部門
        Component big = new Composite("大公司", view);

        Component mid1 = new Composite("子公司1", view);
        Component mid2 = new Composite("子公司2", view);

        Component small1 = new Leaf("部門1", view);
        Component small2 = new Leaf("部門2", view);
        Component small3 = new Leaf("部門3", view);
        Component small4 = new Leaf("部門4", view);

        big.add(mid1);
        big.add(mid2);

        mid1.add(small1);
        mid1.add(small2);

        mid2.add(small3);
        mid2.add(small4);

        Component small5 = new Leaf("部門5", view);

        small1.add(small5);

        view.showLog("------- 大公司 -------");

        big.display(1);
        big.command("開發快一點");

        view.showLog("------- 大公司 -------");
        mid2.display(1);
        mid2.command("大老闆說Q4要完成");
    }

}
