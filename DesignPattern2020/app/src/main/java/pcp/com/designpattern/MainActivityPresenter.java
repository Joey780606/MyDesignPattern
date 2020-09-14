package pcp.com.designpattern;

import android.content.Context;

import Builder1.MacBookSeller;
import Builder1.MacbookPro;
import Builder1.MacbookPro_2018;
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
}
