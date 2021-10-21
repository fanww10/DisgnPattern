package main.java.staticproxy;

/**
 * @author create by wwfan2
 * @data 2021/10/19 15:14
 * @description
 */

public class StaticProxyTest extends StaticProxy{
    public StaticProxyTest(ConcreteHelloWorld target) {
        super(target);
    }

    public static void main(String[] args) {
        StaticProxy test = new StaticProxy(new ConcreteHelloWorld());
        test.sayHello("小明");
    }
}
