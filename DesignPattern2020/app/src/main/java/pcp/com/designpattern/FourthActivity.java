package pcp.com.designpattern;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity implements FourthActivityContract.View {
    private static final String TAG = FourthActivity.class.getSimpleName();
    private FourthActivityContract.Presenter presenter;
    TextView mtvPrior, mtvNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        findView();
        presenter = new FourthActivityPresenter(getApplicationContext(), this);

        presenter.init();
    }

    @Override
    public void init() {

    }

    @Override
    public void showLog(String info) {
        Log.v(TAG, info);
    }

    private void findView() {
        mtvPrior = (TextView) findViewById(R.id.tvPrior);
        mtvNext = (TextView) findViewById(R.id.tvNext);

        mtvPrior.setOnClickListener(new PriorTvOnClickListener());
        mtvNext.setOnClickListener(new NextTvOnClickListener());
    }

    private class PriorTvOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            i.setClass(FourthActivity.this, ThirdActivity.class); //OKab
            startActivity(i);
            finish();
        }
    }

    private class NextTvOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            i.setClass(FourthActivity.this, MainActivity.class); //OKab
            startActivity(i);
            finish();
        }
    }
}
