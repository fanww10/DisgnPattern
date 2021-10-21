package main.java.decorator;


public class DecoratorTest {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();

        Component q = new ConcreteDecorator(p);
        q.operation();
    }

}

interface Component{
    public void operation();
}
class ConcreteComponent implements Component{
    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
class Decorator implements Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
class ConcreteDecorator extends Decorator{


    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addFunction();
    }

    private void addFunction() {
        System.out.println("添加的功能");
    }
}

