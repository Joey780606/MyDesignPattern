package pcp.com.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {
    private static final String TAG = MainActivity.class.getSimpleName();
    private MainActivityContract.Presenter presenter;

    Button mbtnStrategy1, mbtnBuilder1, mbtnAdatper1, mbtnProxy1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
        presenter = new MainActivityPresenter(getApplicationContext(), this);

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
        mbtnStrategy1 = (Button) findViewById(R.id.btnStrategy1);
        mbtnBuilder1 = (Button) findViewById(R.id.btnBuilder1);
        mbtnAdatper1 = (Button) findViewById(R.id.btnAdatper1);
        mbtnProxy1 = (Button) findViewById(R.id.btnProxy1);

        mbtnStrategy1.setOnClickListener(new Strategy1BtnOnClickListener());
        mbtnBuilder1.setOnClickListener(new Builder1BtnOnClickListener());
        mbtnAdatper1.setOnClickListener(new Adatper1BtnOnClickListener());
        mbtnProxy1.setOnClickListener(new Proxy1BtnOnClickListener());
//        mbtnStrategy.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }

    private class Strategy1BtnOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            presenter.execStrategy1();
        }
    }

    private class Builder1BtnOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            presenter.execBuilder1();
        }
    }

    private class Adatper1BtnOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            presenter.execAdapter1();
        }
    }

    private class Proxy1BtnOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            presenter.execProxy1();
        }
    }
}
