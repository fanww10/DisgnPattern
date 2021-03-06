package main.java.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author create by wwfan2
 * @data 2021/4/28 16:23
 * @description 访问者模式
 */

public class VisitorPattern {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor = new VisitorA();
        os.accept(visitor);
        System.out.println("------------------------");
        visitor = new VisitorB();
        os.accept(visitor);
    }
}
interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}

class VisitorA implements Visitor {

    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("VisitorA->" + element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("VisitorA-> " + element.operationB());
    }
}

class VisitorB implements Visitor{
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("VisitorB->" + element.operationA());

    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("VisitorB-> " + element.operationB());

    }
}

interface Element {
    void accept(Visitor visitor);
}

class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA(){
        return "OperationA";
    }
}

class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationB(){
        return "OperationB";
    }
}
class ObjectStructure {
    private List<Element> list = new ArrayList<Element>();
    public void accept(Visitor visitor) {
        for (Element element : list) {
            element.accept(visitor);
        }
    }
    public void add(Element element) {
        list.add(element);
    }
    public void remove(Element element) {
        list.remove(element);
    }
}