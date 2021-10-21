package main.java.staticproxy;

import javax.swing.tree.TreeNode;
import java.util.Stack;

/**
 * @author create by wwfan2
 * @data 2021/10/19 15:07
 * @description 静态代理
 */

public class StaticProxy {
    private ConcreteHelloWorld target;
    public StaticProxy( ConcreteHelloWorld target) {
        this.target = target;
    }
    public void sayHello(String name) {
        System.out.println("打印前");
        target.sayHello(name);
        System.out.println("打印后");
    }
}

interface HelloWorld {
    void sayHello(String name);
}

class ConcreteHelloWorld implements HelloWorld {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}

