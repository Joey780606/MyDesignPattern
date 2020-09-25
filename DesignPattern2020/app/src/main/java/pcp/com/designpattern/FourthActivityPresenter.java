package pcp.com.designpattern;

import android.content.Context;

public class FourthActivityPresenter implements FourthActivityContract.Presenter {
    private FourthActivityContract.View view;
    Context mContext;

    public FourthActivityPresenter(Context context, FourthActivityContract.View view) {
        mContext = context;
        this.view = view;
    }

    @Override
    public void init() {
        view.init();
    }

}
