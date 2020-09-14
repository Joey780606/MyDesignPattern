package Builder1;

/*
 Author: Joey
 Data: 20/09/10
 Explanation: 總描述在 MacbookPro
   此為 abstract class, 應還有concrete class是以此class為主
 */

public abstract class MacbookProBuilder {
    // 是 abstract class,所以可當一個樣板,所有繼承他的class (又稱Concreate class)都可以再針對此class做修改
    protected MacbookPro macbookPro;

    MacbookProBuilder() {
        macbookPro = new MacbookPro();
    }

    // 下面這幾個,在Concrete class繼承它後,以下五個funcion就會要求要列上
    public abstract MacbookProBuilder buildCPU(MacbookPro.Processor processor);    // abstract, 裡面不寫code, 由 Concrete class 來繼續做
    public abstract MacbookProBuilder buildMemory(MacbookPro.Memory size);
    public abstract MacbookProBuilder buildGraphics(MacbookPro.Graphics name);
    public abstract MacbookProBuilder buildStorage(MacbookPro.Storage size);
    public abstract MacbookProBuilder buildKeyboard(MacbookPro.Keyboard language);

    public MacbookPro build() {
        return macbookPro;
    }
}
