package pcp.com.designpattern;

import android.content.Context;

import ChainOfResponsibility1.Handler;
import ChainOfResponsibility1.Manager;
import ChainOfResponsibility1.Trouble;


public class ThirdActivityPresenter implements ThirdActivityContract.Presenter {
    private ThirdActivityContract.View view;
    Context mContext;

    public ThirdActivityPresenter(Context context, ThirdActivityContract.View view) {
        mContext = context;
        this.view = view;
    }

    @Override
    public void init() {
        view.init();
    }

    @Override
    public void execChainResponsibility1() {
        Handler manager = new Manager(view);

        Trouble smallTrouble = new Trouble("想加薪500", 500);
        manager.handleRequest(smallTrouble);

        Trouble bigTrouble = new Trouble("搞壞五十萬的機器",500000);
        manager.handleRequest(bigTrouble);
    }

}
