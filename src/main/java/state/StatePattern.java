package main.java.state;

import java.awt.*;

/**
 * @author create by wwfan2
 * @data 2021/1/6 15:53
 * @description
 */

public class StatePattern {
    public static void main(String[] args) {
        Context context = new Context();
        context.handle();
        context.handle();
        context.handle();
        context.handle();

    }
}
//环境类
class Context{
    private State state;

    public Context() {
        this.state = new ConcreteStateA();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle(){
        state.handle(this);
    }
}
//抽象状态：定义一个接口，用以封装环境对象中的特定状态所对应的行为，可以有一个或多个行为。
abstract class State{
    public abstract void handle(Context context);
}
//具体状态A类
class ConcreteStateA extends State{

    @Override
    public void handle(Context context) {
        System.out.println("当前状态A");
        context.setState(new ConcreteStateB());
    }
}
//具体状态B类
class ConcreteStateB extends State{
    @Override
    public void handle(Context context) {
        System.out.println("当前状态B");
        context.setState(new ConcreteStateA());
    }
}


