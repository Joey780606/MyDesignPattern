package pcp.com.designpattern;

import android.content.Context;

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

}
