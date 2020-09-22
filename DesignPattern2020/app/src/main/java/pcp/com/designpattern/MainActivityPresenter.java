package pcp.com.designpattern;

import android.content.Context;

import Adapter1.BlackMan;
import Adapter1.BlackmanTranslator;
import Adapter1.TaiwanMan;
import Builder1.MacBookSeller;
import Builder1.MacbookPro;
import Builder1.MacbookPro_2018;
import Prototype1.Sensor;
import Proxy1.EstateAgent;
import Proxy1.IBuyHouse;
import Proxy1.LittleEngineer;
import Strategy1.Calculator;

import static Strategy1.Calculator.DoType;

public class MainActivityPresenter implements MainActivityContract.Presenter {
    private MainActivityContract.View view;
    Context mContext;

    public MainActivityPresenter(Context context, MainActivityContract.View view) {
        mContext = context;
        this.view = view;
    }

    @Override
    public void init() {
        view.init();
    }

    @Override
    public void execStrategy1() {
        int iValue;
        Calculator mCalculator = new Calculator();
        mCalculator.setStrategy(DoType.ADD);
        iValue = mCalculator.execute(3, 10);
        view.showLog(String.format("Strategy1 3+10=%d", iValue));

        mCalculator.setStrategy(DoType.MINUS);
        iValue = mCalculator.execute(3, 10);
        view.showLog(String.format("Strategy1 3-10=%d", iValue));
    }

    @Override
    public void execBuilder1() {
        MacbookPro_2018 macbookPro_2018 = new MacbookPro_2018();
        MacBookSeller macBookSeller = new MacBookSeller(macbookPro_2018);

        //經銷商的固定規格
        MacbookPro myMacbook = macBookSeller.lowSpec();
        view.showLog(String.format("Builder low spec=%s", myMacbook.toString()));

        MacbookPro dreamMacbook = macbookPro_2018
                .buildCPU(new MacbookPro.Processor("2.9GHz 6 核心第八代 Intel Core i9 處理器"))
                .buildMemory(new MacbookPro.Memory(32))
                .buildGraphics(new MacbookPro.Graphics("Radeon Pro 560X 配備 4GB GDDR5 記憶體"))
                .buildStorage(new MacbookPro.Storage(4096))
                .buildKeyboard(new MacbookPro.Keyboard("英文"))
                .build();
        view.showLog(String.format("Builder dream spec=%s", dreamMacbook.toString()));
    }

    @Override
    public void execAdapter1() {
        BlackMan blackMan = new BlackMan("black", view);
        blackMan.helloEnglish();
        blackMan.selfIntroEnglish();

        TaiwanMan taiwanMan = new TaiwanMan(new BlackmanTranslator(blackMan.name, view));
        taiwanMan.hello();
        taiwanMan.selfIntro();
    }

    @Override
    public void execProxy1() {
        IBuyHouse littleEngineer = new LittleEngineer(view);
        IBuyHouse estateAgent = new EstateAgent(littleEngineer, view);
        estateAgent.findHouse();
        estateAgent.priceTooHigh();
        estateAgent.defendPrice();
        estateAgent.finish();
    }

    @Override
    public void execPrototype1() {
        Sensor[] sensors = new Sensor[5000];
        sensors[0] = new Sensor();
        sensors[0].setID(0);
        sensors[0].setName("Sensor第一版");
        sensors[0].setNickname("我的空氣探測器");
        sensors[0].setVersion("1.0.0");
        sensors[0].setWifiID("MYSENSORWIFIID1.0.0");
        sensors[0].setWifiPass("THISisWiFiPasssOuO");
        sensors[0].setData("None");

        for(int i = 1; i < 5000; i++) {
            try {
                sensors[i] = (Sensor)sensors[0].clone();
                sensors[i].setID(i);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }

        for(int i = 0; i < 5000; i=i+500) {
            view.showLog(String.format("Sensors id=%d", sensors[i].getID()));
        }
    }
}
