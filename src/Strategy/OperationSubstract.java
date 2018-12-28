package Strategy;

/**
 * @Title: OperationSubstract
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/28 11:01
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
