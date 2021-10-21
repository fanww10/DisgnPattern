package main.java.chainofresponsibility;

/**
 * @author create by wwfan2
 * @data 2021/1/6 15:24
 * @description 责任链模式:以链表的形式实现责任链模式的数据结构
 */

public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandlerA();
        Handler handler2 = new ConcreteHandlerB();
        Handler handler3 = new ConcreteHandlerC();
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        handler3.setNext(handler1);
        handler3.handleRequest("two");
    }
}
//抽象处理者
abstract class Handler{
    private Handler next;
    public void setNext(Handler next){
        this.next = next;
    }
    public Handler getNext(){
        return next;
    }
    public abstract void handleRequest(String request);
}
class ConcreteHandlerA extends Handler{

    @Override
    public void handleRequest(String request) {
        if (request.equals("one")) {
            System.out.println("具体处理者A负责处理该请求！");
        }else {
            if (getNext() != null){
                getNext().handleRequest(request);
            }else {
                System.out.println("nobody solute this request !");
            }
        }
    }
}

class ConcreteHandlerB extends Handler{

    @Override
    public void handleRequest(String request) {
        if (request.equals("two")) {
            System.out.println("具体处理者B负责处理该请求！");
        }else {
            if (getNext() != null){
                getNext().handleRequest(request);
            }else {
                System.out.println("nobody solute this request !");
            }
        }
    }
}
class ConcreteHandlerC extends Handler{

    @Override
    public void handleRequest(String request) {
        if (request.equals("three")) {
            System.out.println("具体处理者C负责处理该请求！");
        }else {
            if (getNext() != null){
                getNext().handleRequest(request);
            }else {
                System.out.println("nobody solute this request !");
            }
        }
    }
}


