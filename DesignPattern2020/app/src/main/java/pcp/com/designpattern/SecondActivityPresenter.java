package pcp.com.designpattern;

import android.content.Context;

import Adapter1.BlackMan;
import Adapter1.BlackmanTranslator;
import Adapter1.TaiwanMan;
import Builder1.MacBookSeller;
import Builder1.MacbookPro;
import Builder1.MacbookPro_2018;
import Facade1.Facade;
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

}
