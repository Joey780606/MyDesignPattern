package Mediator1;

import java.util.ArrayList;
import java.util.List;

import pcp.com.designpattern.ThirdActivityContract;

/*
 Author: Joey
 Data: 20/09/26
 Explanation: 總介紹在 Company.java
   Boss.java - implements Company, 處理interface 的作業
 */
public class Boss implements Company {
    ThirdActivityContract.View view;
    List<CoWorker> coWorkers;

    public Boss(ThirdActivityContract.View view) {
        this.view = view;
        coWorkers = new ArrayList<>();
    }

    @Override
    public void addMember(CoWorker coWorker) {
        coWorkers.add(coWorker);
        coWorker.boss = this;
    }

    @Override
    public void introduce(CoWorker coWorker) {
        view.showLog("Boss:跟大家介紹這位是" + coWorker.name);
    }

    @Override
    public void workHard() {
        for(CoWorker worker: coWorkers) {
            view.showLog("Boss: " + worker.name + "認真點做啊！");
        }
    }

    @Override
    public void giveWork(CoWorker coWorker) {
        view.showLog("Boss: " + coWorker.name + "這個幫忙一下。");
    }
}
