package Strategy;

/**
 * @Title: Context
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/28 11:04
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }

}
