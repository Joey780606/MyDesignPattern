package Builder1;

/*
 Author: Joey
 Data: 20/09/10
 Explanation: 總描述在 MacbookPro
   此為 MacbookProBuilder 這個 abstract class 的 concrete class,實作詳細功能
 */
public class MacbookPro_2018 extends MacbookProBuilder {
    public MacbookPro build() {    // 這和程式不同,沒有 @Override 的部分
        return super.build();
    }

    public MacbookPro_2018() {     //建構子,用super就表示以 MacbookProBuilder 為主
        super();
    }

    @Override
    public MacbookProBuilder buildCPU(MacbookPro.Processor processor) {
        this.macbookPro.setProcessor(processor);    // macbookPro 是父class MacbookProBuilder 的變數
        return this;
    }

    @Override
    public MacbookProBuilder buildMemory(MacbookPro.Memory size) {
        this.macbookPro.setMemory(size);
        return this;
    }

    @Override
    public MacbookProBuilder buildGraphics(MacbookPro.Graphics name) {
        this.macbookPro.setGraphics(name);
        return this;
    }

    @Override
    public MacbookProBuilder buildStorage(MacbookPro.Storage size) {
        this.macbookPro.setStorage(size);
        return this;
    }

    @Override
    public MacbookProBuilder buildKeyboard(MacbookPro.Keyboard language) {
        this.macbookPro.setKeyboard(language);
        return this;
    }
}
