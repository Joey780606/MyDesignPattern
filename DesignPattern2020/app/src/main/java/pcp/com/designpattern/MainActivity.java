package pcp.com.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {
    private static final String TAG = MainActivity.class.getSimpleName();
    private MainActivityContract.Presenter presenter;

    Button mbtnStrategy1, mbtnBuilder1, mbtnAdatper1, mbtnProxy1, mbtnPrototype1, mbtnFacade1;
    TextView mtvNext;

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
        mbtnPrototype1 = (Button) findViewById(R.id.btnPrototype1);
        mbtnFacade1 = (Button) findViewById(R.id.btnFacade1);
        mtvNext = (TextView) findViewById(R.id.tvNext);

        mbtnStrategy1.setOnClickListener(new Strategy1BtnOnClickListener());
        mbtnBuilder1.setOnClickListener(new Builder1BtnOnClickListener());
        mbtnAdatper1.setOnClickListener(new Adatper1BtnOnClickListener());
        mbtnProxy1.setOnClickListener(new Proxy1BtnOnClickListener());
        mbtnPrototype1.setOnClickListener(new Prototype1BtnOnClickListener());
        mbtnFacade1.setOnClickListener(new Facade1BtnOnClickListener());
        mtvNext.setOnClickListener(new NextTvOnClickListener());
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

    private class Prototype1BtnOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            presenter.execPrototype1();
        }
    }

    private class Facade1BtnOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            presenter.execFacade1();
        }
    }

    private class NextTvOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(MainActivity.this, SecondActivity.class); //OKab
            startActivity(i);
        }
    }
}
