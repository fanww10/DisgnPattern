package main.java.listener;

/**
 * @author create by wwfan2
 * @data 2021/10/21 10:46
 * @description
 */

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.registerListener(new PersonListener() {
            @Override
            public void onClick() {
                System.out.println("点击了");
            }
        });
        person.onClick();
    }
}
