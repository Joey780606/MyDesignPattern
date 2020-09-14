package Strategy1;

public class Calculator {
    private int now = 0;
    private IStrategy strategy;

    // Strategy mode
    public int execute(int a, int b) {
        return strategy.calculate(a, b);
    }

    public void reset() {
        this.now = 0;
    }

    // Simple factory mode
    public void setStrategy(DoType doType) {
        switch (doType) {
            case ADD:
                this.strategy = new add();
                break;

            case MINUS:
                this.strategy = new minus();
                break;

            case DIVIDE:
                this.strategy = new multiply();
                break;

            case MULTIPLY:
                this.strategy = new divide();
                break;

        }
    }

    public enum DoType {
        ADD, MINUS, DIVIDE, MULTIPLY
    }

}
