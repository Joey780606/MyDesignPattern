package Proxy1;

import pcp.com.designpattern.MainActivityContract;

public class EstateAgent implements IBuyHouse {
    private IBuyHouse iBuyHouse;
    private MainActivityContract.View view;

    public EstateAgent(IBuyHouse iBuyHouse, MainActivityContract.View view) {
        this.iBuyHouse = iBuyHouse;
        this.view = view;
    }

    @Override
    public void findHouse() {
        iBuyHouse.findHouse();
        view.showLog("#房仲幫忙找房子");
    }

    @Override
    public void priceTooHigh() {
        iBuyHouse.priceTooHigh();
        view.showLog("#房仲幫忙喬價錢");
    }

    @Override
    public void defendPrice() {
        iBuyHouse.defendPrice();
        view.showLog("#房仲強力幫客戶喬價錢");
    }

    @Override
    public void finish() {
        view.showLog("#成交的話房仲幫忙付訂、簽約、用印、完稅、交屋");
        iBuyHouse.finish();
    }
}
