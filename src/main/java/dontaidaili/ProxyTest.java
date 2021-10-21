package main.java.dontaidaili;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;



public class ProxyTest {
    public static void main(String[] args) throws Throwable {
        Class calculatorProxyClazz = Proxy.getProxyClass(Calculator.class.getClassLoader(), Calculator.class);
        Constructor constructor = calculatorProxyClazz.getConstructor(InvocationHandler.class);
        Calculator calculatorProxyImpl = (Calculator) constructor.newInstance(new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });

    }
}

interface Calculator {
    void add(int a, int b);
}



