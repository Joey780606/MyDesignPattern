package pcp.com.designpattern;

import android.content.Context;

import ChainOfResponsibility1.Handler;
import ChainOfResponsibility1.Manager;
import ChainOfResponsibility1.Trouble;
import Interpreter1.AbstractExpression;
import Interpreter1.BrowserContext;
import Interpreter1.NonterminalExpression;
import Interpreter1.TerminalExpression;
import Mediator1.Boss;
import Mediator1.PM;
import Mediator1.Programmer;


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

    @Override
    public void execMediator1() {
        // 無名的Boss
        Boss boss = new Boss(view);

        // 各個員工
        PM wei = new PM("小偉", view);
        Programmer bad = new Programmer("小惡", view);
        Programmer good = new Programmer("阿仁", view);

        // 把員工加入Boss下面管理
        boss.addMember(wei);
        boss.addMember(bad);
        boss.addMember(good);

        // Boss介紹新來的小惡
        boss.introduce(bad);

        //阿仁自己工作
        good.work();

        // boss請大家專心工作
        boss.workHard();

        // 小惡自己做不來
        // PM請老闆幫忙
        wei.bossHelp(bad);
    }

    @Override
    public void execInterpreter1() {
        BrowserContext context = new BrowserContext();

        // 先用語法分析器，將詞句分類，選擇要用哪種解釋器解釋。

        /**
         * 做了各種分類
         */

        // 兩種解釋器
        AbstractExpression nonterminal = new NonterminalExpression(view);   //宣告變數型態是 宣告父類別, 但 new 子類別
        AbstractExpression terminal = new TerminalExpression(view); //宣告變數型態是 宣告父類別, 但 new 子類別

        /**
         *不同的詞句要對應到對的解釋器
         */

        // 終端的丟進終端解釋
        terminal.interpret(context);  //這樣就能達成雖然是同一類型變數,但是執行後的值卻不一樣

        // 非終端的丟進非終端解釋
        nonterminal.interpret(context);
    }

}
