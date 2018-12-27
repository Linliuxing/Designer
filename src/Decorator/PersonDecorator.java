package Decorator;

/**
 * @Title: PersonDecorator
 * @Description: Person接口的抽象装饰类
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/27 9:29
 */
public class PersonDecorator implements Person {

    protected Person decoratedPerson;

    public PersonDecorator(Person decoratedPerson){
        this.decoratedPerson = decoratedPerson;
    }

    @Override
    public void speak() {
        decoratedPerson.speak();
    }
}
