package Strategy;

/**
 * @Title: OperationAdd
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/28 10:58
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
