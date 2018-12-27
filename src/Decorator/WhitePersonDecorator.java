package Decorator;

/**
 * @Title: WhitePersonDecorator
 * @Description: 扩展PersonDecorator
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/27 9:33
 */
public class WhitePersonDecorator extends PersonDecorator{

    public WhitePersonDecorator(Person decoratedPerson){
        super(decoratedPerson);
    }

    @Override
    public void speak() {
        super.speak();
        whitePerson(decoratedPerson);
    }

    //扩展方法
    private void whitePerson(Person decoratedPerson){
        System.out.println("I am whitePerson");
    }

}
