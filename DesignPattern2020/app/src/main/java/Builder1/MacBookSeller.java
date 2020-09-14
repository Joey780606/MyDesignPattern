package Builder1;

/*
 Author: Joey
 Data: 20/09/10
 Explanation: 總描述在 MacbookPro
   此應為 Director(指揮者),由指揮者控制建造者,來建立產品
 */

public class MacBookSeller {
    private MacbookProBuilder macbookProBuilder;    //以 abstract class 來操作

    public MacBookSeller(MacbookProBuilder macbookProBuilder) {
        this.macbookProBuilder = macbookProBuilder;
    }

    public MacbookPro lowSpec() {
        return macbookProBuilder
                .buildCPU(new MacbookPro.Processor("2.2GHz 6 核心第八代 Intel Core i7 處理器"))
                .buildMemory(new MacbookPro.Memory(16))
                .buildGraphics(new MacbookPro.Graphics("Radeon Pro 555X 配備 4GB GDDR5 記憶體"))
                .buildStorage(new MacbookPro.Storage(256))
                .buildKeyboard(new MacbookPro.Keyboard("中文注音"))
                .build();

    }

    public MacbookPro highSpec() {
        return macbookProBuilder
                .buildCPU(new MacbookPro.Processor("2.6GHz 6 核心第八代 Intel Core i7 處理器"))
                .buildMemory(new MacbookPro.Memory(16))
                .buildGraphics(new MacbookPro.Graphics("Radeon Pro 560X 配備 4GB GDDR5 記憶體"))
                .buildStorage(new MacbookPro.Storage(512))
                .buildKeyboard(new MacbookPro.Keyboard("中文注音"))
                .build();
    }
}
