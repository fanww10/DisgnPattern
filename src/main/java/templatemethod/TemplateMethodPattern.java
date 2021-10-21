package main.java.templatemethod;

/**
 * @author create by wwfan2
 * @data 2021/1/6 11:18
 * @description 模板方法模式
 * 定义一个操作中的算法骨架(AbstractClass())，而将算法的一些步骤延迟到子类(ConcreteMethod())中，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤()。
 */

public class TemplateMethodPattern {
    public static void main(String[] args) {
        AbstractClass concreteMethod = new ConcreteMethod();
        concreteMethod.TemplateMethod();
    }
}
//抽象方法
abstract class AbstractClass {
    //模板方法
    public void TemplateMethod() {
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }
    //具体方法
    public void SpecificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }
    //抽象方法1
    public abstract void abstractMethod1();
    //抽象方法2
    public abstract void abstractMethod2();
}
class ConcreteMethod extends AbstractClass{

    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1 的实现被调用");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2 的实现被调用");
    }
}
