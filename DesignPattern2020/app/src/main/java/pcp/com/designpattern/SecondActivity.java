package pcp.com.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements SecondActivityContract.View {
    private static final String TAG = SecondActivity.class.getSimpleName();
    private SecondActivityContract.Presenter presenter;
    Button mbtnState1, mbtnMemento1, mbtnFlyweight1, mbtnComposite1, mbtnIterator1, mbtnBridge1;
    TextView mtvPrior, mtvNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findView();
        presenter = new SecondActivityPresenter(getApplicationContext(), this);

        presenter.init();
    }

    private void findView() {
        mbtnState1 = (Button) findViewById(R.id.btnState1);
        mbtnMemento1 = (Button) findViewById(R.id.btnMemento1);
        mbtnFlyweight1 = (Button) findViewById(R.id.btnFlyweight1);
        mbtnComposite1 = (Button) findViewById(R.id.btnComposite1);
        mbtnIterator1 = (Button) findViewById(R.id.btnIterator1);
        mbtnBridge1 = (Button) findViewById(R.id.btnBridge1);

        mtvPrior = (TextView) findViewById(R.id.tvPrior);
        mtvNext = (TextView) findViewById(R.id.tvNext);

        mtvPrior.setOnClickListener(new PriorTvOnClickListener());
        mtvNext.setOnClickListener(new NextTvOnClickListener());
        mbtnState1.setOnClickListener(new State1BtnOnClickListener());
        mbtnMemento1.setOnClickListener(new Memento1BtnOnClickListener());
        mbtnFlyweight1.setOnClickListener(new Flyweight1BtnOnClickListener());
        mbtnComposite1.setOnClickListener(new Composite1BtnOnClickListener());
        mbtnIterator1.setOnClickListener(new Iterator1BtnOnClickListener());
        mbtnBridge1.setOnClickListener(new Bridge1BtnOnClickListener());
    }

    @Override
    public void init() {

    }

    @Override
    public void showLog(String info) {
        Log.v(TAG, info);
    }

    private class PriorTvOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); //ok
            i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP); //Not lost signal, so add it
            i.setClass(SecondActivity.this, MainActivity.class); //OKab
            startActivity(i);
            finish();
        }
    }

    private class NextTvOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); //ok
            i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP); //Not lost signal, so add it
            i.setClass(SecondActivity.this, ThirdActivity.class); //OKab
            startActivity(i);
            finish();
        }
    }

    private class State1BtnOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            presenter.execState1();
        }
    }

    private class Memento1BtnOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            presenter.execMemento1();
        }
    }

    private class Flyweight1BtnOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            presenter.execFlyweight1();
        }
    }

    private class Composite1BtnOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            presenter.execComposite1();
        }
    }

    private class Iterator1BtnOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            presenter.execIterator1();
        }
    }

    private class Bridge1BtnOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            presenter.execBridge1();
        }
    }
}
