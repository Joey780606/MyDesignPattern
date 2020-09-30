package Builder1;

/*
 Author: Joey
 Data: 20/09/10
 Explanation:
   1. Website: https://ithelp.ithome.com.tw/articles/10204732
   2. MacbookPro.java , Product (UML的 Product)
      MacbookProBuilder.java , Builder (abstract class)  (UML的 Builder, 此時就跟 MacbookPro class產生依賴)
      MacbookPro_2018.java, 此為 MacbookProBuilder 這個 abstract class 的 concrete class,實作詳細功能  (UML的 Concrete builder)
      MacBookSeller.java, 此應為 Director(指揮者),由指揮者控制建造者,來建立產品
      MainActivityPresenter.java, 實作
 */
public class MacbookPro {
    private Processor processor;    //下面會定義
    private Memory memory;      //同上
    private Storage storage;    //同上
    private Graphics graphics;  //同上
    private Keyboard keyboard;  //同上

    MacbookPro() {}

    // 以下是將上方的變數,使用set 放進去
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    // 以下是將上方的變數,使用get 取內容值
    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    // 這裡不需要 @Override
    public String toString() {
        return "{ Macbook : " + "\n" +
                "Processor : " + this.getProcessor().name + "\n" +
                "Memory size : " + this.getMemory().size + "GB" + "\n" +
                "Graphics : " + this.getGraphics().name + "\n" +
                "Storage size : " + this.getStorage().size + "GB" +"\n" +
                "Keyboard language : "+ this.getKeyboard().language +
                " }";
    }

    // 以下是五項元件的 class
    public static class Processor {     //要注意 static
        String name;
        public Processor(String name) { //這要改成public
            this.name = name;
        }
    }

    public static class Memory {     //要注意 static
        int size;
        public Memory(int size) {
            this.size = size;
        }
    }

    public static class Graphics {     //要注意 static
        String name;
        public Graphics(String name) {
            this.name = name;
        }
    }

    public static class Storage {     //要注意 static
        int size;
        public Storage(int size) {
            this.size = size;
        }
    }

    public static class Keyboard {     //要注意 static
        String language;
        public Keyboard(String language) {
            this.language = language;
        }
    }
}
