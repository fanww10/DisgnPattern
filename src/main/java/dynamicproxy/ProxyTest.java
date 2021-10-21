package main.java.dynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        CustomInvocationHandler handler = new CustomInvocationHandler(new ConcreteHelloWorld());
        HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance(handler.getClass().getClassLoader(), new Class[]{HelloWorld.class},handler);
        proxy.sayHello("Mike");

        Class helloProxyClazz = Proxy.getProxyClass(ConcreteHelloWorld.class.getClassLoader(), HelloWorld.class);


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

class CustomInvocationHandler implements InvocationHandler {
    private Object target;

    public CustomInvocationHandler(Object target) {
        this.target = target;
    }
    /*
    * @proxy 代理类的真实代理对象
    * @method 调用某个对象真实的方法的method对象
    * @args 指代理对象传递的参数
    * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invocation");
        Object retVal = method.invoke(target,args);
        System.out.println("After invocation");
        return retVal;
    }
}
