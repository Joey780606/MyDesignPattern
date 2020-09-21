package Proxy1;

import pcp.com.designpattern.MainActivityContract;

/*
 Author: Joey
 Data: 20/09/21
 Explanation: 真正要買房的人
 */


public class LittleEngineer implements IBuyHouse {
    MainActivityContract.View view;

    public LittleEngineer(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void findHouse() {
        view.showLog("民生社區機能特好！當然找那邊的房子！");
    }

    @Override
    public void priceTooHigh() {
        view.showLog("現在台灣薪水那麼低，屋主開那麼高賣不掉啦！");
    }

    @Override
    public void defendPrice() {
        // 向屋主反應說房價太貴,看能否再算便宜一點
        view.showLog("未來人口越來越少，我們也是自住而已！打我五折吧！");
    }

    @Override
    public void finish() {
        view.showLog("辛苦還房貸幾十年");
    }
}
