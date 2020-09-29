package pcp.com.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity implements ThirdActivityContract.View {
    private static final String TAG = ThirdActivity.class.getSimpleName();
    private ThirdActivityContract.Presenter presenter;
    TextView mtvPrior, mtvNext;
    Button mbtnChainResponsibility, mbtnMediator1, mbtnInterpreter1, mbtnVisitor1, mbtnAbstractFactory1, mbtnSingleton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        findView();
        presenter = new ThirdActivityPresenter(getApplicationContext(), this);

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
        mbtnChainResponsibility = (Button) findViewById(R.id.btnChainResponsi1);
        mbtnMediator1 = (Button) findViewById(R.id.btnMediator1);
        mbtnInterpreter1 = (Button) findViewById(R.id.btnInterpreter1);
        mbtnVisitor1 = (Button) findViewById(R.id.btnVisitor1);
        mbtnAbstractFactory1 = (Button) findViewById(R.id.btnAbstractFactory1);
        mbtnSingleton1 =  (Button) findViewById(R.id.btnSingleton1);

        mtvPrior.setOnClickListener(new PriorTvOnClickListener());
        mtvNext.setOnClickListener(new NextTvOnClickListener());
        mbtnChainResponsibility.setOnClickListener(new ChainResponsibility1OnClickListener());
        mbtnMediator1.setOnClickListener(new Mediator1OnClickListener());
        mbtnInterpreter1.setOnClickListener(new Interpreter1OnClickListener());
        mbtnVisitor1.setOnClickListener(new Visitor1OnClickListener());
        mbtnAbstractFactory1.setOnClickListener(new AbstractFactory1OnClickListener());
        mbtnSingleton1.setOnClickListener(new Singleton1OnClickListener());
    }

    private class PriorTvOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            i.setClass(ThirdActivity.this, SecondActivity.class); //OKab
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
            i.setClass(ThirdActivity.this, FourthActivity.class); //OKab
            startActivity(i);
            finish();
        }
    }

    class ChainResponsibility1OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            presenter.execChainResponsibility1();
        }
    }

    class Mediator1OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            presenter.execMediator1();
        }
    }

    class Interpreter1OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            presenter.execInterpreter1();
        }
    }

    class Visitor1OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            presenter.execVisitor1();
        }
    }

    class AbstractFactory1OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            presenter.execAbstractFactory1();
        }
    }

    class Singleton1OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            presenter.execSingleton1();
        }
    }
}
