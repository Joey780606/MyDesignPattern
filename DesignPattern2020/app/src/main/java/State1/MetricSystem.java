package State1;

import pcp.com.designpattern.SecondActivityContract;

public class MetricSystem {
    private SecondActivityContract.View view;
    private State state;

    public MetricSystem(SecondActivityContract.View view) {
        this.view = view;
    }

    public void setState(final State state) {
        this.state = state;
    }

    public void tempView(Double temp) {  //顯示 temp
        view.showLog(state.tempToDisplay(temp));
    }

    public void vibView(Double vib) { //顯示 vibrator
        view.showLog(state.vibToDisplay(vib));
    }

    public void tempSave(Double temp) {  //儲存 temp
        view.showLog(state.tempToSave(temp));
    }

    public void vibSave(Double vib) { //儲存 vibrator
        view.showLog(state.vibToSave(vib));
    }
}
