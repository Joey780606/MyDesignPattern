package pcp.com.designpattern;

import android.content.Context;

import Adapter1.BlackMan;
import Adapter1.BlackmanTranslator;
import Adapter1.TaiwanMan;
import Builder1.MacBookSeller;
import Builder1.MacbookPro;
import Builder1.MacbookPro_2018;
import Facade1.Facade;
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

}
