package main.java;

import java.security.acl.Permission;

/**
 * @author create by wwfan2
 * @data 2021/4/28 17:19
 * @description
 */

public class FactoryPattern {
    public static void main(String[] args) {

    }

}
interface Product {
    void show();
}

class ProductA implements Product {

    @Override
    public void show() {
        System.out.print("show ProductA!");
    }
}

class ProductB implements Product {

    @Override
    public void show() {
        System.out.println("show ProductB!");
    }
}

class Constants {
    static final int PRODUCT_A = 0;
    static final int PRODUCT_B = 1;
    static final int PRODUCT_C = 2;
}

class SimpleFactory {
    public static Product makeProduct(int kind) {
        switch (kind) {
            case Constants.PRODUCT_A:
                return new ProductA();
            case Constants.PRODUCT_B:
                return new ProductB();
        }
        return null;
    }
}